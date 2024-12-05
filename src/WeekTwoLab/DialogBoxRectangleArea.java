package WeekTwoLab;

import javax.swing.*;

public class DialogBoxRectangleArea {
    public static void main(String[] args) {
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height:"));
        int area = width * height;
        JOptionPane.showMessageDialog(null, "Area is: " + area);
    }
}
