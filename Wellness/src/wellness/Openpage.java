package wellness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Openpage extends JFrame implements ActionListener {
    JButton exit, next;
    
    Openpage() {
        setTitle("Wellness Wisdom");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-06 133153.png"));
        Image i2=i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel hand = new JLabel(i3);
        add(hand);
        hand.setBounds(0,0,700,500);
        // Add a label for the heading
        JLabel headingLabel = new JLabel("Wellness Wisdom");
        headingLabel.setBounds(200, 30, 500, 50); // Adjusted position and size
        headingLabel.setForeground(Color.black);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 30)); // Adjusted font size
        hand.add(headingLabel);

        // Add a label for the catchy slogan
        JLabel sloganLabel = new JLabel("Your Health, Your Wealth: Invest Wisely");
        sloganLabel.setBounds(160, 160, 500, 30); // Adjusted position and size
        sloganLabel.setForeground(Color.black);
        sloganLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Adjusted font size
        hand.add(sloganLabel);

        JCheckBox checkBox = new JCheckBox("<html>I understand that I should not rely completely on self-diagnosis or alternative treatments;<br>medical advice and observation from a doctor are essential.</html>");
        checkBox.setBounds(50, 250, 600, 50); // Adjusted position and size
        checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 16)); // Change the font for the checkbox text
        hand.add(checkBox);

        // Add an exit button
        exit = new JButton("Exit");
        exit.setBounds(200, 360, 100, 30); // Adjusted position and size
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        hand.add(exit);
        exit.addActionListener(this);

        // Add a "Next" button
        next = new JButton("Next");
        next.setBounds(390, 360, 100, 30); // Adjusted position and size
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        hand.add(next);
        next.addActionListener(this);
        
        setSize(700, 500); // Set the frame size
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        }
        if (ae.getSource() == next) {
            setVisible(false);
            new OptionsPage().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Openpage().setVisible(true);
        });
    }
}
