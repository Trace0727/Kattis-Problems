# AShortcutToWhat

A simple Java program that reads an integer from input and applies a specific arithmetic formula:  
Add five to the input, multiply the result by three, and subtract ten.  
This problem is inspired by the Kattis challenge: [A Shortcut to What?](https://open.kattis.com/problems/ashortcuttowhat)

---

## Project Structure

    AShortcutToWhat/
    ├── src/
    │   └── AShortcutToWhat.java
    └──

---

## Core Java Class

### `AShortcutToWhat.java`
- Reads a single integer input `n` from standard input.
- Validates that `n` is in the range [-1000, 1000].
- Computes the value using the formula: `((n + 5) * 3) - 10`
- Outputs the result.
- Uses `Scanner` and `InputStream` for input processing.

---

## How to Run

### Command Line

    javac src/AShortcutToWhat.java
    java -cp src AShortcutToWhat

### From an IDE  
Import the project—or just the `AShortcutToWhat.java` file—into any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.) and click **Run**.

**Sample Input:**

    -4
    0
    1
    2
    3
    12

**Sample Output:**

    -7  
    5  
    8  
    11  
    14  
    41  

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author

**Trace Davis**  
- GitHub: [TraceTheDev](https://github.com/TraceTheDev)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
