import javax.swing.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Hi from Swing!", SwingConstants.CENTER));
        frame.setVisible(true);
    }
}
