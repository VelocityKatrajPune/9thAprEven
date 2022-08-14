package controlStatments;

public class Test1 {

	public static void main(String[] args) {
	
		char grade='B';
		
		switch (grade) {
		case 'A':System.out.println("I got >90%");
		break;

		case 'B': System.out.println("I got <90%");
		break;
		default:
		break;
		}

	}

}
