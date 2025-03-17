package com.screenmatch.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.exception.FileWriteException;
import com.screenmatch.models.Title;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileWriter {
    private final Gson gson;

    public JsonFileWriter() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void write(List<Title> titles, String filename) {
        try (FileWriter writer = new FileWriter(new File(filename))) {
            writer.write(gson.toJson(titles));
        } catch (IOException e) {
            throw new FileWriteException("Error writing to JSON file: " + e.getMessage(), e);
        }
    }
}