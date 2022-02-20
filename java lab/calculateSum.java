package sfdcLabBook;

import java.util.Scanner;

public class calculateSum {
	
	public static void main(String[] args) {
		
    	
    	System.out.println("Enter the number");
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int output = returnCalculateSum(num1);
    	System.out.println("Total sum is: "+output);

    }

	public static int returnCalculateSum(int num) {
		int sum = 0;
		for(int i = 0; i<=num; i++) {
			if (i%3==0 && i%5==0) {
				sum +=i;
				System.out.println("number is " + i + " sum is: "+ sum);
			}
		}
		return sum;
	}
}
