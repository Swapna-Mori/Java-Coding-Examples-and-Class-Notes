package methodreferenceexample;

import java.util.function.BiFunction;

public class MainClass {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> reader =  ReadData::readValues;
		
		String returnData = reader.apply(55, 66);
		System.out.println(returnData);

	}

}
