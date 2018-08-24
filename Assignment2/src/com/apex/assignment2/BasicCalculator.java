package com.apex.assignment2;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer");
		a = input.nextInt();
		System.out.println("Enter another integer");
		b = input.nextInt();
		
		Operations t = new Operations();
		t.addition(a, b);
		
		Operations t1 = new Operations();
		t1.subtraction(a, b);
		
		Operations t2 = new Operations();
		t2.multiplication(a, b);
		
		Operations t3 = new Operations();
		t3.division(a, b);
		
		input.close();
		
		
	}
}
class Operations{
	public void addition( int a, int b){
		int total = a + b;
		System.out.println("Addition of "+a+" and "+b+" is "+total);
	}
	
	public void subtraction (int a, int b) {
		int total = a - b;
		System.out.println("Subtraction of "+a+" and "+b+" is "+total);
	}
	
	public void multiplication (int a, int b) {
		int total = a * b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+total);
	}
	
	public void division (int a, int b) {
		int total = a / b;
		System.out.println("Division of "+a+" and "+b+" is "+total);
	}
}
