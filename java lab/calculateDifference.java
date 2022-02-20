package sfdcLabBook;

import java.util.Scanner;

public class calculateDifference {
	
	public static int returnCalculateDifference(int num) {
		int sum1 = 0, sum2 = 0, sum;
		
		for (int i=1; i<=num; i++) {
			sum1 +=(i*i);
			sum2 += i; 
			
		}
		
		sum = sum1 - (sum2*sum2);
		System.out.println("("+sum1+" - "+(sum2*sum2)+") = "+sum);
		
		return sum;
	
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int output = returnCalculateDifference(num);
    	System.out.println("Sum is "+output);

		

	}

}
