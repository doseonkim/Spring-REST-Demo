package com.dozo.jackson.json.demo.tests;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and convert to Object
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// use Object
			System.out.println(student.toString());
			
			System.out.println(student.getAddress().toString());
			for (String s : student.getLanguages()) 
				System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
