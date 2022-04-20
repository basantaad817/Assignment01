package if_else;//Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//        Mathematics and Computer. Calculate percentage and grade
import java.util.Scanner;

public class Q_19 {
        public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        String validity;
        validity = (percentage>100||percentage<0) ? "\nInvalid Marks!" : "";
        if (validity.equals("")) {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");}
            else {
                System.out.println("Grade: F");
            }
        }else {
            System.out.println(validity);
        }
    }
}
