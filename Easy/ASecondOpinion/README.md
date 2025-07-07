# ASecondOpinion

A lightweight Java utility that converts an input number of seconds into the format `hours : minutes : seconds`.  
This problem is a simple arithmetic and formatting exercise ideal for practicing integer division and modulo operations.

---

## Project Structure

    ASecondOpinion/
    ├── src/
    │   └── ASecondOpinion.java
    └──

---

## Core Java Class

### `ASecondOpinion.java`
- Prompts the user to enter a number of seconds (0 to 1,000,000).
- Converts the input seconds into `hours : minutes : seconds` format using:
  - Integer division for computing hours and minutes
  - Modulo operator for determining remainders
- Prints the result as three integers separated by `:`.

---

## How to Run

### Command Line

    javac src/ASecondOpinion.java
    java -cp src ASecondOpinion

### From an IDE  
Import the project—or simply the `ASecondOpinion.java` file—into any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.) and click **Run**.

**Sample Input:**

    1000  
    80000  

**Sample Output:**

    0 : 16 : 40  
    22 : 13 : 20  

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author

**Trace Davis**  
- GitHub: [TraceTheDev](https://github.com/TraceTheDev)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
