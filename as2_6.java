import java.util.*;
public class as2_6 {
    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return a / b;
    }

    // Display function
    public static void display(double result, String operation) {
        System.out.println("Result of " + operation + " = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result = 0;
        String operation = "";

        switch (choice) {
            case 1:
                result = add(num1, num2);
                operation = "Addition";
                break;
            case 2:
                result = subtract(num1, num2);
                operation = "Subtraction";
                break;
            case 3:
                result = multiply(num1, num2);
                operation = "Multiplication";
                break;
            case 4:
                result = divide(num1, num2);
                operation = "Division";
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
                sc.close();
                return;
        }

        display(result, operation);

        sc.close();
    }
}
