import java.util.*;
public class as2_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int lim= sc.nextInt();
        
        for(int i=1;i<=lim;i++){
            int val=1;
            for(int j=1;j<=i;j++){
                val*=i;
                System.out.print(val+" ");
            }
            System.out.println(" ");
            val++;
        }
        sc.close();
    }
}
