package inheritancebasics;

class A //here class A is parent or most super class
{
	static int a=10;
	int b=25;
	double c=55.65;
}
//now in class B all the nonstatic member of class A is virtually present
class B extends A //here class B is super class for class C but child or sub class for class A

{
	static int d=55;
	int e=30;
	double f=36.52;
}
//now in class C all the nonstatic member of class B & class A is virtually present
class C extends B //here class C is child or sub class
/*
 * also in this class default constructor is called with default super() statement
 * written by java
 */
{
	static int g=60;
	float h=66.25f;
	double i=26.45;
}
public class sample1 {

	public static void main(String[] args) {
		// calling static member directly
		System.out.println("calling static member of class A "+A.a);
		System.out.println("calling static member of class B "+B.d);
		System.out.println("calling static member of class C "+C.g);
		C c1=new C();//it will have all the non-static members of class A,B & C
		System.out.println("calling non static member of class A "+c1.b);
		System.out.println("calling non static member of class A "+c1.c);
		System.out.println("calling non static member of class B "+c1.e);
		System.out.println("calling non static member of class B "+c1.f);
		System.out.println("calling non static member of class C "+c1.h);
		System.out.println("calling static non member of class C "+c1.i);

	}

}
