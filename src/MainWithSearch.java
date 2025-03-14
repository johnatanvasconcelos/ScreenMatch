import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.models.OmdbTitle;
import com.screenmatch.models.Title;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!search.equalsIgnoreCase("sair")) {

            System.out.println("Digite o nome do filme: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=ca12fde4";

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);


                OmdbTitle newTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(newTitle);
                System.out.println("\n---------------------\n");

                Title myTitle = new Title(newTitle);
                System.out.println(myTitle);

                titles.add(myTitle);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } finally {
                System.out.println("Finalizando...");
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter(new File("titles.json"));
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Programa finalizado!");
    }
}
