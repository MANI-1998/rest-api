package com.api;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Validation {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\S.R\\eclipse-workspace\\Rest_Api\\src\\test\\java\\com\\payload\\Payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(reader);
		
		JSONObject jso = (JSONObject) parse;//narrow type casting or down casting
		//downcasting is not possible in java only but using java library files it is possible.
		
		Object object = jso.get("team");
		
		String value = object.toString();
		
		System.out.println("team : "+value);
		
		
		
	}

}
