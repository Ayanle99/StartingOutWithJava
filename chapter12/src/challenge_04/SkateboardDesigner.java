package challenge_04;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.channels.SelectionKey;
import java.text.DecimalFormat;

public class SkateboardDesigner extends JFrame implements ActionListener {

    private static final double SALES_TAX = 0.06;


    // wheals
    private JRadioButton fifty_one = new JRadioButton("51 mm");
    private JRadioButton fifty_five = new JRadioButton("55 mm");
    private JRadioButton sixty_one = new JRadioButton("61 mm");
    private ButtonGroup bg_1 = new ButtonGroup();

    // Truck Assemblies
    private JRadioButton ta_sevenInch = new JRadioButton("7.75-inch axle");
    private JRadioButton ta_eightInch = new JRadioButton("8-inch axle");
    private JRadioButton ta_eight_inch_and_half = new JRadioButton("8.5-inch axle ");
    private ButtonGroup bg_2 = new ButtonGroup();

    // deck
    private JRadioButton d_1 = new JRadioButton("The master Thrasher");
    private JRadioButton d_2 = new JRadioButton("The Dictator");
    private JRadioButton d_3 = new JRadioButton("The Street King");
    private ButtonGroup bg_3 = new ButtonGroup();


    // panels
    private JPanel mainPanel = new JPanel();
    private JPanel panel_1 = new JPanel();
    private JPanel panel_2 = new JPanel();
    private JPanel panel_3 = new JPanel();
    private JPanel panel_4 = new JPanel();

    // misc products
    private JCheckBox grip_tape = new JCheckBox("Grip tape");
    private JCheckBox bearings = new JCheckBox("Bearings");
    private JCheckBox riser_pads = new JCheckBox("Riser pads");
    private JCheckBox nuts_and_bolts_kit = new JCheckBox("Nuts & bolts kit");


    private JButton calcBtn = new JButton("Calculate");
    private JButton exitBtn = new JButton("Exit");


    public SkateboardDesigner(){

        super("SkateboardDesigner");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));


        panel_1.setLayout(new GridLayout(3,1));
        panel_2.setLayout(new GridLayout(3,1));
        panel_3.setLayout(new GridLayout(3,1));
        panel_4.setLayout(new GridLayout(3,3));

        panel_1.setBorder(BorderFactory.createTitledBorder("Wheels"));
        panel_2.setBorder(BorderFactory.createTitledBorder("Truck Assemblies   "));
        panel_3.setBorder(BorderFactory.createTitledBorder("Decks"));
        panel_4.setBorder(BorderFactory.createTitledBorder("Misc products"));


        panel_1.add(fifty_one);
        panel_1.add(fifty_five);
        panel_1.add(sixty_one);

        bg_1.add(fifty_one);
        bg_1.add(fifty_five);
        bg_1.add(sixty_one);

        panel_2.add(ta_sevenInch);
        panel_2.add(ta_eightInch);
        panel_2.add(ta_eight_inch_and_half);

        bg_2.add(ta_sevenInch);
        bg_2.add(ta_eightInch);
        bg_2.add(ta_eight_inch_and_half);


        panel_3.add(d_1);
        panel_3.add(d_2);
        panel_3.add(d_3);

        bg_3.add(d_1);
        bg_3.add(d_2);
        bg_3.add(d_3);


        panel_4.add(grip_tape);
        panel_4.add(bearings);
        panel_4.add(riser_pads);
        panel_4.add(nuts_and_bolts_kit);
        panel_4.add(exitBtn);
        panel_4.add(calcBtn);


        exitBtn.addActionListener(this);
        calcBtn.addActionListener(this);

        fifty_five.addActionListener(this);
        fifty_one.addActionListener(this);
        sixty_one.addActionListener(this);

        d_1.addActionListener(this);
        d_2.addActionListener(this);
        d_3.addActionListener(this);

        ta_eightInch.addActionListener(this);
        ta_eight_inch_and_half.addActionListener(this);
        ta_eightInch.addActionListener(this);


        grip_tape.addActionListener(this);
        riser_pads.addActionListener(this);
        bearings.addActionListener(this);
        nuts_and_bolts_kit.addActionListener(this);


        exitBtn.addActionListener(this);

        mainPanel.add(panel_1, BorderLayout.WEST);
        mainPanel.add(panel_2, BorderLayout.CENTER);
        mainPanel.add(panel_3, BorderLayout.EAST);
        mainPanel.add(panel_4, BorderLayout.SOUTH);

    }


    public static void main(String[] args) {
        new SkateboardDesigner();
    }

    private double getTruckCost(){
        double total = 0;

        if (ta_sevenInch.isSelected()){
            total += 35;
        }
        if (ta_eightInch.isSelected()){
            total += 45;
        }
        if (ta_eight_inch_and_half.isSelected()){
            total += 45;
        }


        return total;
    }
    private double getDeckCost(){
        double total = 0;

        if (d_3.isSelected()){
            total += 60;
        }
        if (d_2.isSelected()){
            total += 45;
        }
        if (d_3.isSelected()){
            total += 50;
        }

        return total;
    }
    private double getWhealCost(){

        double total = 0;

        // Wheels
        if (fifty_one.isSelected()){
            total = 20;
        }
        if (fifty_five.isSelected()){
            total = 22;
        }
        if (sixty_one.isSelected()){
            total = 28;
        }

        return total;
    }

    private double getMiscCost(){
        double total = 0;


        if (grip_tape.isSelected()){
            total += 10;
        }
        if (bearings.isSelected()){
            total += 30;
        }
        if (riser_pads.isSelected()){
            total += 2;
        }
        if (nuts_and_bolts_kit.isSelected()){
            total += 3;
        }


        return total;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double total_purchase = (getDeckCost()
                +getTruckCost()
                +getWhealCost()
        +getMiscCost());

        double sales_tax = total_purchase * SALES_TAX;


        DecimalFormat df = new DecimalFormat("#,###.00");

        if (e.getSource()==calcBtn){
            JOptionPane.showMessageDialog(null,
                    "Sales tax: $" + df.format(sales_tax)
                            +"\nTotal: $" + df.format(total_purchase));
        }

        // exit button
        if (e.getSource()==exitBtn){
            System.exit(0);
        }


    }
}
