package com.screenmatch.api;

import com.screenmatch.exception.ApiRequestException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbApiClient {
    private final HttpClient client;

    public OmdbApiClient(HttpClient client) {
        this.client = HttpClient.newHttpClient();
    }

    public String fetchTitle(String title, String apiKey) {
        String url = "https://www.omdbapi.com/?t=" + title.replace(" ", "+") + "&apikey=" + apiKey;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new ApiRequestException("Error fetching data from OMDB API: " + e.getMessage(), e);
        }
    }
}
