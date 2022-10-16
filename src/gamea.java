import javax.swing.*;
import java.awt.*;


public class gamea {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 600));
        frame.setTitle("Force fire go");
        frame.setBackground(Color.RED);
        frame.add(panel);
        //here is code for main menu  :)
        JButton button = new JButton("play");
        button.setBounds(50, 100, 80, 25);
        panel.add(button);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}