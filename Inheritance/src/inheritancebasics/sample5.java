package inheritancebasics;

class grandfather
{
	grandfather()
	{
		System.out.println("I am Class Grandfather constrctuor...");
	}
	void myHome() {
		System.out.println("I am home of Grandfather");
}
}
	class father extends grandfather
	{
		father(double d)
		{
	//super();// if we dont wirte this dn java compiler will write by default super()
			System.out.println("I am Class Father constrctuor...");
		}
		void myCar() {
			System.out.println("I am car of Father");
	}
	}
		class child extends father
		{
			child(int i)
			{
				super(15.5);
				System.out.println("I am Class Child constrctuor...");
			}
			void myBike() {
				System.out.println("I am bike of child");
			}
		}

public class sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child(25);// accessing bike,car,home
		c1.myBike();
		c1.myCar();
		c1.myHome();
		System.out.println("******************************");
		// creating an object or instance of child most class and referred by its parent
		father f1=c1;//father f1=new child(25);home, car but bike will not be visible/accessible to father
        f1.myCar();
        f1.myHome();
        System.out.println("******************************");
     // creating an object or instance of child most class and referred by its parent
        grandfather g1=c1;//grandfather g1=new child(25);home but car , bike will not be visible/accessible to father
        g1.myHome();
        grandfather g2=new father(55.25);
        g2.myHome();// home but car , bike will not be visible/accessible to father
        
	}

}
