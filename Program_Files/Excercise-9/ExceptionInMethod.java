public class ExceptionInMethod {
    static void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        divide(10, 0);
    }
}
