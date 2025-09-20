import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task {
    JCheckBox task;
    JButton removeTaskButton;

    public Task(String text, JFrame frame, int yPos) {
        this.task = new JCheckBox(text);
        this.task.setBounds(100, yPos, 170, 30);
        frame.add(this.task);

        ImageIcon tempIcon = new ImageIcon("img/binLogo.png");
        Image img = tempIcon.getImage();
        Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);

        this.removeTaskButton = new JButton(icon);
        this.removeTaskButton.setBounds(270, yPos, 30, 30);
        frame.add(this.removeTaskButton);
    }
}

public class ToDoList extends JFrame {
    int i = 0;
    int yPos = 30;
    Task[] tasks = new Task[1024];

    public ToDoList() {
        this.setTitle("To Do List");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(198, 217, 238));
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        this.add(addTaskButton);

        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tasks[i++] = new Task("Task " + i, ToDoList.this, yPos += 30);
                ToDoList.this.revalidate();
                ToDoList.this.repaint();
            }
        });

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new ToDoList();
    }
}
