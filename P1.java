class A
{


	static void disp()
	{

		System.out.println("Hello");

	}

	void disp1()
	{


		disp();
	}

	

}

class P1
{


	public static void main(String arg[])
	{

		A ob1=new A();

		ob1.disp1();


	}

}