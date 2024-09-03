package day4;

public class SwitchCaseWeekNames {

	public static void main(String[] args) {
		
		String week_name = "xyz";
		
		switch (week_name) {
		
		case "Sunday" : System.out.println(1);
		break; // if not include break, it will execute the next command
		
		case "Monday" : System.out.println(2);
		break;
		 
		case "Tuesday" : System.out.println(3);
		break;
		 
		case "Wednesday" : System.out.println(4);
		break;
		 
		case "Thursday" : System.out.println(5);
		break;
		 
		case "Friday" : System.out.println(6);
		break;
		 
		case "Saturday" : System.out.println(7);
		break;
		
		default : System.out.println("Invalid week name");
		}

	}

}
