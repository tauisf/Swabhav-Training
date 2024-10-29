package com.aurionpro.model;

import java.io.File;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadingStream {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\tausif.siddiqui\\Desktop\\swabhavaurotraning\\core java\\09-stream-app\\src\\com\\aurionpro\\test\\Demo.txt";
        try (Stream<String> linesStream = Files.lines(Paths.get(path))) {
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }
	}

}
