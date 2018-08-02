package com.apex.java;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int  sub1, sub2, sub3, sub4, sub5, sub6, average, total;
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Enter the mark of first subject");
		sub1 = scan.nextInt();
		
		System.out.println("Enter the mark of second subject");
		sub2 = scan.nextInt();
		
		System.out.println("Enter the mark of third subject");
		sub3 = scan.nextInt();
		
		System.out.println("Enter the mark of fourth subject");
		sub4 = scan.nextInt();
		
		System.out.println("Enter the mark of fifth subject");
		sub5 = scan.nextInt();
		
		System.out.println("Enter the mark of sixth subject");
		sub6 = scan.nextInt();
		
		
		total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		average = total/6;
		
		System.out.println("The total of all the subject is " +total);
		System.out.println("The average of all the subject is " +average);
		
		scan.close();
	}
	
}
