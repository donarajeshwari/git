package Tasks;
import java.util.Scanner;



public class Question1 {
	static void addition(int num1,int num2) {
		int res = num1 + num2;
		System.out.println("the sum of two number is:" + res);
	}
	static void substraction(int num1,int num2) {
		int res = num1 - num2;
		System.out.println("the substraction of two number is:" + res);
	}
	static void multiplication(int num1,int num2) {
		int res = num1 * num2;
		System.out.println("the multiplication of two number is:" + res);
	}
	static void division(int num1,int num2) {
		int res = num1 / num2;
		System.out.println("the substraction of two number is:");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		addition(num1,num2);
		substraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
		
				
		// TODO Auto-generated method stub

	}

}
