package JOP;

import javax.swing.*;

public class Q_4 {
    public static void main(String[] args) {

        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter a number1"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Enter a number2"));

        float sum = num1+num2;
        float product = num1*num2;
        JOptionPane.showMessageDialog(null,"The sum is "+sum+"and product is "+product);
    }
}
