package org.javapgms;
import java.util.Iterator;
import java.util.Scanner;


public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number from which you need to find fibonacci");
		Scanner start =new Scanner(System.in);
		int a=start.nextInt();
		
		System.out.println("Enter the number till which you need to find fibonacci");
		Scanner end =new Scanner(System.in);
		int last =end.nextInt();
		
		int b=a+1;
		System.out.println(a);;
		System.out.println(b);
		
		for (int i = b+1; i <=last; i++) {
			
		
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}
		
		
	}
		
}	
		
		
		
		
		
		
	