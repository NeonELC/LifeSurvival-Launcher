import javax.swing.*;
import java.awt.*;


public class gamea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 600));
        frame.setTitle("Life Survival Launcher");
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