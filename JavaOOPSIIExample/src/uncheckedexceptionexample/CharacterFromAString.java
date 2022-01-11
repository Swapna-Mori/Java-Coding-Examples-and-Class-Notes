package uncheckedexceptionexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFromAString {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Scanner sc = new Scanner(System.in);
		try {
			String str = "This is a string in java";
			System.out.println(str.charAt(2));
			String[] names  = {"Rama","Krishna"};
			File file = new File("data.txt");
			int value = sc.nextInt();
		}catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
		}

	}

}
