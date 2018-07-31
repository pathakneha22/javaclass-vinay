package com.apex.quadratic;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int input, answer;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter any number");
		input = s.nextInt();	
		
		answer = 3*input*input - 8*input + 4;
		
		System.out.println("The result is "+answer);
		
		s.close();
	}
	
		
}
