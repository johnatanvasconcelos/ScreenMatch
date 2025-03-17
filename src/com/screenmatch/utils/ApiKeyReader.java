package com.screenmatch.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApiKeyReader {

    public static String readApiKeyFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading API key from file: " + e.getMessage());
            return null; // Or throw an exception if you prefer
        }
    }
}