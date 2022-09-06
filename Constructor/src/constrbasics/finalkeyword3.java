package constrbasics;

public class finalkeyword3 {

	final int speedlimit=55;// blank final variable
	finalkeyword3() {
		//speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		finalkeyword3 f1=new finalkeyword3();
		System.out.println(f1.speedlimit); 
	}
}
