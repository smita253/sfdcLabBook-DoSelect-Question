package sfdcAssig;

import java.util.Scanner;

public class sumProduct {
	public static void main(String[] args) {
		int sum = 0, product = 0;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter 1st No");
		int num1 = sc.nextInt(); 
		System.out.println("Enter 2nd No");
		int num2 = sc.nextInt(); 
		
		sum = num1+num2;
		product= num1*num2;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Product is: "+product);
		
		
	}
}
