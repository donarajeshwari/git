package javafunctions;
import java.util.Scanner;

public class Sample3 {
	static void addition (int num1,int num2 ) {

		int res;
		res = num1 + num2;
		System.out.println("sum of two numbers are :" + res);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// before we give the value
		addition(10,20);
		addition(5,6);
		addition(11,12);
		// taking the input  from user
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter num2:");
		int number2 = sc.nextInt();
		addition(number1,number2);


	}

}
