import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookCount = scanner.nextInt();
      System.out.println("Book count: " + bookCount);
        
        int[] bookPrices = new int[bookCount];
        
        for(int i = 0; i < bookCount; i++) {
            bookPrices[i] = scanner.nextInt();
        }
        
        Arrays.sort(bookPrices);
        int counter = 0;
        int total = 0;
        
        for(int i = bookPrices.length - 1; i >= 0; i--) {
          System.out.println("Book prices: " + bookPrices[i]);
            counter++;
            if(counter % 3 == 0) {
                continue;
            }
            total += bookPrices[i];
        }
        
        System.out.println(total);
        scanner.close();
    }
}