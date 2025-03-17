package com.screenmatch.service;

import com.screenmatch.api.OmdbApiClient;
import com.screenmatch.models.Title;

public class TitleSearchService {
    private final OmdbApiClient apiClient;
    private final TitleConverter converter;
    private final String apiKey;

    public TitleSearchService(OmdbApiClient apiClient, TitleConverter converter, String apiKey) {
        this.apiClient = apiClient;
        this.converter = converter;
        this.apiKey = apiKey;
    }

    public Title searchAndConvert(String title) {
        String json = apiClient.fetchTitle(title, apiKey);
        return converter.convert(json);
    }
}