package com.epam.pdp.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {
    public void reader(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
