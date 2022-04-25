package if_else;//Write a JAVA program to find all roots of a quadratic equation.
import java.util.Scanner;

public class Q_17 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();

        double d = Math.sqrt((b*b)-(4*a*c));

        double root1 = (d-b)/(2*a);
        double root2 = -(b+d)/(2*a);

        if (root1 ==root2){
                System.out.println("There is only one solution and solution is: "+root1);
        }
        else {
        System.out.println("Solution 1: "+root1+"\nSolution 2: "+root2);
        }
    }

}
