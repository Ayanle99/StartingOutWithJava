package challenge_05;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TheaterRevenue extends JFrame {


    private TheaterPanel theaterPanel = new TheaterPanel();
    private JPanel mainPanel = new JPanel();
    private JPanel btnPanel = new JPanel();

    private JButton calcBtn = new JButton("Calc");
    private JButton exitBtn=new JButton("Exit");


    public TheaterRevenue(){

        super("Theater Revenue");

        buildPanel();


        add(mainPanel, BorderLayout.NORTH);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        btnPanel.setLayout(new GridLayout(1, 2));
        btnPanel.add(exitBtn);
        btnPanel.add(calcBtn);

        mainPanel.add(theaterPanel, BorderLayout.CENTER);
        mainPanel.add(btnPanel, BorderLayout.SOUTH);


        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                DecimalFormat df = new DecimalFormat("#,###.00");

                JOptionPane.showMessageDialog(null,
                        "Gross revenue adult: $" + theaterPanel.getGross_1()
                +"\nNet: $" + df.format(theaterPanel.getnet_1())
                +"\nGross revenue child: $" + df.format(theaterPanel.getGross_2())
                +"\nNet: $" + df.format(theaterPanel.getnet_2())
                +"\nTotal gross rev: $" + df.format(theaterPanel.getTotalGross())
                +"\nTotal net: $" + df.format(theaterPanel.getTotalNet()))
                ;

            }
        });

    }


    public static void main(String[] args) {
        new TheaterRevenue();
    }





}
