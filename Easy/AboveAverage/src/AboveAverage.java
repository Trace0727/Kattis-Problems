import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of test cases
        System.out.print("Enter the number of test cases: ");
        int testCase = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCase; i++) {
            // Prompt for class size and grades on the same line
            System.out.print("Enter class size followed by all student grades (space-separated): ");
            String[] parts = scanner.nextLine().split(" ");
            int classSize = Integer.parseInt(parts[0]);

            int[] grades = new int[classSize];
            double total = 0;

            for (int j = 0; j < classSize; j++) {
                grades[j] = Integer.parseInt(parts[j + 1]);
                total += grades[j];
            }

            double average = total / classSize;
            int count = 0;
            for (int grade : grades) {
                if (grade > average) count++;
            }

            double percentage = (double) count / classSize * 100;
            System.out.printf("Percentage of students above average: %.3f%%\n", percentage);
        }

        scanner.close();
    }
}