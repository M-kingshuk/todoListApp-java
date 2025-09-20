import javax.swing.*;
import java.awt.*;

class Task {
    JCheckBox task;
    JButton removeTaskButton;

    public Task(String text, JFrame jFrame, int yPos) {
        //
    }
}

public class ToDoList extends JFrame {
    public ToDoList() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // int distTask = 30;
        // JCheckBox[] tasks = new JCheckBox[1024];
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        this.add(addTaskButton);

        JCheckBox task = new JCheckBox("Demo Task");
        task.setBounds(100, 60, 170, 30);
        this.add(task);

        ImageIcon tempIcon = new ImageIcon("img/binLogo.png");
        Image img = tempIcon.getImage();
        Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);

        JButton removeTaskButton = new JButton(icon);
        removeTaskButton.setBounds(270, 60, 30, 30);
        this.add(removeTaskButton);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new ToDoList();
    }
}
