import java.io.InputStream;
import java.util.Scanner;

public class AShortcutToWhat {
	public static void main(String[] args) {
		int MAX_ALLOWED = 1000;
		int MIN_ALLOWED = -1000;
		
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		int n = Integer.parseInt(scanner.nextLine());
		
		if(n > MAX_ALLOWED || n < MIN_ALLOWED) {
			System.out.println("Please enter valid numbers (-1000 to 1000): ");
		} else {
			int result = ((n + 5) * 3) - 10;
			System.out.println(result);
		}
		scanner.close();
	}
}
