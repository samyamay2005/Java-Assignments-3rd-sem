public class as4_2 {
    public static void main(String[] args) {
        try {
            String str = null;
            try {
                int[] arr = {10, 20, 30};
                System.out.println("Array element: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds!");
            }
            System.out.println("String length: " + str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered!");
        }

        System.out.println("Program executed successfully!");
    }
}
