package Assignment;

public class PrintPattern {
	public static void main(String[] args) {
		System.out.println("Print 12345");
		for (int i=1; i<=5 ; i++) {
			for (int j=1; j<=i ; j++) {
				System.out.print(i);	
			}
			System.out.println( );
		 }
		
		
		System.out.println("Print 10");
		int i, j, rows=5;
		for (i=1 ; i<= rows; i++) 
		{
		for (j=1 ; j<= i; j++) 
		{
		if (j%2 == 0) {
			System.out.print(0);
		}
		else {
			System.out.print(1);
		}
		}
		System.out.println();
		}
		
		System.out.println();
		
		
	  }
	}


