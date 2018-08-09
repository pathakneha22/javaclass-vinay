package com.apex.loops2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer");
		n = input.nextInt();
		for (int i = 0; i <= n; i++ ) 
		{
			sum = sum + i ;
		}
				
		System.out.println("The factorial of " + n + " is " +sum);
		
		input.close();
	}

}
