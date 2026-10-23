import javax.swing.*;
import java.awt.*;

public class SwingAssign extends
        JFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel heading;
    JLabel footer;
    JButton textButton;
    JButton colorButton;

    public SwingAssign() {

        frame = new JFrame();
        frame.setTitle("Java Swing Assignment");
        frame.setSize(800, 800);
        ImageIcon icon = new ImageIcon("images/queen_icon.png");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 245, 245));


        heading = new JLabel("JAVA SWING ASSIGNMENT", SwingConstants.CENTER);
        heading.setBounds(50, 30, 700, 80);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setOpaque(true);
        heading.setBackground(new Color(220, 220, 220));


        label = new JLabel(
                "WELCOME TO QUEEN'S FIRST JAVA SWING PROJECT",
                SwingConstants.CENTER
        );
        label.setBounds(100, 220, 600, 70);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setOpaque(true);
        label.setBackground(new Color(230, 230, 230));


        textButton = new JButton("Change Text");
        textButton.setBounds(275, 370, 250, 60);
        textButton.setFont(new Font("Arial", Font.BOLD, 18));


        colorButton = new JButton("Change Background");
        colorButton.setBounds(275, 490, 250, 60);
        colorButton.setFont(new Font("Arial", Font.BOLD, 18));


        footer = new JLabel("Created by Queen", SwingConstants.CENTER);
        footer.setBounds(250, 680, 300, 30);
        footer.setFont(new Font("Arial", Font.PLAIN, 16));


        textButton.addActionListener(e ->
                label.setText("WELCOME TO MY JAVA SWING APPLICATION!")
        );


        colorButton.addActionListener(e -> {
            Color[] colors = {
                    new Color(220, 50, 80),
                    new Color(125, 60, 180),
                    new Color(20, 145, 100),
                    new Color(240, 150, 20),
                    new Color(35, 105, 200)
            };

            Color selectedColor = colors[
                    (int) (Math.random() * colors.length)
                    ];

            panel.setBackground(selectedColor);
        });


        panel.add(heading);
        panel.add(label);
        panel.add(textButton);
        panel.add(colorButton);
        panel.add(footer);


        frame.add(panel);


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAssign();
    }
}