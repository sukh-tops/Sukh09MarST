import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		
		System.out.println("W.A.J.P. to take three numbers from the user and print the greatest number");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a =");
		double a = sc.nextDouble();
		System.out.println("enter b =");
		double b = sc.nextDouble();
		System.out.println("enter c =");
	    double c = sc.nextDouble();

		if (a > b && a > c) {
			System.out.println("A is greater than B and C");
		} else if (b > a && b > c) {
			System.out.println("B is greater than A and C");
		} else if (a < c && c > b) {
			System.out.println("C is greater than A and B");
		} else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("W.A.J.P. in Java to display the first 10 natural numbers while using Loop");
		
		System.out.println("By for Loop");
		for (int i=1;i<=10;i++) 
		{
		System.out.println(i);
		}
		
		System.out.println("W.A.J.P. to Print pattern given below");
		
		System.out.println("1st Figure");
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(); 
		}
			
		System.out.println("2nd Figure is same as 1st");
		
		System.out.println("3rd Figure");
		
		System.out.println("4th Figure");
		System.out.println("\t\t\t");
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter number of Rows in Pyramid:");
		int nrows=s2.nextInt();
		int rowcount=1;
		System.out.println("Pyramid Pattern: ");
		for (int i1=nrows;i1>0;i1--) 
		{
			for (int j1=1;j1<=i1;j1++)
			{
				System.out.print(" ");
			} 
			for (int j1=1;j1<=rowcount;j1++) {
				System.out.print(rowcount+ " ");
			}
		System.out.println();
		rowcount++;
		}
		
		System.out.println("5th Figure");
		
		System.out.println("first 100 prime numbers");
		int number = 1, count, sum = 0;
		while (number <= 100)
		{
			count = 0;
			int i2=2;
			while (i2 <= number/2)
			{
				if (number %i2 == 0) 
				{
					count++;
				}
				i2++;
			}
			if (count ==0 && number != 1) 
			{
				sum = sum + number ;
			}
			number++;
		}
		System.out.println("The sum of Prime Numbers from 1 to 100 =" +sum);
		
		System.out.println();
		
		
	}
}