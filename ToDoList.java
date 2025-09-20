import javax.swing.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To do list");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Lets go, bitch!", SwingConstants.CENTER));
        frame.setVisible(true);
    }
}
