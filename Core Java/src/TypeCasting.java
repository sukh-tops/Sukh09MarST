import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		double d = 3;
		System.out.println(d);
		double d1 = 1.1;
		int j = (int) d1;
		System.out.println("j = " +j);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a =");
		int a = sc.nextInt();
		System.out.println("enter b =");
		int b = sc.nextInt();
		int c = (int)a / (int)b;
		System.out.println("enter c =" +c);	
		
				String str = "1234";
				int a1 = Integer.parseInt(str);
				System.out.println(a1);

	}	
}
