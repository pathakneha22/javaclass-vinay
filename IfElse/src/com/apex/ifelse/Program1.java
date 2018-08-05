package com.apex.ifelse;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		double originalPrice, discountPrice, newPrice;
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter the original price of an item");
		originalPrice = scan.nextDouble();
		
		discountPrice = 0.05 * originalPrice;
		newPrice = originalPrice-discountPrice;
		
		System.out.println("The dicount is $"+discountPrice);
		System.out.println("and the new price of the item is $"+newPrice);
		
		scan.close();
	}

}
