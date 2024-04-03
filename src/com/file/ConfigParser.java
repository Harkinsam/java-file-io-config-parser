package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigParser {
    private Map<String, String> configuration;

    public ConfigParser(String fileName) {
        this.configuration = new HashMap<>();
        readConfigFile(fileName);
    }
    private void readConfigFile(String fileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            String currentSection = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }
                if (line.startsWith("[")) {
                    currentSection = line.substring(1, line.length() - 1); // Extract section name without brackets
                } else {
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        String key = currentSection.isEmpty() ? parts[0].trim() : currentSection + "." + parts[0].trim();
                        configuration.put(key, parts[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading config file: " + e.getMessage());
        }
    }
    public String get (String key){
        return configuration.get(key);
    }
}
