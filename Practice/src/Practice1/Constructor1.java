package Practice1;

public class Constructor1 {

	Constructor1()
	{
		System.out.println("with no parameter");
	}
	Constructor1(int a)
	{
		System.out.println("with single parameter");
	}
	Constructor1(int b, double c)
	{
		System.out.println("with 2 parameter");
	}
	public static void main(String[] args)
	{
		Constructor1 c1=new Constructor1();
		new Constructor1(100);
		new Constructor1(200,100.00);

	}

}
