package constrbasics;

public class conssample3 {
	int age;
	double salary;
	conssample3(int a,double s)
	{
      age=a;
      salary=s;
	}
	void display()
	{
	System.out.println(age + " " +salary);	
	}

	public static void main(String[] args) {
// with the help of parameterized constructor for every instance we can initialize different value of nonstatic variable
		conssample3 c1=new conssample3(25,100.50d);
		c1.display();
		conssample3 c2=new conssample3(15,250.50d);
		c2.display();

	}

}
