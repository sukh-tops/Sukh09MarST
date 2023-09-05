package Assignment;

import java.util.Scanner;

public class FractionalNumbers {
	public static void main(String[] args) {
		System.out.println("Find factorial for Given Number.");
		double n1,d1,res= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerator : ");
        n1 = input.nextDouble();
        System.out.println("Enter the denominator for : ");
        d1 = input.nextDouble();
        res = n1/d1;//fraction
        System.out.println("The fraction is :"+ res);
        System.out.println();
	}
}
