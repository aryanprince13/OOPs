import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseInsideRectangle extends JFrame {
    private Rectangle rectangle; // Rectangle object to check mouse position

    public MouseInsideRectangle() {
        // Set the title and size of the JFrame
        setTitle("Mouse Inside Rectangle Check");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize the rectangle (x, y, width, height)
        rectangle = new Rectangle(150, 100, 200, 150);
        
        // Add a custom JPanel to handle drawing and mouse events
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the rectangle
                g.setColor(Color.BLUE);
                g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            }
        };
        
        // Add MouseMotionListener to track mouse movements
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Get mouse coordinates
                int mouseX = e.getX();
                int mouseY = e.getY();
                
                // Check if mouse is inside the rectangle
                if (rectangle.contains(mouseX, mouseY)) {
                    setTitle("Mouse Inside Rectangle");
                } else {
                    setTitle("Mouse Outside Rectangle");
                }
            }
        });

        // Add the custom panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create the window and show it
        SwingUtilities.invokeLater(() -> {
            MouseInsideRectangle frame = new MouseInsideRectangle();
            frame.setVisible(true);
        });
    }
}
