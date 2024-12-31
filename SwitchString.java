
public class SwitchString {
	public static void main(String[] args) {
		String grade = "Pass";
		switch (grade) {
		case "Fail" :
			System.out.println("Fail");
			break;
		case "Pass" :
			System.out.println("Pass");
			break;
		default :
			System.out.println("Try Again");
		}
	}
}
