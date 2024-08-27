package javaopps;
class User2{
	String username;
	String password;
	
	User2(){
		System.out.println("Default constructor invoked!!!");
	}
	User2(String username, String password){
		this.username = username;
		this.password = password;
		
	}
	void getUserInfo() {
		System.out.println(this.username + " " + this.password);
	}
	
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User2 obj = new User2();
		User2 obj1 = new User2("Alex","123");
		User2 obj2 = new User2("john","567");
		obj1.getUserInfo();
		obj2.getUserInfo();
		
		

	}

}
