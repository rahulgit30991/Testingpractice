package constrbasics;

public class conssample1 {
	int age=25;
	void display()
	{ 
		System.out.println("i am display method");
	
	}

	public static void main(String[] args) {
		//calling default constructor of the current class written by java compiler
		conssample1 c1=new conssample1();
		System.out.println(+c1.age);
		c1.display();

	}

}
