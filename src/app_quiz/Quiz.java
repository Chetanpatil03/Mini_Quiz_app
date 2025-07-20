package app_quiz;

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {

    JLabel qnoLbl,questionsLbl;

    Quiz(){
        super("Quiz");

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("app_quiz/icons/quiz.png"));
        Image image = icon.getImage().getScaledInstance(1440,292,Image.SCALE_DEFAULT);
        JLabel lblImg = new JLabel(new ImageIcon(image));
        lblImg.setBounds(0,0,1440,292);
        add(lblImg);

        qnoLbl = new JLabel();
        qnoLbl.setBounds(100,450,50,30);
        qnoLbl.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qnoLbl);

        questionsLbl = new JLabel();
        questionsLbl.setBounds(150,450,50,30);
        questionsLbl.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(questionsLbl);




        getContentPane().setBackground(Color.WHITE);
        setBounds(0,0,1440,850);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
