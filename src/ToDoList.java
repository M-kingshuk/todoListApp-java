import javax.swing.*;

class addTask {

}

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To do list");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Lets go, bitch!", SwingConstants.CENTER);
        label.setBounds(50, 200, 300, 30);
        frame.add(label);
        
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(100, 20, 200, 40);
        frame.add(addTaskButton);

        JCheckBox task = new JCheckBox("Buy milk");
        task.setBounds(100, 60, 150, 30);
        frame.add(task);
        
        frame.setVisible(true);
    }
}
