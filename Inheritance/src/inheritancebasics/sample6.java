package inheritancebasics;

class fruits
{
	int fruitage;
	fruits()
	{
		System.out.println("fruit class cons..");
		fruitage = 7;
	}
	public void taste()
	{
		System.out.println("Fruits are sweet");	
	}
}
class orange extends fruits
{
	int fruitage;
	orange()
	{
		// super(); //java compiler will write default super()
				System.out.println("orange class Cons..");
				fruitage = 5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitage);
		System.out.println("Fruits fruitAge: "+super.fruitage);
		taste();
		super.taste();
	}
}
public class sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*********************");

	}

}
/*
 * super: is a keyword or instance of super class
 * 	use to refer super class non-static members
 * 	mainly used when subclass and super class having common non-static members
 */ 
