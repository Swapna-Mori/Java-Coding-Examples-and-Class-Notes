package checkedexceptionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadDataUsingBufferedReader_TryCatch {

	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(
											new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of an integer");
		String a = null;
		try {
			a = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Parses the string argument as a signed decimal integer
		Integer data  = Integer.parseInt(a);
		System.out.println(data instanceof Integer);

	}

}