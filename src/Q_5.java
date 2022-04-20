//Take two integer inputs from user. First calculate the sum of two and then product.
//        Finally, calculate the division of thus obtained sum and product and print the result.
import javax.swing.*;

public class Q_5 {
    public static void main(String[] args) {


        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter a num1"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Enter a num2"));

        float sum = num1 + num2;
        float product = num1 * num2;
        float div = product / sum;

        JOptionPane.showMessageDialog(null, "The sum is " + sum + "and product is " + product);
        JOptionPane.showMessageDialog(null, "Now the division of sum and product is " + div);
    }
}
