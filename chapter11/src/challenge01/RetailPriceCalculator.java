package challenge_01;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetailPriceCalculator extends JFrame {

    private RetailPanel retailPanel;
    private JPanel mainPanel, btnPanel;

    private JButton calculateBtn, exitBtn;


    public RetailPriceCalculator(){

        super("Retail Price Calculator");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(310, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        retailPanel = new RetailPanel();

        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1, 2));

        calculateBtn = new JButton("Retail Price");
        exitBtn = new JButton("Exit");

        btnPanel.add(exitBtn);
        btnPanel.add(calculateBtn);

        mainPanel.add(btnPanel, BorderLayout.SOUTH);
        mainPanel.add(retailPanel, BorderLayout.CENTER);

        calculateBtn.addActionListener(new CalculateBtnListener());
        exitBtn.addActionListener(new ExitBtnListener());


    }
    private class ExitBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class CalculateBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JTextField wholesale  = retailPanel.getWholesaleTF();
            JTextField markup  = retailPanel.getMarkupTF();

            if (!(wholesale.getText().isEmpty()) && !(markup.getText().isEmpty())){

                JOptionPane.showMessageDialog(null,
                        "Retail price $" + retailPanel.getRetailPrice());
            }else {
                JOptionPane.showMessageDialog(null,
                        "Error: you must fill\nall text fields.");
            }

        }
    }

    public static void main(String[] args) {
        new RetailPriceCalculator();
    }

}
