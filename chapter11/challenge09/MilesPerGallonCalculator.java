package challenge_09;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MilesPerGallonCalculator extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();

     private JLabel label_1 = new JLabel("Gas hold");
     private JLabel label_2 = new JLabel("Miles driven");

     private JTextField t1 = new JTextField(10);
     private JTextField t2 = new JTextField(10);

    private JButton mpgBtn = new JButton("Calculate MPG");
    private JButton exitBtn = new JButton("Exit");



    public MilesPerGallonCalculator(){


        super("Miles Per Gallon Calculator");


        panel.setLayout(new GridLayout(4, 2));

        panel.add(label_1);
        panel.add(t1);
        panel.add(label_2);
        panel.add(t2);
        panel.add(exitBtn);
        panel.add(mpgBtn);

        mainPanel.add(panel,BorderLayout.CENTER);
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));


        exitBtn.addActionListener(this);
        mpgBtn.addActionListener(this);


        add(mainPanel, BorderLayout.NORTH);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MilesPerGallonCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==exitBtn){
            System.exit(0);
        }

        if (e.getSource()==mpgBtn){

            if (!(t1.getText().isEmpty()) && !(t2.getText().isEmpty())){

                double gallons = Double.parseDouble(t1.getText());
                double miles = Double.parseDouble(t2.getText());

                DecimalFormat df = new DecimalFormat("#.00");

                JOptionPane.showMessageDialog(null,
                        "MPG: " + df.format((miles/gallons)) );

            }

        }



    }
}
