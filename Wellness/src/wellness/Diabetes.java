package wellness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class Diabetes extends JFrame implements ActionListener {
    JButton back;
    Diabetes() {
        setTitle("Diabetes");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#CAE7DF"));
        setSize(1500, 1000);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 140512.png"));
        Image i2=i1.getImage().getScaledInstance(1800,1200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg = new JLabel(i3);
        add(bg);
        bg.setBounds(0,0,1500,1000);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 134203.png"));
        Image i5=i4.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel heartips = new JLabel(i6);
        bg.add(heartips);
        heartips.setBounds(50,50,600,600);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 134458.png"));
        Image i8=i7.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel heartfood = new JLabel(i9);
        bg.add(heartfood);
        heartfood.setBounds(800,50,600,600);
        
        JLabel label = new JLabel("<html>&#127825; Water or Zero-Calorie Drink <br/>&#127843;Non starchy vegetables <br/>&#127822;Carbohydrates and protein  foods</html>");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Raleway", Font.BOLD, 30));
        label.setBounds(100, 600, 1000, 300);
        bg.add(label);
          
         JLabel warningLabel = new JLabel("<html>Warning:<br/>&#8226; Avoid smoking and tobacco use<br/>&#8226; Never walk on bare foot in indoors even<br/>&#8226 Choose good fats over bad fats</html>");
         warningLabel.setForeground(Color.BLACK);
         warningLabel.setFont(new Font("Raleway", Font.BOLD, 28));
         warningLabel.setBounds(800, 600, 1000, 300);
         bg.add(warningLabel);
         
          back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(1050, 870, 80, 30);
	back.addActionListener(this);
	bg.add(back);
        
         setLocation(140,30);
         setVisible(true);
        
    }

    public static void main(String[] args) {
                new Diabetes();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }
        
}