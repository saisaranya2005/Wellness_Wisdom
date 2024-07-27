package wellness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class Hair extends JFrame implements ActionListener {
    JButton back;
    Hair() {
        setTitle("Hair");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#CAE7DF"));
        setSize(1500, 1000);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 150228.png"));
        Image i2=i1.getImage().getScaledInstance(1800,1200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg = new JLabel(i3);
        add(bg);
        bg.setBounds(0,0,1500,1000);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 141528.png"));
        Image i5=i4.getImage().getScaledInstance(371,470,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel hairtips = new JLabel(i6);
        bg.add(hairtips);
        hairtips.setBounds(50,50,371,470);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 141807.png"));
        Image i8=i7.getImage().getScaledInstance(371,470,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel hairkit = new JLabel(i9);
        bg.add(hairkit);
        hairkit.setBounds(500,50,371,470);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-08 144256.png"));
        Image i11=i10.getImage().getScaledInstance(371,470,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel hair = new JLabel(i12);
        bg.add(hair);
        hair.setBounds(1000,50,371,470);
        
        JLabel label = new JLabel("<html>&#129337; Hair Care Tips <br/>"
        + "&#128110; Use a mild, sulfate-free shampoo <br/>"
        + "&#127004; Avoid hot water for hair wash <br/>"
        + "&#128175; Massage your scalp regularly <br/>"
        + "&#128111; Use a wide-tooth comb <br/>"
        + "&#128110; Trim your hair regularly <br/>"
        + "&#128227; Protect your hair from the sun <br/>"
        + "&#128226; Eat a balanced diet for healthy hair</html>");
label.setForeground(Color.BLACK);
label.setFont(new Font("Raleway", Font.BOLD, 25));
label.setBounds(100, 370, 1000, 700);
bg.add(label);

JLabel warningLabel = new JLabel("<html>Warning:<br/>"
        + "&#8226; Avoid excessive use of heating tools<br/>"
        + "&#8226; Limit exposure to chlorine in pools<br/>"
        + "&#8226; Choose sulfate-free hair products</html>");
warningLabel.setForeground(Color.BLACK);
warningLabel.setFont(new Font("Raleway", Font.BOLD, 28));
warningLabel.setBounds(600, 500, 1000, 300);
bg.add(warningLabel);

 back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(1050, 850, 80, 30);
	back.addActionListener(this);
	bg.add(back); 
        
setLocation(140, 30);
setVisible(true);

        
    }

    public static void main(String[] args) {
                new Hair();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }
        
}