import java.util.Scanner;

public class AnotherCandies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		System.out.println();
			
//		System.out.println("Testcases: " + testCases);
		
		for(int i = 0; i < testCases; i++) {
			int numChild = scanner.nextInt();
//			System.out.println("Number of children: " + numChild);

			long numCandies = 0;
			for(int j = 0; j < numChild; j++) {
				numCandies = (numCandies + scanner.nextLong()) % numChild;
			}
//			System.out.println("Number of candies: " + numCandies);
			
			if(numCandies == 0 ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}	
		scanner.close();
	}
}
