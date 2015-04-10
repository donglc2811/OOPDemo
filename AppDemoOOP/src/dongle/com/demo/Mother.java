package dongle.com.demo;

public class Mother extends People implements Family {

	int mspeed = 5;
	String msing="great";

	// implement run,sing,hair,skin method from people class
	@Override
	public void run() {
		age = 40;
		height = (float) 1.6;
		weight = 46;

		System.out.println("age of mother:" + age + "old");
		System.out.println("height of mother:" + height + "m");
		System.out.println("weight of mother:" + weight + "kg");
		System.out.println("speed of mother:" + mspeed + "km");
		 
	}

	
	@Override
	public void skin() {
		// TODO Auto-generated method stub
		String mskin = "White";
		System.out.println("Skin of mother:" + mskin);
	 
	}

	@Override
	public void hair() {
		// TODO Auto-generated method stub
		String mh = "yellow";
		System.out.println("the hair of mother:" + mh);
		 
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
		System.out.println("mother sing :"+msing);
		 
	}
	// implement roomArea method from family interface
	@Override
	public void roomArea() {
		// TODO Auto-generated method stubs
	System.out.println("mother in a room wiht father");	
	}

	public static void main(String[] args) {
		Mother mother = new Mother();
		mother.sing();
		mother.run();
		mother.skin();
		mother.hair();
	}
}
