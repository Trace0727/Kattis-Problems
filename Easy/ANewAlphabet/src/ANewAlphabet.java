import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ANewAlphabet {

    public static void main(String[] args) {

        // Prompt the user for input
        System.out.println("Enter a sentence to translate with the New Alphabet:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        // Mapping of each lowercase letter to its “New Alphabet” / leet-speak equivalent
        Map<Character, String> map = new HashMap<>();
        map.put('a', "@");
        map.put('b', "8");
        map.put('c', "(");
        map.put('d', "|)");
        map.put('e', "3");
        map.put('f', "#");
        map.put('g', "6");
        map.put('h', "[-]");
        map.put('i', "|");
        map.put('j', "_|");
        map.put('k', "|<");
        map.put('l', "1");
        map.put('m', "[]\\/[]");
        map.put('n', "[]\\[]");
        map.put('o', "0");
        map.put('p', "|D");
        map.put('q', "(,)");
        map.put('r', "|Z");
        map.put('s', "$");
        map.put('t', "']['");
        map.put('u', "|_|");
        map.put('v', "\\/");
        map.put('w', "\\/\\/");
        map.put('x', "}{");
        map.put('y', "`/");
        map.put('z', "2");

        // Translate each character
        for (char c : line.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (map.containsKey(lower)) {
                result.append(map.get(lower));
            } else {
                result.append(c); // leave non-alphabetic chars unchanged
            }
        }

        // Display the translated sentence
        System.out.println("Translated sentence:");
        System.out.println(result);

        scanner.close();
    }
}
