import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class as4_3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Step 3: Check for even number
            if (num % 2 == 0) {
                throw new MyException("Even Number Exception: The number entered is even.");
            }

            // Step 4: Check if number > 2000
            if (num > 2000) {
                throw new MyException("Value Limit Exception: Number is greater than 2000.");
            }

            System.out.println("Valid input! The number is odd and less than or equal to 2000.");

        } catch (MyException e) {
            System.out.println("Custom Exception Caught → " + e.getMessage());
        } finally {
            System.out.println("Program executed successfully!");
            sc.close();
        }
    }
}
