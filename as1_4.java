import java.util.*;
public class as1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks (out of 100): ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 95 && marks <= 100) {
            grade = "O";
        } else if (marks >= 85) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid Marks";
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
