package javacondition;
import java.util.Scanner;


public class Sample2 {
	static void getResults(int p) {
		
		if(p >= 85 && p<=100) {
			System.out.println("FCD !!1");
		}else if( p >= 60 && p<85) {
			System.out.println("first class");
		}else if(p >= 35 && p<=60) {
			System.out.println("pass");
		}else if(p >=0 && p<35) {
			System.out.println("fail");
		}else {
			System.out.println("enter a percentage");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage:");
		int percentage = sc.nextInt();
		getResults(percentage);
		
		
		// TODO Auto-generated method stub

	}

}
