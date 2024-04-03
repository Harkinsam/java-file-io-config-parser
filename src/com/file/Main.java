package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String environment;
        if (args.length == 0) {
            environment = "production";
        } else {
            environment = args[0].toLowerCase();
        }

        String fileName;
        switch (environment) {
            case "production":
                fileName = "C:\\Users\\HP\\IdeaProjects\\FileIO\\config.txt";
                break;
            case "staging":
                fileName = "C:\\Users\\HP\\IdeaProjects\\FileIO\\config.txt.staging";
                break;
            case "development":
                fileName = "C:\\Users\\HP\\IdeaProjects\\FileIO\\config.txt.dev";;
                break;
            default:
                System.out.println("Invalid environment. Using default production environment.");
                fileName ="C:\\Users\\HP\\IdeaProjects\\FileIO\\config.txt";
                break;
        }

        ConfigParser config = new ConfigParser("C:\\Users\\HP\\IdeaProjects\\FileIO\\config.txt.dev");
        String dbName = config.get("dbname");
        String port = config.get("application.port");
        String applicationName = config.get("application.name");
        System.out.println("Application Name: " + applicationName);
        System.out.println(port);
        System.out.println(dbName);
    }
}