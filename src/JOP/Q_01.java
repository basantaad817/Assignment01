package JOP;//Write a program to take student details as input and display the result
import javax.swing.*;

public class Q_01 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name: ");
        String address = JOptionPane.showInputDialog(("Enter your address"));
        int roll =Integer.parseInt(JOptionPane.showInputDialog("Enter the roll number"));
        JOptionPane.showMessageDialog(null,"YOur name is "+name+"\n Your address is; "+address+"\nYOur roll number is:"+roll);
    }
}
