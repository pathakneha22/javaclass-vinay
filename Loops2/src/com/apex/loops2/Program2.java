package com.apex.loops2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		double a = 0;
		double sum = 0;
		
		Scanner input = new Scanner(System.in);
		while( sum<100) {
		System.out.println("Enter an integer");
		a = input.nextDouble();
		sum = sum + a;
		System.out.println("Sum = "+ sum);
		System.out.println("--------------");
		}
       input.close();

	}

}
