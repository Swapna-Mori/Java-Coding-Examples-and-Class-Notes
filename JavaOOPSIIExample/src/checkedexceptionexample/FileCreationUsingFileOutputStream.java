package checkedexceptionexample;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCreationUsingFileOutputStream {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file with specific location ");
			String fileName = sc.next();
			//true for append mode
			FileOutputStream newTextFile = new FileOutputStream(fileName,true);
			System.out.println("Enter the contents of the file");
			sc.nextLine();
			String str = sc.nextLine();
			//str store the string which we have to enter in the file
			byte[] b = str.getBytes();//converts string in to bytes
			newTextFile.write(b);//writes bytes into file
			newTextFile.close();//close the file for further actions
			System.out.println("The file has been save on the given path.....");
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
