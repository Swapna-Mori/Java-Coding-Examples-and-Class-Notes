package checkedexceptionexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	static FileReader fr = null;
	public static void main(String[] args) {
		try {
			//create the file reader object
			fr = new FileReader("data");
			System.out.println("Contents of the file are.................");
			System.out.println("=============================================");
			int r =0;
			try {
				while((r=fr.read()) != -1){
					System.out.print((char) r);//prints the content of the file
			}
			}catch (IOException e) {
				// TODO: handle exception
			}
			
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
