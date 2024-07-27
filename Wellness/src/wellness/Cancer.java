package wellness;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class Cancer extends JFrame implements ActionListener {
    JButton back;
    Cancer() {
        setTitle("Cancer");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#dcfeff"));
        setSize(1100, 900);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-09 130249.png"));
        Image i2=i1.getImage().getScaledInstance(322,308,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg = new JLabel(i3);
        add(bg);
        bg.setBounds(500,50,322,308);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-09 130239.png"));
        Image i5=i4.getImage().getScaledInstance(322,308,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel hairtips = new JLabel(i6);
        add(hairtips);
        hairtips.setBounds(50,50,322,308);
        
        
        JLabel prevent=new JLabel("Prevention");
        prevent.setFont(new Font("Serif",Font.BOLD,32));
        prevent.setBounds(80,445,300,75);
        add(prevent);
        
        JLabel InfoP=new JLabel("<html>&#127823;Maintain healthy weight<br>&#128170;Exercise Regularly<br/>&#128684;Dont Smoke<br/>&#127823;Eat a healthy diet<br/>&#127863;Limit Alcohol<br/>&#x1F5F9;Get Screening Tests</html>");
        InfoP.setBackground(Color.BLUE);
        InfoP.setFont(new Font("Raleway", Font.PLAIN, 22));
	InfoP.setBounds(80, 510, 500, 200);
        add(InfoP);
        
        JLabel Symptoms=new JLabel("Symptoms");
        Symptoms.setFont(new Font("Serif",Font.BOLD,32));
        Symptoms.setBounds(375,445,300,75);
        add(Symptoms);
        
        
        JLabel InfoS=new JLabel("<html>&#128566;Unexplained Weight Loss<br>&#128532;Fatigue<br/>&#9995;Changes in the skin<br/>&#128546;Pain<br/>&#129319;Cough or Hoarseness<br/>&#128068;Difficulty in Swallowing<br/>&#128567;Persistent Infections<br/>&#127777;Fevers</html>");
        InfoS.setBackground(Color.BLUE);
        InfoS.setFont(new Font("Raleway",Font.PLAIN,22));
        InfoS.setBounds(375, 490, 400, 300);
        add(InfoS);
        
        JLabel Measures=new JLabel("Measures to Follow");
        Measures.setFont(new Font("Serif",Font.BOLD,32));
        Measures.setBounds(705,445,400,75);
        add(Measures);
        
        JLabel InfoM=new JLabel("<html>&#128104;Consult a doctor<br/>&#10004;Undergo Necessary Tests<br/>&#129489;Treatment Options<br/>&#129777;Supportive Care<br/>&#128105;Healthy Lifestyle<br/>&#x1F5F9;Medication Management<br/>&#129659;Regular Follow-up<br/>&#128221;Stay Informed<br/>&#127966;Alternative therapies</html>");
        InfoM.setBackground(Color.BLUE);
        InfoM.setFont(new Font("Raleway",Font.PLAIN,22));
        InfoM.setBounds(705,440,600,400);
        add(InfoM);
        
        back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(945, 800, 80, 30);
	back.addActionListener(this);
	add(back);
        setLocation(150,10);
        setVisible(true);
        
    }

    public static void main(String[] args) {
                new Cancer();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }
}
   