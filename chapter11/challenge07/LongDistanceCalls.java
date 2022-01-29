package challenge_07;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class LongDistanceCalls extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel btnPanel = new JPanel();

    private JRadioButton dayTime = new JRadioButton("Daytime");
    private JRadioButton evening = new JRadioButton("Evening");
    private JRadioButton off_Peak = new JRadioButton("Off-Peak");

    private ButtonGroup bg = new ButtonGroup();

    private JTextField t1 = new JTextField(10);
    private JLabel minutesLabel = new JLabel("\tMinutes");

    private JButton calcBtn = new JButton("Calculate");
    private JButton exitBtn = new JButton("Exit");

    // rate
    private static double DAY_RATE = 0.07;
    private static double EVENING_RATE = 0.12;
    private static double OFF_PEAK_RATE = 0.05;


    public LongDistanceCalls(){


        super("Long distaance Calls");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(310, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(3,2));

        btnPanel.setLayout(new GridLayout(2, 2));


        bg.add(dayTime);
        bg.add(evening);
        bg.add(off_Peak);


        dayTime.addActionListener(this);
        evening.addActionListener(this);
        off_Peak.addActionListener(this);


        btnPanel.add(minutesLabel);
        btnPanel.add(t1);
        btnPanel.add(exitBtn);
        btnPanel.add(calcBtn);

        panel.add(dayTime);
        panel.add(evening);
        panel.add(off_Peak);

        // Registering the two buttons and
        // the three radio buttons
        exitBtn.addActionListener(this);
        calcBtn.addActionListener(this);
//        dayTime.addActionListener(this);
//        evening.addActionListener(this);
//        off_Peak.addActionListener(this);

        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(btnPanel, BorderLayout.SOUTH);

    }


    public static void main(String[] args) {
        new LongDistanceCalls();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        DecimalFormat df = new DecimalFormat("#,###.00");

        if (e.getSource()==calcBtn){

            double total = 0;

            if (dayTime.isSelected()){

                if (!t1.getText().isEmpty()){
                    int minutes = Integer.parseInt(t1.getText());
                    total += minutes * DAY_RATE;
                }

            }
            if (evening.isSelected()){
                if (!t1.getText().isEmpty()){
                    int minutes = Integer.parseInt(t1.getText());
                    total += minutes * EVENING_RATE;
                }

            }
            if (off_Peak.isSelected()){

                if (!t1.getText().isEmpty()){
                    int minutes = Integer.parseInt(t1.getText());
                    total += minutes * OFF_PEAK_RATE;
                }
            }

            int userInput = Integer.parseInt(t1.getText());

            JOptionPane.showMessageDialog(null,
                   "Hours: " + (userInput/60)+":" +(userInput%60) + " min"
            +"\nTotal: $" + df.format(total));



        }

    }
}
