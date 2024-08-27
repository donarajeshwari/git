package javaopps.polymorphism;
class Vehicle{
	void running() {
		System.out.println("Bike is running at speed 60 kms/hr");
	}
	void running(int speed) {
		System.out.println("Bike is running at speed" + speed + "kms/hr");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.running();
		obj.running(70);
		// TODO Auto-generated method stub

	}

}
