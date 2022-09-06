package constrbasics;

class C{
	double i;
	
	C(double j)
	{
		System.out.println("i am class C constructor");
		i=j;
	}
}

public class conssample5 {

	public static void main(String[] args) {
		/**
		what is the use of parameterized constructor?
		with the help of parameterized constructor, for every instance we can initialize different value of non-static variables

		*/
		C c1=new C(15.35);
		System.out.println(+c1.i);
		c1.i=20.60;
		System.out.println(+c1.i);
		//also this way is possible by making new reference varible
		C c2=new C(30.35);
		System.out.println(+c2.i);

	}
	

}
