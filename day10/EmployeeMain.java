package day10;
// need to access from different package, need to impart packagename.classname;
public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(); // object
		emp1.employeeID = 101;
		emp1.employeeName = "John";
		emp1.job = "Manager";
		emp1.salary = 50000;
		emp1.display(); // if no display() can use normal print
		
		Employee emp2 = new Employee(); // object
		emp2.employeeID = 102;
		emp2.employeeName = "Scott";
		emp2.job = "Admin";
		emp2.salary = 10000;
		emp2.display();
		
		Employee emp3 = new Employee(); // object
		emp3.employeeID = 103;
		emp3.employeeName = "David";
		emp3.job = "Engineer";
		emp3.salary = 40000;
		emp3.display();
	}
}
