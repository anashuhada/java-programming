package day11;

public class Student {
	
	// class variables
	int studentID;
	String studentName;
	char grade;
	
	void printStudentData() {
		System.out.println(studentID + " " + studentName + " " + grade);
	}
	
	// taking 3 params --> local variables/method specific variables
	// store the values into these 3 params temporary
	// method used for creating/implementing logic/program code --> operation
	void setStudentData(int id, String name, char gr) {
		// assign the params same as the actual variables
		studentID = id;
		studentName = name;
		grade = gr;
	}
	
	// constructor name should be same as class name
	// won't return any values
	// no need to add void
	// can pass params
	// constructor only for initialization data/assigning data for variables
	// can create same constructor but with different params
	Student(int id, String name, char gr) {
		studentID = id;
		studentName = name;
		grade = gr;
	}
}
