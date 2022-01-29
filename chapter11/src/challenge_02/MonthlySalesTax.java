package challenge_02;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthlySalesTax extends JFrame{

    private final double STATE_SALES_TAX = 0.04;
    private final double COUNTY_SALES_TAX = 0.02;

    private JPanel mainPanel, panel, btnPanel;
    private JLabel salesLabel;
    private JTextField salesTF;
    private JButton calculateBtn, exitBtn;

    public MonthlySalesTax(){
        super("Monthly Sales Tax");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1, 1));

        btnPanel.setBorder(new EmptyBorder(40,40, 40,40));

        salesLabel = new JLabel("Monthly Sales: ");
        salesTF = new JTextField(10);
        calculateBtn = new JButton("Calculate");
        exitBtn = new JButton("Exit");

        panel.add(salesLabel);
        panel.add(salesTF);

        mainPanel.add(panel, BorderLayout.CENTER);

        btnPanel.add(exitBtn);
        btnPanel.add(calculateBtn);

        mainPanel.add(btnPanel, BorderLayout.SOUTH);


        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!(salesTF.getText().isEmpty())){

                    double monthlySales = Double.parseDouble(salesTF.getText());

                    double countyTax = monthlySales *COUNTY_SALES_TAX;
                    double stateTax =  monthlySales * STATE_SALES_TAX;

                    JOptionPane.showMessageDialog(null,
                            "County sales tax: $" + (countyTax)
                    +"\nState sales tax: $" + stateTax
                    +"\n________________________________\n" +
                                    "\nTotal Sales tax: $" + (countyTax+stateTax));
                }else {
                    JOptionPane.showMessageDialog(null,
                            "Error: you must\nprovide sales amount.");
                }


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
        new MonthlySalesTax();
    }




}
