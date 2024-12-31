import java.util.Scanner;

public class IfClass {
	public static void main(String[] args) {
		//int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any number : ");

		int num = sc.nextInt();

		if(num>0) {
			System.out.println(num + " is positive");
		}
		else if(num==0) {
			System.out.println(num +" is natural bcz zero");
		}
		else {
			System.out.println(num +" is negative");
		}
	}
}
