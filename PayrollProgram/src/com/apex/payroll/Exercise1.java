package com.apex.payroll;

import java.util.Scanner;

public class Exercise1 {

		public static void main(String[] args) {
		
		double number_of_hour, pay_rate, answer;
		int choice;
		
		choice = 1;
		Scanner scan = new Scanner (System.in);
		
		while (choice == 1)
		{
		
		System.out.println("Enter the number of hours");
		number_of_hour = scan.nextDouble();
		
		System.out.println("Enter pay rate value");
		pay_rate = scan.nextDouble();
		
		answer = number_of_hour*pay_rate;
		
		System.out.println("Numbers of Hours : "+number_of_hour);
		System.out.println("Pay Rate Value : $"+pay_rate);
		System.out.println("Salary of the person : $"+answer);
		
		System.out.println("Do you want to run again? 1/0");
        choice = scan.nextInt();
		}
		scan.close();
				}

}
