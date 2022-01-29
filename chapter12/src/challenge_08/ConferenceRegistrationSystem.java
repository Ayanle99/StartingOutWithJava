package challenge_08;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConferenceRegistrationSystem extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();

    private JPanel feePanel = new JPanel();
    private JPanel workshopPanel = new JPanel();
    private JPanel controlPanel = new JPanel();

    // workshops
    private JCheckBox introEcom = new JCheckBox("Introduction to E-commerce ");
    private JCheckBox futureWeb = new JCheckBox("The Future of the Web ");
    private JCheckBox advJava = new JCheckBox("Advanced Java Programming ");
    private JCheckBox netSecurity = new JCheckBox("Network Security ");

    // optional
    private JCheckBox keynote = new JCheckBox("Keynote/dinner");

    // fees
    private JRadioButton regular = new JRadioButton("Regular");
    private JRadioButton student = new JRadioButton("Student ");
    private ButtonGroup bg = new ButtonGroup();

    // totals
    private JLabel totalLabel = new JLabel("Total: $");
    private JTextField totalTF = new JTextField(10);
    private JButton calculateBtn = new JButton("Calculate");
    private JButton clearTF = new JButton("Clear");

    private double total = 0;


    public ConferenceRegistrationSystem(){


        super("ConferenceRegistrationSystem");

        buildPanel();


        add(mainPanel, BorderLayout.NORTH);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void buildPanel(){

        mainPanel.setBorder(new EmptyBorder(50, 20, 20, 50));
        mainPanel.setLayout(new BorderLayout());

        feePanel.setLayout(new GridLayout(2, 1));
        feePanel.setBorder(BorderFactory.createTitledBorder("Fees"));

        bg.add(regular);
        bg.add(student);

        feePanel.add(regular);
        feePanel.add(student);

        workshopPanel.setLayout(new GridLayout(4, 1));
        workshopPanel.setBorder(BorderFactory.createTitledBorder("Workshops"));

        workshopPanel.add(introEcom);
        workshopPanel.add(futureWeb);
        workshopPanel.add(advJava);
        workshopPanel.add(netSecurity);


        controlPanel.setLayout(new GridLayout(1, 4));
        controlPanel.add(totalLabel);
        totalTF.setEditable(false);
        controlPanel.add(totalTF);
        controlPanel.add(calculateBtn);
        controlPanel.add(clearTF);



        regular.addActionListener(this);
        student.addActionListener(this);
        introEcom.addActionListener(this);
        futureWeb.addActionListener(this);
        netSecurity.addActionListener(this);
        advJava.addActionListener(this);
        keynote.addActionListener(this);
        calculateBtn.addActionListener(this);
        clearTF.addActionListener(this);

        mainPanel.add(feePanel, BorderLayout.WEST);
        mainPanel.add(workshopPanel, BorderLayout.CENTER);
        mainPanel.add(keynote, BorderLayout.EAST);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new ConferenceRegistrationSystem();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==clearTF){
            total = 0;

            bg.clearSelection();

            introEcom.setSelected(false);
            futureWeb.setSelected(false);
            advJava.setSelected(false);
            netSecurity.setSelected(false);
            keynote.setSelected(false);

            totalTF.setText("");
        }
        if (e.getSource()==keynote){
            total += 40;
        }
        if (e.getSource()==regular){
            total += 895;
        }
        if (e.getSource()==student){
            total += 495;
        }


        if (e.getSource()==calculateBtn){

            DecimalFormat df = new DecimalFormat("#,###.00");
            totalTF.setText(df.format(total));
        }

        if (e.getSource()==introEcom){
            total += 295;
        }

        if (e.getSource()==futureWeb){
            total += 295;
        }

        if (e.getSource()==advJava){
            total += 395;
        }
        if (e.getSource()==netSecurity){
            total += 395;
        }


    }
}
