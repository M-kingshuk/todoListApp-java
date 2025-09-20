import javax.swing.*;

class Task {
    
}

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To do list");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // int distTask = 30;
        // JCheckBox[] tasks = new JCheckBox[1024];
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        frame.add(addTaskButton);

        frame.setVisible(true);
    }
}
