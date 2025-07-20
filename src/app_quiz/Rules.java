package app_quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton startBtn,backBtn;
    String name;
    Rules(String name){
        this.name = name;
        JLabel heading = new JLabel("Welcome "+name+" To QUIZ TEST");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70,120,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(new Color(22,99,54));
        rules.setText(
                "<html>"+
                        "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                        "2. There are a total 10 questions. " + "<br><br>" +
                        "3. You only have 15 seconds to answer the question." + "<br><br>" +
                        "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                        "5. No talking." + "<br><br>" +
                        "6. No one else can be in the room with you." + "<br><br>" +
                "<html>"
        );
        add(rules);

        backBtn = new JButton("Back");
        backBtn.setBounds(200,430,100,30);
        backBtn.setBackground(new Color(22,99,54));
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);
        add(backBtn);

        startBtn = new JButton("Start");
        startBtn.setBounds(350,430,100,30);
        startBtn.setBackground(new Color(22,99,54));
        startBtn.setForeground(Color.WHITE);
        startBtn.addActionListener(this);
        add(startBtn);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("app_quiz/icons/back.png"));
        Image i2 = i1.getImage().getScaledInstance(700,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLbl = new JLabel(i3);

        imgLbl.setBounds(0,0,700,550);
        add(imgLbl);


        setLayout(null);
        setBounds(250,100,700,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn){
            setVisible(false);
            new Quiz(name);
        }
        else if (e.getSource() == backBtn){
            new Login();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
