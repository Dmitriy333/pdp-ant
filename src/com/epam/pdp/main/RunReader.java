package com.epam.pdp.main;

import com.epam.pdp.reader.CustomFileReader;

public class RunReader {
    public static void main(String[] args) {
        if (args.length == 1) {
            new CustomFileReader().reader(args[0]);
        } else {
            throw new IllegalArgumentException("Invalid arguments");
        }

    }
}
