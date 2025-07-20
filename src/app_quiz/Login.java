package app_quiz;
import com.formdev.flatlaf.FlatIntelliJLaf;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField nameTxt;
    JButton nextBtn,backBtn;

    Login(){
        super("Login");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("app_quiz/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lbl = new JLabel(i3);

        lbl.setBounds(450,0,550,500);
        add(lbl);



        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(100,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name = new JLabel("Enter your name ");
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setBounds(160,150,300,20);
        name.setForeground(new Color(22,99,54));
        add(name);

        nameTxt = new JTextField();
        nameTxt.setBounds(80,200,300,30);
        nameTxt.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(nameTxt);

        nextBtn = new JButton("Next");
        nextBtn.setBounds(100,270,120,25);
        nextBtn.setBackground(new Color(22,99,54));
        nextBtn.setForeground(Color.WHITE);
        nextBtn.addActionListener(this);
        add(nextBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(250,270,120,25);
        backBtn.setBackground(new Color(22,99,54));
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);
        add(backBtn);


//        setUndecorated(true);
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn){

        }
        else if (e.getSource() == backBtn){
//            setVisible(false);
            System.exit(50);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        new Login();
    }

}
