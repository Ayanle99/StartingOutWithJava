package challenge_06;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

public class JoeAutomotive extends JFrame implements ItemListener, ActionListener{

    private static double OIL_CHANGE = 26.0;
    private static double LUBE_JOB = 18.00;
    private static double RADIATOR_FLUSH = 30.00;

    private static double TRANSMISSION_FLUSH = 80.00;
    private static double INSPECTION = 15.00;
    private static double MUFLER_REPLACEMENT = 100.0;
    private static double TIRE_ROTATION = 20.00;

    private JCheckBox oil_change = new JCheckBox("Oil Change");
    private JCheckBox lb = new JCheckBox("Lube Job");
    private JCheckBox radiator_flush = new JCheckBox("Radiator Flush");

    private JCheckBox transmision_flush = new JCheckBox("Transmition Flush");
    private JCheckBox inspection = new JCheckBox("Inspection");
    private JCheckBox muffler_replacement = new JCheckBox("Mufler Replacement");

    private JCheckBox tire_rotation = new JCheckBox("Tire Rotation");
    private JCheckBox nonRoutine = new JCheckBox("Non Routine");

    private JLabel hoursLabel = new JLabel("\tHours");
    private JTextField hoursTF = new JTextField(10);
    private JButton calculateBtn = new JButton("Calculate");
    private JButton exitBtn =new JButton("Exit");

    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel btnPanel = new JPanel();

    private static double total = 0;
    private static double LABOR_PER_HOUR = 20;

    public JoeAutomotive(){

        super("Joe's Automotive");

        buildPanel();

        getContentPane().setBackground(Color.decode("#17A589"));

        add(mainPanel, BorderLayout.NORTH);
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    private void buildPanel() {

        hoursLabel.setVisible(false);
        hoursTF.setVisible(false);

        mainPanel.setBackground(Color.decode("#F1948A"));
        btnPanel.setBackground(Color.decode("#EC7063"));

        panel.setLayout(new GridLayout(8, 2));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        panel.setBackground(Color.decode("#CB4335"));

        panel.setBorder(BorderFactory.createRaisedBevelBorder());

        panel.add(oil_change);
        oil_change.addItemListener(this);
        oil_change.setForeground(Color.WHITE);
        panel.add(lb);
        lb.setForeground(Color.WHITE);
        lb.addItemListener(this);
        panel.add(radiator_flush);
        radiator_flush.setForeground(Color.WHITE);
        radiator_flush.addItemListener(this);
        panel.add(transmision_flush);
        transmision_flush.setForeground(Color.WHITE);
        transmision_flush.addItemListener(this);
        panel.add(inspection);
        inspection.setForeground(Color.WHITE);
        inspection.addItemListener(this);
        panel.add(muffler_replacement);
        muffler_replacement.setForeground(Color.WHITE);
        muffler_replacement.addItemListener(this);
        panel.add(tire_rotation);
        tire_rotation.setForeground(Color.WHITE);
        tire_rotation.addItemListener(this);
        panel.add(nonRoutine);
        nonRoutine.setForeground(Color.WHITE);
        nonRoutine.addItemListener(this);

        btnPanel.setBorder(new EmptyBorder(20,20,20,20));
        hoursLabel.setForeground(Color.WHITE);
        hoursTF.setBackground(Color.decode("#CB4335"));
        hoursTF.setForeground(Color.WHITE);

        btnPanel.setLayout(new GridLayout(2,2));
        btnPanel.setBorder(BorderFactory.createRaisedBevelBorder());

        btnPanel.add(hoursLabel);
        btnPanel.add(hoursTF);
        btnPanel.add(exitBtn);
        btnPanel.add(calculateBtn);


        mainPanel.add(btnPanel, BorderLayout.SOUTH);
        mainPanel.add(panel, BorderLayout.CENTER);

        calculateBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        // set background color exit and calculator
        calculateBtn.setBackground(Color.RED);
        calculateBtn.setOpaque(true);
        calculateBtn.setForeground(Color.WHITE);
        calculateBtn.setBorderPainted(false);

        exitBtn.setBackground(Color.RED);
        exitBtn.setOpaque(true);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setBorderPainted(false);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {


        if (e.getSource()==nonRoutine && nonRoutine.isSelected()){
            hoursLabel.setVisible(true);
            hoursTF.setVisible(true);
        }else {
            hoursLabel.setVisible(false);
            hoursTF.setVisible(false);
        }

        // oil change
        // lube job
        // radiator_flush
        // transmition_flush
        // muffler_replacement
        // inspection
        // tire rotation

        if (e.getSource()== oil_change && oil_change.isSelected()){
            total += OIL_CHANGE;
        }
        if (e.getSource()== lb && lb.isSelected()){
            total += LUBE_JOB;
        }
        if (e.getSource()== radiator_flush && radiator_flush.isSelected()){
            total += RADIATOR_FLUSH;
        }

        if (e.getSource()== transmision_flush && transmision_flush.isSelected()){
            total += TRANSMISSION_FLUSH;
        }

        if (e.getSource()== muffler_replacement && muffler_replacement.isSelected()){
            total += MUFLER_REPLACEMENT;
        }

        if (e.getSource()== inspection && inspection.isSelected()){
            total += INSPECTION;
        }

        if (e.getSource()== tire_rotation && tire_rotation.isSelected()){
            total += TIRE_ROTATION;
        }


    }



    public static void main(String[] args) {
        new JoeAutomotive();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        DecimalFormat df = new DecimalFormat("#,###.00");

        double laborCharge = 0;

        if (nonRoutine.isSelected()){

            hoursTF.setVisible(true);
            hoursLabel.setVisible(true);

            if (!hoursTF.getText().isEmpty()){
                int hours = Integer.parseInt(hoursTF.getText());
                laborCharge = hours * LABOR_PER_HOUR;
            }
        }

        if (e.getSource()==exitBtn){
            System.exit(0);
        }else if (e.getSource()==calculateBtn){


            ImageIcon icon = new ImageIcon("/Users/max/Desktop/img.jpeg");

            JOptionPane.showMessageDialog(null,
                    "Total: $" + df.format(total)
                    +"\nLabor charge: $" + df.format(laborCharge),
                    "Joe's Automotive",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);


        }


    }
}
