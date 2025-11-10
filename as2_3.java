import java.util.*;
public class as2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int leftDiagonalSum = 0;   // Top-left to bottom-right
        int rightDiagonalSum = 0;  // Top-right to bottom-left

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);

        if (leftDiagonalSum > rightDiagonalSum) {
            System.out.println("Maximum is Left Diagonal Sum = " + leftDiagonalSum);
        } else if (rightDiagonalSum > leftDiagonalSum) {
            System.out.println("Maximum is Right Diagonal Sum = " + rightDiagonalSum);
        } else {
            System.out.println("Both diagonals have equal sum = " + leftDiagonalSum);
        }

        sc.close();
    }
}
