# AnotherCandies

A simple Java program that determines whether a group of children can equally divide all the candies they bring to school.  
This problem is inspired by the Kattis challenge: [Another Candies](https://open.kattis.com/problems/anothercandies).

---

## Project Structure

```
AnotherCandies/
├── src/
│   └── AnotherCandies.java
└──
```

---

## Core Java Class

### `AnotherCandies.java`
- Reads multiple test cases, each specifying a number of children and the number of candies they brought.
- For each test case, it checks whether the total number of candies is divisible by the number of children.
- Uses modulo arithmetic while reading input to prevent overflow.
- Outputs `"YES"` if the candies can be evenly divided, otherwise outputs `"NO"`.

---

## How to Run

### Command Line

```bash
javac src/AnotherCandies.java
java -cp src AnotherCandies
```

### From an IDE  
Open the `AnotherCandies` project or import `AnotherCandies.java` into your IDE (Eclipse, IntelliJ, VS Code, etc.) and click **Run**.

**Sample Input:**
```
2

5
5
2
7
3
8

6
7
11
2
7
3
4
```

**Sample Output:**
```
YES
NO
```

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author

**Trace Davis**  
- GitHub: [TraceTheDev](https://github.com/TraceTheDev)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
