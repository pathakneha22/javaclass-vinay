package com.apex.ifelse;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		double originalPrice, discountRate, newPrice;
		Scanner scan = new Scanner(System.in);
   
		System.out.println("Enter the original price of the item");
		originalPrice = scan.nextDouble();
		
		if(originalPrice > 10) {
			discountRate = 0.05 * originalPrice;
			newPrice = originalPrice - discountRate;
			System.out.println("The dicount is "+discountRate);
			System.out.println("and the new price of the item is "+newPrice);
		}
		
		else {
			System.out.println("Sorry, there is no discount for $" +originalPrice);
		}
		 scan.close();
	}

}
