package javaopps.abstraction;

abstract class Employee{
	int emp_id=101;
	String emp_name="alex";
	String emp_email="alex@gmail.com";
	
	void getEmpDetails() {
		System.out.println(emp_id + " " + emp_name + " " + emp_email);
	}
	abstract void getSalaryDetails();
}
class HR extends Employee{
	double sal = 4600;
	double bonus = 400;
	
	void getSalaryDetails() {
		sal = sal + bonus;
		System.out.println("emp total salary is:" + " " + sal);
		
	}
	
	
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR obj = new HR();
		obj.getEmpDetails();
		obj.getSalaryDetails();
		

	}

}
