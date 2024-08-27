package javaopps;
class User1{
	User1(){
		System.out.println("constructor is invoked");
	}
	void getInfo() {
		System.out.println("getInfo().....");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 obj=new User1();
		obj.getInfo();
		

	}

}
