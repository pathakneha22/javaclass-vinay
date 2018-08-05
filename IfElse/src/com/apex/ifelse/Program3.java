package com.apex.ifelse;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		double numberOfCookie, numberOfCake, cookiePrice, cakePrice;
		double discountRate, newPrice, total;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of cookies you want to purchase");
		numberOfCookie = scan.nextInt();
		cookiePrice = 0.05 * numberOfCookie;
		
		System.out.println("Enter the number of cakes you want to purchase");
		numberOfCake = scan.nextInt();
		cakePrice = 0.03 * numberOfCake;
		
		total = cookiePrice + cakePrice;
		
		if (total > 10 ) {
			discountRate = 0.05 * total;
			newPrice = total - discountRate;
			System.out.println("Total price is $" +total);
			System.out.println("The discount is $"+discountRate);
			System.out.println("and the new price of the items are $"+newPrice);
		}
		
		else {
			System.out.println("Total price is $" +total);
			System.out.println("So there is no discount for $" + total + " of purchase");
		}
		
		scan.close();
	}

}
