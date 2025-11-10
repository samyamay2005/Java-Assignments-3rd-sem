
public class as2_5 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two strings as command-line arguments.");
            return;
        }

        String str1 = args[0];
        String str2 = args[1];

        String result = str1 + str2;

        System.out.println("Concatenated String: " + result);
    
    }
}
