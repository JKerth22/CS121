package WeekTwoLab;

import javax.swing.JOptionPane;

public class DialogBoxTriangleArea {
    public static void main(String[] args) {
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height:"));
        int area = width * height / 2;
        JOptionPane.showMessageDialog(null, "Area is: " + area);
    }
}
