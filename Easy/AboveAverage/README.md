# AboveAverageCalculator

A concise Java console application that reads multiple test cases, computes each class’s average score, and prints the percentage of students who scored above that average—perfect practice for loops, arrays, input parsing, and formatted output.

---

## Project Structure

```
AboveAverageCalculator/
├── src/
│   └── AboveAverage.java
└──
```

---

## Core Java Class

### `AboveAverage.java`
Handles the full program workflow:

- Prompts for the **number of test cases**.  
- For each test case:  
  1. Reads the **class size** and all **grades** on a single line.  
  2. Calculates the class average.  
  3. Counts how many grades exceed that average.  
  4. Prints the result as a **percentage with three-decimal precision** (e.g., `57.143%`).  
- Uses a single `Scanner` for all console input and closes it gracefully.

---

## Sample Input / Output

<details>
<summary>Example run</summary>

**Input**  
```
2
5 50 50 70 80 100
7 100 95 90 80 70 60 50
```

**Output**  
```
40.000%
57.143%
```
</details>

---

## How to Compile & Run

### From any IDE  
Import the project folder, mark `src/` as the source root, then run `AboveAverage.java`.

### From the command line  
```bash
# Compile
javac src/AboveAverage.java

# Run (class path set to src)
java -cp src AboveAverage
```

Follow on-screen prompts: first enter the number of test cases, then enter each class’s size and its grades on one line.

---

## Future Enhancements
- **Input validation** for non-numeric or out-of-range values.  
- **File input** mode for bulk grade processing.  
- Output **aggregate statistics** across all test cases (overall average, highest percentage, etc.).

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author  
**Trace Davis**  
- GitHub: <https://github.com/Trace0727>  
- LinkedIn: <https://www.linkedin.com/in/trace-d-926380138/>
