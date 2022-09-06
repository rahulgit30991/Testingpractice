package constrbasics;
//cons call in differents classes with method
class A{
	int a=10;
	A()
	{
		System.out.println("i am constructor A");	
	}
	void display()
	{
		System.out.println("i am display method of class A");
	}
}
class X{
	int a=65;
	X()
	{
		System.out.println("i am constructor X");
	}
	void display()
	{
		System.out.println("i am display method of class X");
	}
}

public class conssample4 {
	void display()
	{
		System.out.println("i am display method of class conssample4");
	}

	public static void main(String[] args) {
		
		System.out.println("Main() of Class conssample4 is started...");
		A a1=new A();
		System.out.println("Class A global varibale i = "+a1.a);
		a1.display();
		X x1=new X();
		System.out.println("Class X global varibale i = "+x1.a);
		x1.display();
		conssample4 c1=new conssample4();
		c1.display();
		System.out.println("Main() of Class conssample4 ends here...");

	}

}
