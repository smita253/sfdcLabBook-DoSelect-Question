package sfdcAssig;

public class ass1a {
	//MainFunction

	    public static void main(String[] args)
	    {
	        int rows = 5; // Number of Rows we want to print
	          
	        for (int i = 1; i <= rows; i++)
	        {
	          for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            }
	          for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j+" ");
	            }  
	            System.out.println();
	        }
	        
	 
	        
	        }
	     
}
