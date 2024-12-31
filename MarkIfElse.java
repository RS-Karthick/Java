import java.util.Scanner;

public class MarkIfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks :");

		int marks = sc.nextInt();

		System.out.println("Your Grade is :");

		if(marks>=90) {
			System.out.println("S");
		}
		else if(marks>=80) {
			System.out.println("A");
		}
		else if (marks>=70) {
			System.out.println("B");
		}
		else if (marks>=60) {
			System.out.println("C");
		}
		else if (marks>=50) {
			System.out.println("D");
		}
		else if (marks>=40) {
			System.out.println("E");
		}
		else {
			System.out.println("U");
		}
	}
}
