package sba2;

interface  Employee_1{
	
	 void calculateSalary(double s);
	 void fetchDepartment(String d);


class Engineer implements Employee_1{
	
public void calculateSalary(double s) {
		
		
		System.out.println("Your Salary is: "+s);
	}
	
	public void fetchDepartment(String d) {
		
		System.out.println("Your Department is: "+d);
	}
	
}

 class Doctor implements Employee_1{
	

	
	public void calculateSalary(double s1) {
		
		
		System.out.println("Your Salary is: "+s1);
	}

	
	public void fetchDepartment(String d) {
		
		System.out.println("Your Department is: "+d);
	}
	
}
public class Sba2_1 {

	public static void main(String[] args) {
		
		Engineer engg=new Engineer();
		engg.calculateSalary(50000);
		engg.fetchDepartment("Electrical Engineering");
		
		Doctor doc=new Doctor();
		doc.calculateSalary(100000);
		doc.fetchDepartment("Radiologist");
		
	}
}

}
