package com.apex.loops2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		int square = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer");
		n = input.nextInt();
		for (int i = 1; i <= n ; i++)
		{
			square = i*i;
			sum = sum + square;
		}
		System.out.println("The sum of square of numbers are " +sum);
       input.close();
       }

}
