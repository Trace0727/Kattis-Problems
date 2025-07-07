import java.io.InputStream;
import java.util.Scanner;

public class ASecondOpinion {
	public static void main(String[] args) {
		int MAX_INT = 1_000_000;
		int MIN_INT = 0;
//		System.out.println("Enter a number of seconds (0 - 1M): ");
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		int n = Integer.parseInt(scanner.nextLine());
	
		if(n > MAX_INT || n < MIN_INT) {
			System.out.println("Please enter value in range (0 - 1M): ");
		}
			
		int hours = n / 3600;
		int remainder = n % 3600;
		int minutes = remainder / 60;
		int seconds = remainder % 60;
		
		System.out.println(hours + " : " + minutes + " : " + seconds);
		scanner.close();
	}
}
