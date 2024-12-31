import java.util.Scanner;

public class Jump1 {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the any one number : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		while(true) { // instead of n>=0 true condition we gave true
			if(n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
		}
	}
}
