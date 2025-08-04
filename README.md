```markdown
# 🧮 Java OOP-Based Calculator

This is a **simple console-based calculator** built using **Java** and follows **Object-Oriented Programming (OOP)** principles. It allows users to perform **Addition, Subtraction, Multiplication,** and **Division** on two numbers via command-line input.

---

## 🚀 Features

- Basic arithmetic operations
- Error handling for division by zero
- Interactive user input via console
- Clean object-oriented structure using methods inside a `Calculator` class

---

## 🛠️ Technologies Used

| Tool/Technology | Purpose |
|------------------|---------|
| Java             | Main programming language |
| OOP (Object-Oriented Programming) | Code organization and modularity |
| Scanner (java.util) | For user input from console |
| try-catch block | To handle division-by-zero error gracefully |

---

## 📂 Project Structure

```

Calculator.java  <-- Main class that contains logic and main method
README.md        <-- You're reading it!

```

---

## 📋 How It Works

1. The user runs the program.
2. The program displays a menu with options: `Addition`, `Subtraction`, `Multiplication`, and `Division`.
3. The user selects an operation (1-4).
4. Then the user is prompted to enter two numbers.
5. Based on the selected operation, the appropriate method from the `Calculator` class is called.
6. The result is displayed in the console.

---

## 🧠 Why I Used OOP

Using Object-Oriented Programming (OOP) helps in:

- **Code Reusability**: Each arithmetic operation is defined as a method inside the class.
- **Scalability**: Easily extendable (e.g., to support modulus, square root, power functions, etc.)
- **Clean Code Structure**: Keeps main logic separate from utility functions.

---

## 📌 Sample Output

```

Simple Calculator

1. Addition
2. Subtraction
3. Multiplication
4. Division
   Enter your choice (1-4): 1
   Enter first number: 10
   Enter second number: 20
   10.0 + 20.0 = 30.0

```

---

## ⚠️ Error Handling

If a user attempts to divide by zero, the program doesn't crash. It catches the exception and prints a user-friendly message:

```

Enter your choice (1-4): 4
Enter first number: 10
Enter second number: 0
Cannot divide by zero

```

---

## 📈 Future Enhancements

- GUI version using JavaFX or Swing
- History feature to show past calculations
- Support for more complex mathematical operations (e.g., modulus, exponentiation)
- Input validation for non-numeric values

---

## ✅ Getting Started

To run this calculator:

1. Make sure you have Java installed (`java -version`)
2. Compile the code:
```

javac Calculator.java

```
3. Run the program:
```

java Calculator

```

---

## 🙌 Author

**Anurag** – Java enthusiast and software developer, currently exploring both web and backend development.

---


Would you like me to generate this as a downloadable file or extend it with contribution/license sections for GitHub?
