# LeetAlphabet

A lightweight Java command-line utility that converts any sentence into a playful “leet” representation by replacing each letter a-z with its New-Alphabet counterpart while leaving punctuation, digits, and spaces untouched.



## Project Structure

    LeetAlphabet/
    ├── src/
    │   └── ANewAlphabet.java
    └──



## Core Java Class

### `ANewAlphabet.java`
- Prompts the user: **Enter any sentence to convert:**  
- Stores a `HashMap<Character, String>` that maps each lowercase letter to its leet form  
  (`a → @`, `b → 8`, `c → (`, …, `z → 2`).
- Iterates through the input, replacing letters via the map; all other characters are appended unchanged.
- Prints the fully converted leet string.



## How to Run

### Command Line

    javac src/ANewAlphabet.java
    java -cp src ANewAlphabet

### From an IDE  
Import the project—or simply the `ANewAlphabet.java` file—into any Java-capable IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) and click **Run**.

**Sample Session**

    Enter any sentence to convert:
    Hello, World!
    [-]3ll0, \/\/0r1d!



## Future Enhancements
- Batch-mode option to convert entire text files.
- Reverse converter to decode leet back to standard text.
- Command-line flags for custom mapping presets.



## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.



## Author
**Trace Davis**  
- GitHub: [Trace0727](https://github.com/Trace0727)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
