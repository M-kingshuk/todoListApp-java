import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Task {
    JCheckBox task;
    JButton removeTaskButton;

    public Task(String text, JFrame frame, JPanel taskPanel, int yPos, ArrayList<Task> tasks) {
        this.task = new JCheckBox(text);
        this.task.setBounds(0, yPos, 170, 30);
        frame.add(this.task);

        ImageIcon tempIcon = new ImageIcon("img/binLogo.png");
        Image img = tempIcon.getImage();
        Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);

        this.removeTaskButton = new JButton(icon);
        this.removeTaskButton.setBounds(170, yPos, 30, 30);
        frame.add(this.removeTaskButton);

        this.removeTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskPanel.remove(Task.this.task);
                taskPanel.remove(Task.this.removeTaskButton);
                tasks.remove(Task.this);

                int newY = 0;
                for (Task currentTask : tasks) {
                    currentTask.task.setBounds(0, newY, 170, 30);
                    currentTask.removeTaskButton.setBounds(170, newY, 30, 30);
                    newY += 30;
                }

                frame.revalidate();
                frame.repaint();
            }
        });
    }
}

public class ToDoList extends JFrame {
    int yPos = 30;
    ArrayList<Task> tasks = new ArrayList<>();

    public ToDoList() {
        this.setTitle("To Do List");
        this.setSize(400, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(198, 217, 238));

        ImageIcon appIcon = new ImageIcon("img/appIcon.png");
        this.setIconImage(appIcon.getImage());

        JLabel header = new JLabel("Created by Kingshuk and Shourjo");
        header.setBounds(110, 0, 200, 20);
        Font tempFont = header.getFont();
        Font headerFont = tempFont.deriveFont(10f);
        header.setFont(headerFont);
        this.add(header);
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        this.add(addTaskButton);

        JPanel taskPanel = new JPanel();
        taskPanel.setLayout(null);
        taskPanel.setBackground(new Color(198, 217, 238));
        taskPanel.setBounds(100, 60, 200, 500);
        this.add(taskPanel);

        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskName = JOptionPane.showInputDialog(ToDoList.this, "Enter task: ", "New Task", JOptionPane.PLAIN_MESSAGE);

                if (taskName != null && !taskName.isBlank()) {
                    int totalTask = taskPanel.getComponentCount() / 2;
                    Task newTask = new Task(taskName, ToDoList.this, taskPanel, yPos * totalTask, tasks);
                    tasks.add(newTask);
                    taskPanel.add(newTask.task);
                    taskPanel.add(newTask.removeTaskButton);
                    
                    ToDoList.this.revalidate();
                    ToDoList.this.repaint();
                }
            }
        });

        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ToDoList();
    }
}
