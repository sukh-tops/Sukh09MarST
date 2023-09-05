class A
{
	protected int x;
//	public void display()
//	{
//		
//		System.out.println(x);
//	}
}
class B extends A
{
	public void printX()
	{
		x = 900;
		System.out.println("x = "+x);
	}
}
public class MyClassDemo {

	public static void main(String[] args) {
		B b1 = new B();
		b1.printX();
	}
}
