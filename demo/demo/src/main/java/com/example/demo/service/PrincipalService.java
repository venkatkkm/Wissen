package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class PrincipalService {

        private static final String FILE_PATH = "C:/Users/venka/Downloads/principal.txt";
    //C:\Users\venka\Downloads>

    public double getPrincipal() throws IOException {
        return Double.parseDouble(
                Files.readString(Paths.get(FILE_PATH)).trim()
        );
    }
}
