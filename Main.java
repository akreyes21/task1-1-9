import static java.lang.Math.*;

public class MathOperations {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Perform addition
        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        // Perform subtraction
        int difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        // Perform multiplication
        int product = multiply(num1, num2);
        System.out.println("Product: " + product);

        // Perform division
        int quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}
