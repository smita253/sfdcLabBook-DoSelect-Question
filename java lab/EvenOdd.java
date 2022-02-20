package sfdcAssig;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int evenNo = 0, oddNo = 0;
		Scanner sc = new Scanner(System.in);  
		
		
		int Arr[]=new int[5];
		for(int i = 0; i<5; i++) {
			System.out.println("Enter "+i+"st No");
			int num1 = sc.nextInt(); 
			Arr[i] = num1;	
		}
		//sorting the array
		Arrays.sort(Arr);
		
		
		for(int i = 0; i<5; i++ ) {
			if(Arr[i]%2 == 0) {
				evenNo = Arr[i];
				break;
			}
		}
		for(int i = 4; i>=0; i-- ) {
			if(Arr[i]%2 != 0) {
				oddNo = Arr[i];
				break;
			}
		}
		
		System.out.println("Smaller even no is"+evenNo +" & bigger odd no is"+ oddNo);
	    
	}

}
