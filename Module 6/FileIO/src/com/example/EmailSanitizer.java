package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailSanitizer {
	public static void main(String[] args) throws IOException {

		FileReader input = new FileReader("myMailingList.txt");
		FileWriter writer = new FileWriter(new File("sanitizedMailingList.txt"));
		BufferedReader reader = new BufferedReader(input);

		String line = null;
		while ((line = reader.readLine()) != null) {
			if (line.contains("@")) {
				writer.write(line);
			} else {
				System.out.println(line + " is not valid");
			}
		}
		writer.close();
	}
}
