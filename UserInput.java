import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = sc.nextLine();

		System.out.println("Enter your rating : ");
		int rating = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your Email Id : ");
		String email = sc.nextLine();

		System.out.println(" Hi Hello... "+name);
		System.out.println(" Your rating is : " +rating);
		System.out.println("Your Email is :"+email);
	}
}
