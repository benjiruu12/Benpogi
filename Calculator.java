
// Calculator.java
public class Calculator {
    public static void main(String[] args) {
        // Sample usage
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Multiplication: " + multiply(5, 3));
        System.out.println("Division: " + divide(5, 3));
        System.out.println("Modulus: " + modulus(5, 3));
    }

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Modulus
    public static int modulus(int a, int b) {
        return a % b;
    }
}

