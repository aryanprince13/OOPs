import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame {

    // Constructor to set up the window and mouse listeners
    public MouseEventDemo() {
        // Set the window title and default close operation
        setTitle("Mouse Event Handling Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout to null for free-form placement
        setLayout(null);

        // Create a label to display mouse event details
        JLabel label = new JLabel("Mouse Event Info", JLabel.CENTER);
        label.setBounds(50, 50, 400, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        add(label);

        // Add MouseListener to handle mouse clicks and mouse enter/exit events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered window.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse exited window.");
            }
        });

        // Add MouseMotionListener to handle mouse movements and dragging
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                label.setText("Mouse dragged to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Set the window to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the window on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new MouseEventDemo();
        });
    }
}
