import javax.swing.*;
import java.awt.*;

class Task {
    JCheckBox task;
    JButton removeTaskButton;

    public Task(String text, JFrame frame, int yPos) {
        JCheckBox task = new JCheckBox("Demo Task");
        task.setBounds(100, 60, 170, 30);
        frame.add(task);

        ImageIcon tempIcon = new ImageIcon("img/binLogo.png");
        Image img = tempIcon.getImage();
        Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);

        JButton removeTaskButton = new JButton(icon);
        removeTaskButton.setBounds(270, 60, 30, 30);
        frame.add(removeTaskButton);
    }
}

public class ToDoList extends JFrame {
    public ToDoList() {
        this.setTitle("To Do List");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        

        Task[] tasks = new Task[1024];
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        this.add(addTaskButton);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new ToDoList();
    }
}
