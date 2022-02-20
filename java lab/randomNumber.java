package sfdcAssig;
import java.util.Random;
public class randomNumber {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int arr[] = new int[5];
		for(int i = 0; i<5; i++) {
			arr[i]  = rand.nextInt(100);
		}
		
		for(int i= 0; i<5; i++) {
			System.out.println("Random nubmers are : "+ arr[i] );
		}
	}

}
