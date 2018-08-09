package com.apex.loops2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		while( sum<50) {
		System.out.println("Enter an integer");
		a = input.nextInt();
		sum = sum + a;
		System.out.println("Sum = "+ sum);
		System.out.println("--------------");
		}
       input.close();
	}

}
