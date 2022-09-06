package constrbasics;

public class conssample7 {
	int age;
	double salary;
	
	conssample7()
	{
		System.out.println("**User Defined Zero-Param Constructor, start from here**");
		age=25;
		salary=32506.56;
		System.out.println("**User Defined Zero-Param Constructor, ends here**");
	}

	public static void main(String[] args) {
		/** as we learn, constructor is used to initialize non-static members of the class hence here we can 
		see age & salary variable value is getting initialize by constructor
		*/
		conssample7 c1=new conssample7();
		System.out.println(c1.age);// 25
		System.out.println(c1.salary);// 0.0

	}

}
