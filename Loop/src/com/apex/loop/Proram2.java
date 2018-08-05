package com.apex.loop;

import java.util.Scanner;

public class Proram2 {

	public static void main(String[] args) {
		int a , b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number");
		a = scan.nextInt();
		
		System.out.println("Enter any number");
		b = scan.nextInt();
		
		for( int number = a; number <= b; number++) {
			System.out.println(number + " " + number*number);
	}
			scan.close();
	}

}
