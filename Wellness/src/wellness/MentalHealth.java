package wellness;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class MentalHealth extends JFrame implements ActionListener 
{
    JButton back;
    JPanel panel;
    MentalHealth(){
        setTitle("Mental Health");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#dcfeff"));
        setSize(1300, 1000);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-09 133224.png"));
        Image i2=i1.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg = new JLabel(i3);
        add(bg);
        bg.setBounds(0,0,1300,1000);
        
        /*ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-07 212446.png"));
        Image i5=i4.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel heartips = new JLabel(i6);
        bg.add(heartips);
        heartips.setBounds(50,50,600,600);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-07 213236.png"));
        Image i8=i7.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel heartfood = new JLabel(i9);
        bg.add(heartfood);
        heartfood.setBounds(800,50,600,600);*/
        
        panel=new JPanel();
        panel.setBounds(200,150,800,600);
        panel.setBackground(Color.decode("#95B9C7")); 
        bg.add(panel);
        
        JLabel Label=new JLabel("Tips for Positive Mental Health");
        Label.setFont(new Font("Raleway",Font.BOLD,36));
        Label.setBounds(50,100,100,100);
        panel.add(Label);
        
        JLabel Info=new JLabel("<html>&#129309;Maintain a Supportive Social Network.<br/>&#128516;Manage Stress.<br/>&#127939;Regular Physical Activity<br/>&#129361;Healthy Eating Habits.<br/>&#128564Adequate Sleep<br/>&#127863;Limit Alcohol or Illicit Drugs<br/>&#128104;Seek Professional Help<br/>&#x2714;Stay Informed<br/>&#127934;Engage in Hobbies and Activities<br/>&#10084;Practice Self-Compassion<br/>&#128134;Mindfulness and Relaxation Techniques<br/>&#127919;Set Realistic Goals<br/>&#128245;Limit Screen Time<br/>&#128587;Volunteer and Give Back<br/>&#128077;Stay Active and Engaged</html>");
        Info.setBackground(Color.BLACK);
        Info.setFont(new Font("Serif",Font.PLAIN,24));
        Info.setBounds(50,-50,600,300);
        panel.add(Info);
        
        back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(975, 775, 80, 30);
	back.addActionListener(this);
	add(back);
        setLocation(145,10);
        setVisible(true);
        
    }
    public static void main(String[] args) {
                new MentalHealth();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }
}
