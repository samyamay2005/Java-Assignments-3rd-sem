import java.util.*;

interface SpecialArithmetic {
    void all_divisors(int n);
}

class DivisorCalculator implements SpecialArithmetic {
    public void all_divisors(int n) {
        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class as3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 4: Create object and call the method
        DivisorCalculator dc = new DivisorCalculator();
        dc.all_divisors(num);

        sc.close();
    }
}
