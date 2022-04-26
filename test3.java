package javatest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model){
		List<String> arraylist1 = new ArrayList<String>();
		arraylist1.add(model);
        mobiles.put(company, (ArrayList<String>) arraylist1);
        return "model successfully added";
	}
	public ArrayList<String> getModels(String company){
         
		 return mobiles.get(company);
	}
	public String buyMobile(String company, String model){
		
		mobiles.remove(company, model);
        
		return "mobile sold successfully";
	}
}

public class test3 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));
	}
}
