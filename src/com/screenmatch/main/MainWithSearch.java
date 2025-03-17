package com.screenmatch.main;

import com.screenmatch.api.OmdbApiClient;
import com.screenmatch.exception.ApiRequestException;
import com.screenmatch.exception.FileWriteException;
import com.screenmatch.exception.JsonConversionException;
import com.screenmatch.models.Title;
import com.screenmatch.service.TitleConverter;
import com.screenmatch.service.TitleSearchService;
import com.screenmatch.utils.ApiKeyReader;
import com.screenmatch.utils.JsonFileWriter;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        String apiKey = ApiKeyReader.readApiKeyFromFile("api.key");
        HttpClient client = HttpClient.newHttpClient();
        OmdbApiClient apiClient = new OmdbApiClient(client);
        TitleConverter converter = new TitleConverter();
        TitleSearchService searchService = new TitleSearchService(apiClient, converter, apiKey);
        JsonFileWriter fileWriter = new JsonFileWriter();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do filme: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Title myTitle = searchService.searchAndConvert(search);
                titles.add(myTitle);
                System.out.println(myTitle);
            } catch (ApiRequestException | JsonConversionException e) {
                System.err.println("Error: " + e.getMessage());
                if (e.getCause() != null) {
                    System.err.println("Cause: " + e.getCause().getMessage());
                }
            }
        }

        try {
            fileWriter.write(titles, "titles.json");
            System.out.println(titles);
            System.out.println("Programa finalizado!");
        } catch (FileWriteException e) {
            System.err.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Cause: " + e.getCause().getMessage());
            }
        }
    }
}