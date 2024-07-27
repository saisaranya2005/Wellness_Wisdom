package wellness;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OptionsPage extends JFrame implements ActionListener {
    public JFrame frame;
    public JButton[] optionButtons;
    public String[] optionLabels = {"Heart", "Diabetes", "Nutrition", "Hair", "Cancer", "Mental health", "Yoga", "Respiratory"};
    public List<Color> buttonColors = new ArrayList<>();

    public OptionsPage() {
        frame = new JFrame("Options Page");
        frame.setLayout(new GridLayout(0, 2)); // 2 columns
        frame.setSize(600, 600);
       buttonColors.add(new Color(255, 102, 102)); // Coral Red

buttonColors.add(new Color(245, 20, 147)); // Light Pink (light pink)
buttonColors.add(new Color(144, 238, 144)); // Light Green (light green)
buttonColors.add(new Color(173, 216, 230)); // Light Turquoise (light turquoise)
buttonColors.add(new Color(255, 165, 0)); // Light Orange (light orange)
buttonColors.add(new Color(220, 208, 255)); // Pale Indigo (pale indigo)
buttonColors.add(new Color(127, 255, 212)); // Pale Brown (pale brown)
buttonColors.add(new Color(255, 255, 192)); // Pale Yellow (pale yellow)

        
        Collections.shuffle(buttonColors);
        
        Insets buttonInsets = new Insets(10, 10, 10, 10);

        optionButtons = new JButton[8];
        for (int i = 0; i < 8; i++) {
            optionButtons[i] = new JButton(optionLabels[i]);
            optionButtons[i].setPreferredSize(new Dimension(150, 50));
            optionButtons[i].setMargin(buttonInsets);
            optionButtons[i].addActionListener(this);
            
             optionButtons[i].setBackground(buttonColors.get(i));
            optionButtons[i].setForeground(Color.BLACK);
            Font buttonFont = new Font("Times New Roman", Font.BOLD, 20);
            optionButtons[i].setFont(buttonFont);
            frame.add(optionButtons[i]);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < 8; i++) {
        if (e.getSource() == optionButtons[i]) {
            switch (i) {
                case 0:
                   frame.setVisible(false);
                   new Heart().setVisible(true);
                    break;
                case 1:
                    // Diabetes button clicked
                    
                    frame.setVisible(false);
                   new Diabetes().setVisible(true);
                    break;
                case 2:
                    frame.setVisible(false);
                    new Nutrition().setVisible(true); 
                    break;
                case 3:
                    // Hair button clicked
                    
                    frame.setVisible(false);
                   new Hair().setVisible(true);
                    break;
                case 4:
                    // Cancer button clicked
                    
                    frame.setVisible(false);
                   new Cancer().setVisible(true);
                    break;
                case 5:
                    // Mental health button clicked
                    
                    frame.setVisible(false);
                   new MentalHealth().setVisible(true);
                    break;
                case 6:
                    // Yoga button clicked
                    
                    frame.setVisible(false);
                   new Yoga().setVisible(true);
                    break;
                case 7:
                    // Respiratory button clicked
                    
                    frame.setVisible(false);
                   new Respiratory().setVisible(true);
                    break;
            }
        }
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new OptionsPage();
        });
    }
}
