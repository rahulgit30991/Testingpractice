package constrbasics;

public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int age=25;
		System.out.println("age value " +age);
		age=30;//compile time error we cannot change value
		System.out.println("updated value " +age);
		age=60;//compile time error we cannot change value
		System.out.println("updated value " +age);

	}

}
/**
when we don't want anyone to change our variable value dn that variable should be declared with final keyword
if you try to change value of final variable dn it will give a compile time error
*/