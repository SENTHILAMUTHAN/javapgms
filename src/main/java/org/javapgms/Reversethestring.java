package org.javapgms;
import java.util.Iterator;
import java.util.Scanner;


public class Reversethestring {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner input_string = new Scanner(System.in);
		String ip = input_string.nextLine();
		String reverse = " ";
		
		
		for (int i = ip.length()-1; i >= 0; i--) {
			
			reverse =reverse+ip.charAt(i);
			
			
		}
		System.out.println("the reverse of the given String is"+reverse);
	}
}
