package inheritancebasics;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2,B2{
	
	Inheritance5(){
		super();//confusion 
	}

}
public class smaple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance5 obj = new Inheritance5();
		obj.msg();

	}

}
/*
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/
