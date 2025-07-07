# ADifferentProblem

A simple Java program that reads pairs of integers and computes the **absolute difference** between them.  
This problem is inspired by the classic Kattis challenge: [A Different Problem](https://open.kattis.com/problems/different).

---

## Project Structure

    ADifferentProblem/
    ├── src/
    │   └── ADifferentProblem.java
    └──

---

## Core Java Class

### `ADifferentProblem.java`
- Reads multiple lines from standard input until EOF.
- Each line contains two 64-bit signed integers.
- Outputs the absolute difference between the two values.
- Uses `BufferedReader` and `StringTokenizer` (or `Scanner`) for efficient input handling.
- Handles edge cases including negative values and large numbers.

---

## How to Run

### Command Line

    javac src/ADifferentProblem.java
    java -cp src ADifferentProblem

### From an IDE  
Import the project—or simply the `ADifferentProblem.java` file—into any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.) and click **Run**.

**Sample Input:**

    10 12
    71293781758123 72784
    1 12345677654321

**Sample Output:**

    2  
    71293781685339
    12345677654320

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author
**Trace Davis**  
- GitHub: [Trace0727](https://github.com/Trace0727)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
