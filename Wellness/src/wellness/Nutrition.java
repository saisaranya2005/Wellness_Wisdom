package wellness;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nutrition extends JFrame implements ActionListener {
    JButton back;

    Nutrition() {
        setTitle("Nutrition");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#CAE7DF"));
        setSize(1200, 900);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-07 235616.png"));
        Image i2 = i1.getImage().getScaledInstance(1200, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bg = new JLabel(i3);
        add(bg);
        bg.setBounds(0, 0, 1200, 900);
        JLabel headingLabel = new JLabel("Nutrition Tips");
        headingLabel.setBounds(450, 30, 500, 50); 
        headingLabel.setForeground(Color.black);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 30));
        bg.add(headingLabel);

        JPanel displayBox = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(253, 228, 222, 192));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        displayBox.setLayout(new BorderLayout());
        displayBox.setBounds(240, 100, 700, 700);
        bg.add(displayBox);

         
        JLabel nutritionLabel = new JLabel("<html>   &#127825; Eat a variety of fruits and vegetables<br/>   &#127843; Limit sugary drinks and snacks<br/>  &#127822; Choose whole grains over refined grains  <br/>" +
                "   &#127866; Limit salt and sodium intake<br/>   &#127818; Include lean protein sources<br/>   &#127807; Drink plenty of water<br/>" +
                "   &#127794; Consume dairy products for calcium<br/>   &#127819; Opt for healthy cooking methods<br/>   &#127812; Eat smaller, frequent meals<br/>" +
                "   &#127808; Reduce added sugar intake<br/>   &#127803; Monitor portion sizes<br/>   &#127805; Include fiber-rich foods<br/>" +
                "   &#127810; Plan balanced and colorful meals<br/>   &#127810; Avoid processed and fast food<br/>   &#127807; Stay hydrated throughout the day<br/>" +
                "   &#127805; Cook and prepare meals at home<br/>   &#127825; Encourage family meals<br/>   &#127823; Read food labels for information<br/>" +
                "  &#127803; Be mindful of emotional eating<br/>  &#127810; Get regular physical activity<br/>   &#127817; Get enough sleep for health<br/></html>");
        nutritionLabel.setForeground(Color.BLACK);
        Font labelFont = new Font("Times New Roman", Font.BOLD, 25);
        nutritionLabel.setFont(labelFont);
        nutritionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nutritionLabel.setVerticalAlignment(SwingConstants.CENTER);

        displayBox.add(nutritionLabel, BorderLayout.CENTER);

         back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(750, 810, 80, 30);
	back.addActionListener(this);
	bg.add(back);
        
        setLocation(170, 30);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Nutrition();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }
}
