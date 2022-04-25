//JAVA Program to check whether a year is a leap year or not. Using switch statement

public class Q_05 {
    public static void main(String[] args) {
        int year = 2020;
        int result;
        if ((year%4==0&&year%100!=0)||year%400==0){
            result = 0;
            switch (result){
                case 0:
                    System.out.println("It is leap year");
                    break;
                default:
                    break;
            }
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
