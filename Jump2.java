import java.util.Scanner;

public class Jump2 {
	public static void main(String[] args) {
		double n,sum=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number (Enter nagative number to stop )");

		while(true) {
			n= scanner.nextDouble();
			if(n<0) {
				break;
			}
			sum = sum+n; // sum += n;

		}
		System.out.println("Total Sum : " +sum);
	}
}
