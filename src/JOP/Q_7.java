package JOP;//Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz


import javax.swing.*;

public class Q_7 {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter the students name");
        int roll = Integer.parseInt(JOptionPane.showInputDialog("enter the class of student"));
        String interest = JOptionPane.showInputDialog("enter the interest of student");

//        JOptionPane.showMessageDialog(null,"Hey, my name is %s and my roll number is %d. My field of interest are %s",name,roll,interest);
    }
}
