package org.javapgms;
import java.util.Iterator;
import java.util.Scanner;


public class factorial {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the number to which you need to find factorial");
		Scanner getip =new Scanner(System.in);
		
		int num = getip.nextInt();
		int fact=1;
		
	     for (int i = 1; i <=num; i++) {
	    	 
	    	 fact=fact*i;
	    	 
			
		}
		
		System.out.println("the factorial of the given number "+num+"  is :"+ fact);
		
		
	}
	
	
	
	
	
	
	
	
}
