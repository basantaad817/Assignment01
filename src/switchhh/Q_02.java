package switchhh;//JAVAProgram to find the maximum between two numbers. Using the switch statement.


import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= scanner.nextInt();
        System.out.println("Enter num1");
        int num2=scanner.nextInt();
        int result;

        if (num1 != num2){
            result = 1;
            switch (result){

                case 1:
                    System.out.println("num1 is greater than num2");
                    break;
                default:
                    System.out.println("num2 is greater than num1");
                    break;
            }
        }
//

        }
    }

