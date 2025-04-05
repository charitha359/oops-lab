package cherry;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 5);
        double invalidQuotient = calc.divide(10, 0); 
        System.out.println("Addition: 10 + 5 = " + sum);
        System.out.println("Subtraction: 10 - 5 = " + difference);
        System.out.println("Multiplication: 10 * 5 = " + product);
        System.out.println("Division: 10 / 5 = " + quotient);
        System.out.println("Division by zero: 10 / 0 = " + invalidQuotient);
    }
}











