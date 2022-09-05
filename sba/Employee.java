package com.ust;

public class Employee {
	
int empid;
String employeename="jayanth";
int age=21;
double salary=78000.00;
String Designation="Developer";

void display() {
	System.out.println("name:"+employeename);
	System.out.println("age:"+age);
	System.out.println("Salary:"+salary);
}

void display(double a) {
	if(salary>40000) {
		System.out.println("Deduct 10% tax from your salary");
	}
	else {
		System.out.println("no deduction of tax from salary");
	}
}
}
class Engineer extends Employee{
	void display() {
		super.display();
	}
	public static void main(String args[]) {
		Engineer e=new Engineer();
		e.display();
		Employee s=new Employee();
		e.display(s.salary);
		
	}
}

