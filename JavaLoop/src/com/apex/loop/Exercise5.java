package com.apex.loop;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int  sub1, sub2, sub3, average, total;
		
		Scanner scan = new Scanner (System.in);
		
		int i = 1;
		while(i<4)     
		{
		
			System.out.println("Please enter the marks for student # " + i + " below" );
			
			System.out.println("Enter the marks of first subject");
			sub1 = scan.nextInt();
			
			System.out.println("Enter the marks of second subject");
			sub2 = scan.nextInt();
			
			System.out.println("Enter the marks of third subject");
			sub3 = scan.nextInt();
			
			
			total = sub1 + sub2 + sub3;
			average = total/3;
			
			System.out.println("The total of all the subject is " +total);
			System.out.println("The average of all the subject is " +average);
			System.out.println(" ----------------------------------------------");
			i++;
		}
		scan.close();
	}

}
