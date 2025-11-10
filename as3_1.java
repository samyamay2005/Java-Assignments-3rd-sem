import java.util.Scanner;

class Calculator {

    // Method for addition
    public double add(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method for subtraction
    public double subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    // Method for multiplication
    public double multiply(double[] numbers) {
        double product = 1;
        for (double num : numbers) {
            product *= num;
        }
        return product;
    }
}

public class as3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = calc.add(numbers);
                System.out.println("Sum = " + result);
                break;
            case 2:
                result = calc.subtract(numbers);
                System.out.println("Difference = " + result);
                break;
            case 3:
                result = calc.multiply(numbers);
                System.out.println("Product = " + result);
                break;
            default:
                System.out.println("Invalid choice! Please enter between 1 and 3.");
        }

        sc.close();
    }
}
