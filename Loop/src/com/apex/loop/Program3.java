package com.apex.loop;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		double leftSide, rightSide;
		double sum1 = 0;
		double sum2 = 0;
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter the left side weight");
			leftSide = scan.nextDouble();
			sum1 = sum1 + leftSide;
			
			
			System.out.println("Please enter the right side weight");
			rightSide = scan.nextDouble();
			sum2 = sum2 + rightSide;
			if (sum1 != sum2)
				System.out.println("Both are not same weights");
			}
		while (sum1 != sum2);
		System.out.println("Both are same weights");
	}

}
