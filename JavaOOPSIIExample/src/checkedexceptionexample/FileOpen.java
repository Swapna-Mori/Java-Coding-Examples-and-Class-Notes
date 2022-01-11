package checkedexceptionexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOpen {

	public static void main(String[] args) {
	
			File openFile = new File("data1.txt");
			//creates a buffer reader input stream
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(openFile));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Contents of the file are.................");
			System.out.println("=============================================");
			int r =0;
			try {
				while((r=br.read()) != -1){
					System.out.print((char) r);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}


