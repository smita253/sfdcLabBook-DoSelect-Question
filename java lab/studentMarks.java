package sfdcAssig;
import java.util.Scanner;
public class studentMarks {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter you Marks");
		 int marks = sc.nextInt();
		 
		 if(marks> 40) {
			 System.out.println("Congartulations you passed");
		 }
		 else {
			 System.out.println("Sorry you failed");
		 }
			 
	 }
}
