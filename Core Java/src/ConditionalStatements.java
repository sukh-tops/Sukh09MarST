import java.util.Scanner;

public class ConditionalStatements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a = ");
	int a = sc.nextInt();
	System.out.println("enter b = ");
	int b = sc.nextInt();
	
	//if 
	if (a>b) {
		System.out.println("a is greater than b");
	}
	
	//if else
	if (a>b) {
		System.out.println("a is greater than b");
	} else {
		System.out.println("b is greater than a");
	}
	
	//nested if
	System.out.println("enter age : ");
	int age = sc.nextInt();
	if (age > 18) {
		if (age < 60) {
		System.out.println("eligible");
	} else {
		System.out.println("age is greater than 18 but not less than 60");
		}
		} else {
			System.out.println("age is less than 18");
		}
	
	//else if ladder
	System.out.println("enter marks : ");
	int per = sc.nextInt();
	if (per < 35) {
		System.out.println("Fail");
	} else if (per >=35 && per <=50) {
		System.out.println("Pass Class");
	} else if (per >=51 && per <=70) {
		System.out.println("C Grade");
	} else if (per >=71 && per <=80) {
		System.out.println("B Grade");
	} else if (per >=81 && per <=90) {
		System.out.println("A Grade");
	} else if (per >=91 && per <=100) {
		System.out.println("A+ Grade");
	} else {
		System.out.println("Invalid Input");
	}
	
	System.out.println("1. English");
	System.out.println("2. Hindi");
	System.out.println("3. Gujarati");
	System.out.println("enter your choise : ");
	int lang = sc.nextInt();
	switch (lang) {
	case 1 :
		System.out.println("you selected english");
		break;
	case 2 : 
		System.out.println("you selected hindi");
		break;
	case 3 :
		System.out.println("you selected gujarati");
		break;
		default:
			System.out.println("invalid input");
	}
	}
}
