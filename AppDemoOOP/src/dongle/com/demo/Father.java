package dongle.com.demo;

public class Father extends People implements Family {

	int mspeed = 10;

	@Override
	public void run() {
		// variable inherited from abstract class People
		weight = 50;
		height = (float) 1.7;
		// print properties of father
		System.out.println("speed of father when he run:" + mspeed + "km/h");
		System.out.println("Weight of father:" + weight + "kg");
		System.out.println("Height of mother:" + height + "m");
	}

	// implement sing method in abstract class people
	@Override
	public void sing() {
		String fsing = "sing great";
		System.out.println("father sing:" + fsing);
	}

	// implement skin method from people class
	@Override
	public void skin() {
		String sk = "yellow";
		System.out.println("Skin of father is:" + sk);

	}

	// implement hair method in people class
	@Override
	public void hair() {

		System.out.println("the hair of father is black");
	}

	// implement method from interface Family
	@Override
	public void roomArea() {

		System.out.println("floor area of father is 25m2");
	}

	// main method run first when run application java.
	public static void main(String[] args) {
		Father father = new Father();
		father.run();
		father.sing();
		father.skin();
	}
}
