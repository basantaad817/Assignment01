package switchhh;//JAVA Program to find the maximum between three numbers. Using the switch statement.

public class Q_03 {
    public static void main(String[] args) {
        int a = 2, b=3,c=4,result;

        if (a > b && a>c){
            result = 1;
            switch (result){
                case 1:
                    System.out.println("num1 is greater than num2 and num3");
                    break;
            }
        }
        else if (b>a && b>c){
            result = 1;
            switch (result){
                case 1:
                    System.out.println("num2 is greater than num1 and num3");
                    break;
            }
        }
        else {
            System.out.println("num3 is greater than num1 and num");
        }


    }
}
