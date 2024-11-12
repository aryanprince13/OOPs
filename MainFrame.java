import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Main Frame with Choice Component");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        add(comboBox);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) e.getItem();
                    JOptionPane.showMessageDialog(MainFrame.this, "You selected: " + selectedItem);
                }
            }
        });

        JButton openChildFrameButton = new JButton("Open Child Frame");
        add(openChildFrameButton);
        openChildFrameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChildFrame childFrame = new ChildFrame();
                childFrame.setVisible(true);
            }
        });

        setVisible(true);
    }

    class ChildFrame extends JFrame {

        public ChildFrame() {
            setTitle("Child Frame");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(MainFrame.this);

            JLabel label = new JLabel("This is a child frame", JLabel.CENTER);
            add(label);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
