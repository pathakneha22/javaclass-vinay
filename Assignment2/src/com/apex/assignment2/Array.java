package com.apex.assignment2;

public class Array {

	public static void main(String[] args) 
	{
		System.out.println("Index  Value");
		int ar[]= { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};

		for (int i = 0; i < ar.length; i++) {

			System.out.println(i+ "\t"+ar[i]);
		}
	}

}
