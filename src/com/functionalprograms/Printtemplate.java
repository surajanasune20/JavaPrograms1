package com.functionalprograms;

import com.utility.Utility;

public class Printtemplate {

	public static void main(String[] args) {
		// initializing variable
		String template = "Hello <<UserName>>, How are you?";
		System.out.println();
		System.out.println(template);
		// taking input from user
		System.out.println("Enter the Username :-");
		String name = Utility.getString();
		// accept input using calling getString method from utility1 class
		String nametemplate = Utility.replace(template, "<<UserName>>", name);
		System.out.println(nametemplate);

	}

}
