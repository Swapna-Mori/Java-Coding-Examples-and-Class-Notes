package com.mouritech.javajsonexample;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONObjectUsingJava {
	
	String jsonObj = "[{\"year\":2009,\"author\":\"Rama Krishna\",\"title\":\"EveryDay SouthIndian\"},"
			+ "{\"year\":2011,\"author\":\"R K\",\"title\":\" SouthIndian\"}]";
	
	
	
	public void readJSONObject() {
		
		JSONParser jsonParser = new JSONParser();
		
		try {
			Object obj = jsonParser.parse(jsonObj);
			JSONArray arrayList = (JSONArray) obj;
			System.out.println("first object of the json data is...............");
			System.out.println(arrayList.get(0));
			System.out.println("second object of the json data is...............");
			System.out.println(arrayList.get(1));
			System.out.println("Converting JSON in to String");
			System.out.println(obj.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
