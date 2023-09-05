import java.util.Scanner;

public class Datatypes {
	public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.println("Convert temprature from Fahrenehit to Celsius degree");
      double fahrenheit = input.nextDouble();
      double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
      System.out.println("fahrenheit is equal to" + celsius + "in celsius" );

	}
}
