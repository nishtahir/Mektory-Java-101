package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		File myFile = new File("sample.txt");
		//check if the file exists
		if(myFile.exists()){
			// do things with it
			readFile(myFile);
			writeToFile(myFile);	
		}else{
			System.out.println("The file doesn't exist");
		}
	}
	
	public static void readFile(File myFile){
		try {
			FileReader myFileReader = new FileReader(myFile);
			BufferedReader myReader = new BufferedReader(myFileReader);
			
			String lineOfText;
			while ((lineOfText = myReader.readLine()) != null){
				// Do magic string things here
				System.out.println(lineOfText);
			}
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Something happened. That's all i know...");
		} catch (IOException e){
			System.out.println("Some bad IO happened. That's all i know...");	
		}
		
	}

	public static void writeToFile(File myFile){
		try {
			FileWriter myFileWriter = new FileWriter(myFile);
			myFileWriter.write("Hello Mektory. I'm now writing to files!");
			myFileWriter.append("This is writen on to the end of the file, "
					+ "because it's using append");
			myFileWriter.close();
		} catch (IOException e) {
			System.out.println("Something happened. You should feel bad...");
			
		}
	}

}
