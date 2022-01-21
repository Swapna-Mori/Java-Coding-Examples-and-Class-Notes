package com.mouritech.javajsonexample;



import org.json.simple.JSONObject;

public class JSONObjectUsingJavaProgram {
	
	public void createJsonObject() {
		JSONObject books = new JSONObject();
		
		books.put("title", "EveryDay SouthIndian");
		books.put("author", "Rama Krishna");
		books.put("year", new Integer(2009));
		
		System.out.println(books);
		
	}

}
