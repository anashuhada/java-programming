package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student std = new Student();
		// Approach #1: use object reference variable
		/*std.studentID = 101;
		std.studentName = "Scott";
		std.grade = 'B';		
		std.printStudentData();*/
		
		// Approach #2: use method()
		/*std.setStudentData(102, "Jessica", 'B');
		std.printStudentData();*/
		
		// Approach #3: use constructor
		Student std = new Student(103, "Bruno", 'A');
		std.printStudentData();
	}

}
