package constrbasics;
//constructor overloading
public class cons1 {
	
	cons1() {
		System.out.println("This is a zero-para constructor");
	}

	public cons1(char c) {
		System.out.println("This is a single-para constructor");
	}

	cons1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}
	
	cons1(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	cons1(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	public static void main(String[] args) {
		cons1 c1 = new cons1();
		cons1 c2 = new cons1(10, 20);
		cons1 c3 = new cons1('d');
		cons1 c4 = new cons1(10d, 20);
		cons1 c5 = new cons1(10, 20.45);
	}

	
	

}
