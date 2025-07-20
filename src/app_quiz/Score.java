package app_quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    String name;
    int score;

    Score(String name, int score) {
        this.name = name;
        this.score = score;

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("app_quiz/icons/score.png"));
        Image image = icon.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);

        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(60, 200, 200, 150);
        add(label);


        JLabel heading = new JLabel("Thank you " + name + " for playing QUIZ test.");
        heading.setBounds(100, 80, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(heading);

        JLabel Score = new JLabel("Your score is : " + score);
        Score.setBounds(350, 200, 300, 30);
        Score.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(300, 270, 120, 30);
        exit.setBackground(new Color(22, 99, 54));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("app_quiz/icons/back.png"));
        Image image2 = icon2.getImage().getScaledInstance(750, 550, Image.SCALE_DEFAULT);

        JLabel label2 = new JLabel(new ImageIcon(image2));
        label2.setBounds(0, 0, 750, 550);
        add(label2);


        setBounds(400, 150, 750, 550);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Score("User", 0);
    }
}
