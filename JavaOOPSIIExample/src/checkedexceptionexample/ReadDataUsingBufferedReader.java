package checkedexceptionexample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadDataUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
											new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of an integer");
		String a = br.readLine();
		//Parses the string argument as a signed decimal integer
		Integer data  = Integer.parseInt(a);
		System.out.println(data instanceof Integer);

	}

}
