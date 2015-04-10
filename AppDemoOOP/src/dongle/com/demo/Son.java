package dongle.com.demo;

public class Son extends Mother implements Family {

	// implement run,sing method from mother class
	@Override
	public void run() {
		mspeed = 20;
		System.out.println("Speed of Son is:" + mspeed + "km/h");
	}

	@Override
	public void sing() {
		msing = "pefect";
		System.out.println("Son sing:" + msing);

	}

	// implement method from interface family
	@Override
	public void roomArea() {
		// TODO Auto-generated method stub
		System.out.println("floor area of son is 15m2");
	}

	public static void main(String[] args) {
		Son son = new Son();
		son.run();
		son.sing();
	}

}
