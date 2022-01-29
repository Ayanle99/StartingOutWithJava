package challenge_03;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class PropertyTax extends JFrame {

    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel btnPanel = new JPanel();

    private JLabel valueLabel = new JLabel("Property value: ");
    private JTextField valueTF = new JTextField(10);
    private JButton calcBtn = new JButton("Calculate");
    private JButton exitBtn = new JButton("Exit");


    public PropertyTax(){

        super("Property Tax Calculator");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        panel.setLayout(new GridLayout(1,1));
        btnPanel.setLayout(new GridLayout(1,1));


        panel.add(valueLabel);
        panel.add(valueTF);
        mainPanel.add(panel, BorderLayout.CENTER);

        btnPanel.add(exitBtn);
        btnPanel.add(calcBtn);
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

                double actualValue = Double.parseDouble(valueTF.getText());

                double assesment = actualValue * 0.6;
                double propertyTax = assesment * 0.064;

                DecimalFormat df = new DecimalFormat("#,###.00");

                JOptionPane.showMessageDialog(null,
                        "Actual value: $" + df.format(actualValue)
                +"\nAssesment: $" + df.format(assesment)
                +"\nProperty tax: $" + df.format(propertyTax));


            }
        });

    }


    public static void main(String[] args) {
        new PropertyTax();
    }


}
