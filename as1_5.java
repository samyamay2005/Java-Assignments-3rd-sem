import java.util.*;
public class as1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int largest = (a > b) ? 
                      ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) : 
                      ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
