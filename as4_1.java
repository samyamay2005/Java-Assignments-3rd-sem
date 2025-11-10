public class as4_1 {
     public static void main(String[] args) {
        
    
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        
        try {
            int arr[] = {1, 2, 3};
            System.out.println("Accessing element: " + arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }

        
        try {
            String str = null;
            System.out.println("Length of string: " + str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered!");
        }

        System.out.println("Program executed successfully!");
    }
}
