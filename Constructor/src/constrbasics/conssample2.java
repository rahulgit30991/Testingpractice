package constrbasics;
//constructor overloading
public class conssample2 {
	
	conssample2()
	{
		System.out.println("zero parameterized");
	}
	conssample2(int a,double b)
	{
		System.out.println("int double type");
	}
	conssample2(char a,int b)
	{
		System.out.println("char int type");
	}
	

	public static void main(String[] args) {
		/**
		 * Constructor Overloading: more than on constructor in a class 
		 * Rule: 1. type of args differ or 
		 * 		 2. number of args differ or 
		 * 		 3. position of args differ 
		 */
		conssample2 c1=new conssample2();
		conssample2 c2=new conssample2(5,65.25d);
		conssample2 c3=new conssample2('d',55);

	}

}
