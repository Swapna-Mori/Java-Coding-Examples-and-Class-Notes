package checkedexceptionexample;

import java.io.File;

public class FileCreation {
	
	public static void main(String[] args) {
		
	try {
		File newTextFile = new File("D:\\newfile.txt");
		
		/*
		 * createNewfile() method returns true if file gets created or 
		 * false if file is already exists
		 */
		boolean isFileCreated = newTextFile.createNewFile();
		if(isFileCreated) {
			System.out.println("File created at the specified location");
		}else {
			System.out.println("File already exists at the specified location");
		}
	 }catch (Exception e) {
		System.out.println("Exception Occured :");
		e.printStackTrace();
	 }
	}

}
