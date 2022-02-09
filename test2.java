package javatest;

import java.util.Date;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Arrayop{
	

 public ArrayList<Integer> makeArrayListInt(int n){

	ArrayList<Integer> myNumbers = new ArrayList<Integer>(n);
  
	for (int i = 0; i < n; i++) {
		 myNumbers.add(0);
		}
  return myNumbers;

}

 public ArrayList<Integer> reverseList(ArrayList<Integer> list){
	 
	 Collections.reverse(list);  


  return list;
}


public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
    
	
   list.set(list.indexOf(m), n);
   return  list;
}

}

public class test2{
  public static void main(String[] args) {
	  
	  ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
	  Arrayop obj = new Arrayop();
	  System.out.println(obj. makeArrayListInt(4));
	  System.out.println(obj.reverseList(list));
	  System.out.println(obj.changeList(list, 10,28));
   
  }
}