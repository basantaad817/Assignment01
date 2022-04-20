//Write a program to calculate sum of four numbers taking user input.
import javax.swing.*;

public class Q_2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a num1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a num2"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter a num3"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Enter a num4"));
        int sum =  num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"the sum is: "+sum);
    }
}
