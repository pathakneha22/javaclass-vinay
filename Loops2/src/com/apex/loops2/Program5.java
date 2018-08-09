package com.apex.loops2;

public class Program5 {

	public static void main(String[] args) {
		for (int i = 1; i <=  8; i++) 
		{
			for (int j = i; j <= 8; j++)
				System.out.print(" ");
			for (int k = 1; k<(i*2) ; k++)
				System.out.print("*");
			
			System.out.println();	
		}

	}

}
