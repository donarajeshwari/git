package javaopps.polymorphism;
class Bike{
	int speed;
	void speed() {
		System.out.println("speed is  80 kms/hr");
	}
}
class Honda extends Bike{
	int speed;
	void speed() {
		System.out.println("Honda bike speed is 60 km/hr");
	}
	
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj= new Honda();
		obj.speed();

	}

}
