package challenge_09;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DiceSimulator extends JFrame {

    private JPanel mainPanel = new JPanel();
    private JPanel lblPanel = new JPanel();
    private JPanel btnPanel = new JPanel();

    private String[] images = {
            "src/challenge_09/sides/one.png",
            "src/challenge_09/sides/two.png",
            "src/challenge_09/sides/three.png",
            "src/challenge_09/sides/four.png",
            "src/challenge_09/sides/five.png",
            "src/challenge_09/sides/six.png"
    };


    private JButton rollBtn = new JButton("Roll");
    private JButton exitBtn = new JButton("Exit");

    private JLabel label_1;
    private JLabel label_2;

    private int num_1 = 3, num_2 = 4;


    public DiceSimulator(){

        super("Dice Simulator");
        buildPanel();

        getContentPane().setBackground(Color.RED);

        setSize(400, 300);
        add(mainPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void buildPanel(){

        mainPanel.setBackground(Color.RED);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(50,20, 20, 50));


        label_1 = new JLabel(new ImageIcon(images[num_1]));
        label_2 = new JLabel(new ImageIcon(images[num_2]));


        lblPanel.setLayout(new GridLayout(1, 2));
        lblPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        lblPanel.setBackground(Color.RED);


        lblPanel.add(label_1);
        lblPanel.add(label_2);

        btnPanel.setLayout(new GridLayout(1, 2));
        btnPanel.add(exitBtn);
        btnPanel.add(rollBtn);


        mainPanel.add(lblPanel, BorderLayout.CENTER);
        mainPanel.add(btnPanel, BorderLayout.SOUTH);

        btnPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        btnPanel.setBackground(Color.RED);

        rollBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random ran = new Random();

                num_1 = ran.nextInt(6 - 1 + 1);
                num_2 = ran.nextInt(6 - 1 + 1);

                label_1.setIcon(new ImageIcon(images[num_1]));
                label_2.setIcon(new ImageIcon(images[num_2]));

            }
        });

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new DiceSimulator();
    }
}
