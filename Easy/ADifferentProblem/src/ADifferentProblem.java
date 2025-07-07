import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADifferentProblem {
	public static void main(String[] args) {
		long MAX_ALLOWED = 1_000_000_000_000_000L; // 10^15
		
		
//		System.out.println("Enter two values in range (0 - 1T) to find the difference: ");
		
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		List<long[]> inputPairs = new ArrayList<>();
	
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine().trim();
			
			if(line.isEmpty()) {
				continue;
			}
			
			String[] parts = line.split(" ");
//			if(parts.length != 2) {
//				System.out.println("Please enter only two values: ");
//				continue;
//			}
			try {
				long a = Long.parseLong(parts[0]);
				long b = Long.parseLong(parts[1]);
			
//				if(a < 0 || b < 0 || a > MAX_ALLOWED || b > MAX_ALLOWED) {
//					System.out.println("Please enter values in range (0 - 1T): ");
//					continue;
//				}
				inputPairs.add(new long[] {a, b});
			} catch (NumberFormatException e) {
				System.out.println("Please enter numberical values only: ");
			}
		}
		scanner.close();
		
		for(long[] pair : inputPairs) {
//			System.out.println("Difference: " + Math.abs(pair[0] - pair[1]));
			System.out.println(Math.abs(pair[0] - pair[1]));
		}
	}
}
