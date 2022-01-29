package challenge_05;

import javax.swing.*;
import java.awt.*;

public class TheaterPanel extends JPanel {


    private JLabel label_1 = new JLabel("Price per adult ticket");
    private JLabel label_2 = new JLabel("Number of adult ticket sold");
    private JLabel label_3 = new JLabel("Price per child ticket");
    private JLabel label_4 = new JLabel("Number of child tickets sold");

    private JTextField t1 = new JTextField(10);
    private JTextField t2 = new JTextField(10);
    private JTextField t3 = new JTextField(10);
    private JTextField t4 = new JTextField(10);

    private static final double  BOX_OFFICE_RECEIPT = 0.20;

    public TheaterPanel(){


        setLayout(new GridLayout(4, 2));

        add(label_1);
        add(t1);
        add(label_2);
        add(t2);
        add(label_3);
        add(t3);
        add(label_4);
        add(t4);

    }

    public double getGross_1(){
        double gross = 0;

        if (!t1.getText().isEmpty() && !t2.getText().isEmpty()){
            gross += Double.parseDouble(t1.getText()) *
                    Double.parseDouble(t2.getText());
        }

        return gross;
    }

    public double getnet_1(){
        return getGross_1() * BOX_OFFICE_RECEIPT;
    }

    public double getGross_2(){
        double gross = 0;

        if (!t3.getText().isEmpty() && !t4.getText().isEmpty()){
            gross += Double.parseDouble(t3.getText()) *
                    Double.parseDouble(t4.getText());
        }

        return gross;
    }

    public double getnet_2(){
        return getGross_2() * BOX_OFFICE_RECEIPT;
    }

    public double getTotalGross(){
        return getGross_1()+getGross_2();
    }

    public double getTotalNet(){
        return getnet_1()+getnet_2();
    }




}
