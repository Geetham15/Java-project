package com.learningfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/**
		File file = new File("myFile.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException  e) {
			System.out.println("File not found");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
			//e.printStackTrace();
		}finally {
			try {
				if(bufferedReader !=null) {
					bufferedReader.close();
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("unable to close the file " + file.getName());
			}
		}
		**/
		
		
		File file = new File("myFile.txt");
		// try with resources statement from java 1.7 onwards
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException  e) {
			System.out.println("File not found");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
			//e.printStackTrace();
		}
		
	}
}
