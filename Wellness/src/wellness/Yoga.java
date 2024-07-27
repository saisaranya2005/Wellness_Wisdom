package wellness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.decode;
import static java.lang.constant.ConstantDescs.NULL;

public class Yoga extends JFrame implements ActionListener {

    JButton back;

    Yoga() {
        setTitle("Yoga");
        setLayout(null);
        getContentPane().setBackground(Color.decode("#c7e5fd"));
        setSize(1300, 900);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images2/suk.png"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel bg1 = new JLabel(i3);
        add(bg1);
        bg1.setBounds(0,0,300,300);
        
        JLabel Label=new JLabel("<html>EASY POSE-<br/>SUKHASANA<br/>To Relieve Stress</html>");
        Label.setBackground(Color.BLACK);
        Label.setFont(new Font("Serif",Font.BOLD,24));
        Label.setBounds(60,300,1200,100);
        add(Label);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Images2/catcow.png"));
        Image i5=i4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel bg2 = new JLabel(i6);
        add(bg2);
        bg2.setBounds(320,10,300,300);
        
        JLabel Label1=new JLabel("<html>CAT-COW POSE<br/>Awaken the Spine<br/>and ease Back Pain</html>");
        Label1.setBackground(Color.BLACK);
        Label1.setFont(new Font("Serif",Font.BOLD,24));
        Label1.setBounds(320,300,1200,100);
        add(Label1);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Images2/treepose.png"));
        Image i8=i7.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel bg3 = new JLabel(i9);
        add(bg3);
        bg3.setBounds(630,0,300,300);
        
        JLabel Label2=new JLabel("<html>TREE-POSE-<br/>VRKSASANA<br/>To Improve Your<BR/> Balance</html>");
        Label2.setBackground(Color.BLACK);
        Label2.setFont(new Font("Serif",Font.BOLD,24));
        Label2.setBounds(660,260,1200,200);
        add(Label2);
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("Images2/dog.png"));
        Image i11=i10.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel bg4 = new JLabel(i12);
        add(bg4);
        bg4.setBounds(900,0,400,300);
        
        JLabel Label3=new JLabel("<html>ADHO MUKHO SVANASANA<br/>To Enhance Flexibility</html>");
        Label3.setBackground(Color.BLACK);
        Label3.setFont(new Font("Serif",Font.BOLD,24));
        Label3.setBounds(950,300,1200,100);
        add(Label3);
        
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("Images2/childpose1.png"));
        Image i14=i13.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        JLabel bg5 = new JLabel(i15);
        add(bg5);
        bg5.setBounds(0,400,300,300);
        
        JLabel Label4=new JLabel("<html>CHILD'S POSE-<br/>BALASANA<br/>To Help you Relax<br/>and Unwind</html>");
        Label4.setBackground(Color.BLACK);
        Label4.setFont(new Font("Serif",Font.BOLD,24));
        Label4.setBounds(50,620,1200,200);
        add(Label4);
        
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("Images2/pigeon1.png"));
        Image i17=i16.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        JLabel bg6 = new JLabel(i18);
        add(bg6);
        bg6.setBounds(320,400,300,300);
        
        JLabel Label5=new JLabel("<html>BABY PIGEON POSE<br/>To open up your hips</html>");
        Label5.setBackground(Color.BLACK);
        Label5.setFont(new Font("Serif",Font.BOLD,24));
        Label5.setBounds(340,670,1200,100);
        add(Label5);
        
        ImageIcon i19=new ImageIcon(ClassLoader.getSystemResource("Images2/mountain.jpg"));
        Image i20=i19.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i21=new ImageIcon(i20);
        JLabel bg7 = new JLabel(i21);
        add(bg7);
        bg7.setBounds(640,480,200,200);
        
        JLabel Label6=new JLabel("<html>MOUNTAIN POSE-<br/>TADASANA<br/>To Improve your<br/>Posture</html>");
        Label6.setBackground(Color.BLACK);
        Label6.setFont(new Font("Serif",Font.BOLD,24));
        Label6.setBounds(650,640,1200,200);
        add(Label6);

        ImageIcon i22=new ImageIcon(ClassLoader.getSystemResource("Images2/legup.png"));
        Image i23=i22.getImage().getScaledInstance(300,230,Image.SCALE_DEFAULT);
        ImageIcon i24=new ImageIcon(i23);
        JLabel bg8 = new JLabel(i24);
        add(bg8);
        bg8.setBounds(950,440,300,230);
        
        JLabel Label7=new JLabel("<html>LEGS UP THE WALL-<br/>VIPARITA KARANI<br/>To Restore and Revitalize</html>");
        Label7.setBackground(Color.BLACK);
        Label7.setFont(new Font("Serif",Font.BOLD,24));
        Label7.setBounds(960,675,1200,100);
        add(Label7);
        
        back = new JButton("Back");
	back.setBackground(Color.BLACK);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Raleway", Font.BOLD, 15));
	back.setBounds(1140, 800, 80, 30);
	back.addActionListener(this);
	add(back);
        setLocation(145,10);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Yoga();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
                   setVisible(false);
                   new OptionsPage().setVisible(true);
    }
    }

    
}
