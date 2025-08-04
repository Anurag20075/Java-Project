import java.util.Scanner;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + calculator.multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println(num1 + " / " + num2 + " = " + calculator.divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            default:
                System.out.println("Invalid choice");
        }
    }
}
