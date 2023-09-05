package Assignment;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("W.A.J.P to check given number is Prime or not?");

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean ans = false;
		for (int i=2; i<= num / 2 ; i++) {
			//condition for non prime number
			if (num % i == 0) {
				ans = true;
				break;
			}
		}
		
		if(!ans)
			System.out.println(num + "is a prime number");
		else
			System.out.println(num + "is not a prime number");
	}
}
