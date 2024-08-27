package javaopps;

class User{
	String username = "Alex";
	String password = "123456";
	
	void getUserInfo() {
		System.out.println(username + " " + password);
	}
}

public class Sample1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntax to create an object
		//classname var_name = new classname();
		User user_obj = new User();
		user_obj.getUserInfo();

	}

}
