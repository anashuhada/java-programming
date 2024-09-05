package day10;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stud1 = new Student();
		stud1.studentID = 101;
		stud1.studentName = "Alyssa";
		stud1.grade = 'A';
		stud1.printData();
		
		Student stud2 = new Student();
		stud2.studentID = 102;
		stud2.studentName = "Martin";
		stud2.grade = 'B';
		stud2.printData();
	}
}
