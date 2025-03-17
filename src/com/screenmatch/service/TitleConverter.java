package com.screenmatch.service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.exception.JsonConversionException;
import com.screenmatch.models.OmdbTitle;
import com.screenmatch.models.Title;

public class TitleConverter {
    private final Gson gson;

    public TitleConverter() {
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }

    public Title convert(String json) {
        try {
            OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
            return new Title(omdbTitle);
        } catch (Exception e) {
            throw new JsonConversionException("Error converting JSON to Title: " + e.getMessage(), e);
        }
    }
}
