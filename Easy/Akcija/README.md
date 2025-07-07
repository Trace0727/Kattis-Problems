# Akcija

A simple Java program that calculates the **minimum total price** a customer must pay in a bookstore promotion where every third book (cheapest) is free.  
This problem is based on the classic Kattis challenge: [Akcija](https://open.kattis.com/problems/akcija).

---

## Project Structure

```
Akcija/
├── src/
│   └── Akcija.java
└──
```

---

## Core Java Class

### `Akcija.java`
- Reads the total number of books and their prices from standard input.
- Sorts book prices in descending order.
- For every group of 3 books, the cheapest one is excluded from the total price.
- Uses integer array sorting and conditional logic to apply the discount.
- Outputs the minimal total cost the customer has to pay.

---

## How to Run

### Command Line

```bash
javac src/Akcija.java
java -cp src Akcija
```

### From an IDE  
Open the `Akcija` project or just the `Akcija.java` file in your preferred Java IDE (Eclipse, IntelliJ, VS Code, etc.) and click **Run**.

**Sample Input 1:**
```
4
3
2
3
2
```

**Sample Output 1:**
```
8
```

**Sample Input 2:**
```
6
6
4
5
5
5
5
```

**Sample Output 2:**
```
21
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
