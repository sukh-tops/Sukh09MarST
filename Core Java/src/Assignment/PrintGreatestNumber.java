package Assignment;

import java.util.Scanner;

public class PrintGreatestNumber {
	public static void main(String[] args) {
		
	System.out.println("W.A.J.P. to take three numbers from the user and print the greatest number");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a = "); 
	double a = sc.nextDouble();
	System.out.println("enter b = ");
	double b = sc.nextDouble();
	System.out.println("enter c = ");
	double c = sc.nextDouble();
	
	if (a>b && a>c) {
		System.out.println("A is greater than B and C");
	} else if (b>a && b>c) {
		System.out.println("B is greater than A and C");
	} else if (c>a && c>b) {
		System.out.println("C is greater than A and B");
	} else {
		System.out.println("Invalid Inputs");
	}
  }
}
