package challenge_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CellPhonePackages extends JFrame  implements ActionListener{

    public static final double SALES_TAX = 0.06;

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("File");
    private JMenu options = new JMenu("Menu");

    private JLabel minutesPlan = new JLabel("\tMinutes Plan");

    private JRadioButtonMenuItem three_hundred = new JRadioButtonMenuItem("300 minutes per month");
    private JRadioButtonMenuItem eight_hundred = new JRadioButtonMenuItem("800 minutes per month");
    private JRadioButtonMenuItem oneThousand_five_hundred = new JRadioButtonMenuItem("1500 minutes per month");
    private ButtonGroup bg = new ButtonGroup();

    private JLabel priceLabel = new JLabel("Price: $", SwingConstants.CENTER);

    private JLabel phoneLabel = new JLabel("\tPhone Models");
    private JRadioButtonMenuItem model_one_hudred = new JRadioButtonMenuItem("Model 100");
    private JRadioButtonMenuItem model_one_hundred_ten = new JRadioButtonMenuItem("Model 110");
    private JRadioButtonMenuItem model_two_hundred = new JRadioButtonMenuItem("Model 200");
    private ButtonGroup bg2 = new ButtonGroup();

    private JCheckBoxMenuItem voiceMail = new JCheckBoxMenuItem("Voice mail");
    private JCheckBoxMenuItem textMessage = new JCheckBoxMenuItem("Text messaging");

    private double sub_total = 0, total = 0, tax = 0;

    public CellPhonePackages(){

        super("Cell Phone Packages");


//        System.setProperty("apple.laf.useScreenMenuBar", "true");
//        System.setProperty(
//                "com.apple.mrj.application.apple.menu.about.name", "Name");


        setComponents();

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setComponents(){

        JMenuItem exit = new JMenuItem("Exit");

        menu.add(exit);
        menuBar.add(menu);
        menuBar.add(options);

        // minutes plan
        options.add(minutesPlan);
        options.addSeparator();
        options.add(three_hundred);
        options.add(eight_hundred);
        options.add(oneThousand_five_hundred);


        options.addSeparator();
        bg.add(three_hundred);
        bg.add(eight_hundred);
        bg.add(oneThousand_five_hundred);

        // phone models
        options.add(phoneLabel);
        options.addSeparator();
        options.add(model_one_hudred);
        options.add(model_one_hundred_ten);
        options.add(model_two_hundred);


        bg2.add(model_one_hudred);
        bg2.add(model_one_hundred_ten);
        bg2.add(model_one_hundred_ten);

        // extra options
        options.add(new JLabel("\tExtra"));
        options.addSeparator();
        options.add(voiceMail);
        options.add(textMessage);


        three_hundred.addActionListener(this);
        eight_hundred.addActionListener(this);
        oneThousand_five_hundred.addActionListener(this);

        model_one_hudred.addActionListener(this);
        model_one_hundred_ten.addActionListener(this);
        model_two_hundred.addActionListener(this);

        voiceMail.addActionListener(this);
        textMessage.addActionListener(this);


        priceLabel.setFont(new Font("Helvatica", Font.BOLD, 20));
        priceLabel.setBorder(BorderFactory.createTitledBorder("Receipt"));
        setJMenuBar(menuBar);

        add(priceLabel);
    }

    public static void main(String[] args) {
        new CellPhonePackages();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        DecimalFormat df = new DecimalFormat("#,###.00");


        switch (e.getActionCommand()){

            case "300 minutes per month":

                sub_total = 45.00;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));

                break;

            case "800 minutes per month":
                sub_total = 65.00;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));
                break;

            case "1500 minutes per month":
                sub_total = 99.00;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));
                break;

            case "Model 100":
                sub_total = 29.95;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));
                break;

            case "Model 110":
                sub_total = 49.95;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));
                break;

            case "Model 200":

                sub_total = 99.95;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));

                break;

            case "Voice mail":

                sub_total = 5.00;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));

                break;

            case "Text messaging":

                sub_total = 10.00;
                tax = sub_total * SALES_TAX;
                total += sub_total+tax;
                priceLabel.setText("Total: $" + df.format(total));

                break;

        }



    }
}
