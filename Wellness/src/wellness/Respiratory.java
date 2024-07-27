package wellness;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class Respiratory extends JFrame implements ActionListener {
    JButton back;
    Respiratory(){
        setTitle("Yoga");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#92d3df"));
        setSize(1200, 900);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-09 193722.png"));
        Image i2=i1.getImage().getScaledInstance(290,570,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg1 = new JLabel(i3);
        add(bg1);
        bg1.setBounds(0,0,290,570);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Images2/Screenshot 2023-11-09 193423.png"));
        Image i5=i4.getImage().getScaledInstance(320,450,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel bg2 = new JLabel(i6);
        add(bg2);
        bg2.setBounds(435,0,320,450);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Images2/homeopath.jpg"));
        Image i8=i7.getImage().getScaledInstance(400,450,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel bg3 = new JLabel(i9);
        add(bg3);
        bg3.setBounds(800,0,400,450);
        
        JLabel prevent=new JLabel("Prevention");
        prevent.setFont(new Font("Times New Roman",Font.BOLD,32));
        prevent.setBounds(80,555,300,75);
        add(prevent);
        
        JLabel InfoP=new JLabel("<html>&#128079;Practice good Hygiene<br/>&#128685;Avoid Smoking<br/>&#128138;Drink Vitamins<br/>&#127811;Maintain a clean Environment<br/>&#128719;Use Air Purifiers<br/>&#127939;Exercise Regularly<br/>&#128105;Seek for Medical Advice<br/>&#128567;Always wear your Mask</html>");
        InfoP.setBackground(Color.BLACK);
        InfoP.setFont(new Font("Serif",Font.PLAIN,24));
        InfoP.setBounds(50,580,1200,300);
        add(InfoP);
        
        JLabel symptoms=new JLabel("Symptoms");
        symptoms.setFont(new Font("Times New Roman",Font.BOLD,32));
        symptoms.setBounds(500,445,1200,75);
        add(symptoms);
        
        JLabel InfoS=new JLabel("<html>&#128566;Breathlessness<br/>&#129319;Persistent Cough<br/>&#128528;Weight Loss<br/>&#128555;Fatigue<br/>&#127788;Wheeze<br/>&#128546;Chest Infections<br/>&#129319;Mucus Production<br/>&#128167;Coughing up Blood<br/>&#129301;Chronic Chest Pain</html>");
        InfoS.setBackground(Color.BLACK);
        InfoS.setFont(new Font("Serif",Font.PLAIN,24));
        InfoS.setBounds(485,465,1200,350);
        add(InfoS);
        
        JLabel treatment=new JLabel("Treatment");
        treatment.setFont(new Font("Times New Roman",Font.BOLD,32));
        treatment.setBounds(895,430,1200,75);
        add(treatment);
        
        JLabel InfoT=new JLabel("<html>&#127973;Surgery,Chemotherapy<br/>&#128138;Antibiotics<br/>&#127823;Maintain good Hygiene<br/>&#129319;Cover you mouth while<br/>Coughing/Sneezing<br/>&#128688;Gargles/Steam/Nasal Sprays<br/>&#129371;Intravenous Fluids<br/>&#128558;Humidified Oxygen<br/>&#129695;Ventilation Support</html>");
        InfoT.setBackground(Color.BLACK);
        InfoT.setFont(new Font("Serif",Font.PLAIN,24));
        InfoT.setBounds(865,440,1200,400);
        add(InfoT);
        
        
        back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(1050, 810, 80, 30);
	back.addActionListener(this);
	add(back);
        setLocation(145,10);
        setVisible(true);
    }
    public static void main(String[] args) {
    new Respiratory();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }

   
}