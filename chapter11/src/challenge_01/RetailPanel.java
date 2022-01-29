package challenge_01;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class RetailPanel extends JPanel {

    private JLabel wholesaleLabel, markupLabel;
    private JTextField wholesaleTF, markupTF;

    public RetailPanel(){

        setLayout(new GridLayout(3, 3));

        buildPanel();


    }

    public JTextField getWholesaleTF() {
        return wholesaleTF;
    }

    public JTextField getMarkupTF() {
        return markupTF;
    }

    private void buildPanel(){

        wholesaleLabel = new JLabel("Wholesale price: ");
        markupLabel = new JLabel("Markup %: ");
        wholesaleTF = new JTextField(10);
        markupTF = new JTextField(10);

        add(wholesaleLabel);
        add(wholesaleTF);
        add(markupLabel);
        add(markupTF);


    }
    public String getRetailPrice(){

        DecimalFormat df = new DecimalFormat("0.00");

        double retailCost = 0.0;

        double wholesale = Double.parseDouble(wholesaleTF.getText());
        double markup = Double.parseDouble(markupTF.getText()) / 100;

        markup = markup * wholesale;
        retailCost = wholesale + markup;

        return df.format(retailCost);

    }



}
