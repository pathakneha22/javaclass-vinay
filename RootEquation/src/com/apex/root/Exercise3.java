package com.apex.root;

import java.util.Scanner;

public class Exercise3 {


	public static void main(String[] args) {
		double a, b, c, x, x1, x2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the value of a :");
		a = scan.nextDouble();
		System.out.println("Enter the value of b :");
		b = scan.nextDouble();
		System.out.println("Enter the value of c :");
		c = scan.nextDouble();
		
		x = b*b-4*a*c;
		if (x<0)
		{
			System.out.println("The roots of this quadtric equation are imaginary.");
		}
		else
		{
			x1 = (-b+Math.sqrt(x))/(2*a);
			x2 = (-b-Math.sqrt(x))/(2*a);
			
			System.out.println("First root of this quadratic equation is : "+x1);
			System.out.println("and the second root is : "+x2);
		}
		scan.close();
	}

}
