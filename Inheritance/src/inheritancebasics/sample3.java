package inheritancebasics;

class vehicle
{
public void wheels()
{
	System.out.println("I have wheels");
}
}
class bike extends vehicle
{
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}
class car1 extends vehicle
{
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}
class scooter extends vehicle
{
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scooter sc=new scooter();// object of scooter class
		sc.wheels();
		sc.countwls();
		car1 c1=new car1();
		c1.wheels();
		c1.countwlc();// object of car class
		bike b=new bike();
		b.wheels();
		b.countwl();// object of bike class

	}

}
