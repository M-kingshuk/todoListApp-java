import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task {
    JCheckBox task;
    JButton removeTaskButton;

    public Task(String text, JFrame frame, int yPos, LinkedList<Task> tasksList) {
        this.task = new JCheckBox("Demo Task");
        task.setBounds(100, yPos, 170, 30);
        frame.add(this.task);

        ImageIcon tempIcon = new ImageIcon("img/binLogo.png");
        Image img = tempIcon.getImage();
        Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);

        this.removeTaskButton = new JButton(icon);
        removeTaskButton.setBounds(270, yPos, 30, 30);
        frame.add(this.removeTaskButton);

        this.removeTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                tasksList.remove(Task.this);
                
                
                frame.remove(Task.this.task);
                frame.remove(Task.this.removeTaskButton);
                
              
                frame.revalidate();
                frame.repaint();
            }
        });
    }

    
}

public class ToDoList extends JFrame {
    private LinkedList<Task> tasks = new LinkedList<>();
    private int yOffset = 60; // Starting Y position for the first task.
    private final int TASK_HEIGHT = 40; // Spacing between tasks.

    public ToDoList() {
        this.setTitle("To Do List");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        
    
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        this.add(addTaskButton);

        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new Task object with the "Demo Task" name.
                Task newTask = new Task("Demo Task", ToDoList.this, yOffset,tasks);
                
                // Add the new task to the LinkedList.
                tasks.add(newTask);
                
                // Increment the Y offset for the next task.
                yOffset += TASK_HEIGHT;

                // Refresh the frame to show the new component.
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
