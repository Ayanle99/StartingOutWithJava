package challenge_10;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFehrenheit extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();

    private JLabel celsiusLabel = new JLabel("Celsius");
    private JTextField celsiusTF = new JTextField(10);

    private JButton exitBtn = new JButton("Exit");
    private JButton calcBtn = new JButton("Calculate");

    public CelsiusToFehrenheit(){

        super("Celsius To Fehrenheit");

        panel.setLayout(new GridLayout(2,2));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));


        panel.add(celsiusLabel);
        panel.add(celsiusTF);
        panel.add(exitBtn);
        panel.add(calcBtn);


        exitBtn.addActionListener(this);
        calcBtn.addActionListener(this);


        mainPanel.add(panel, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.NORTH);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==exitBtn){
            System.exit(0);
        }

        if (e.getSource()==calcBtn){

            if (!celsiusTF.getText().isEmpty()){

                double celsius = Double.parseDouble(celsiusTF.getText());

                double fahrenheit = (9.0/5.0) * celsius + 32;

                JOptionPane.showMessageDialog(null,
                        "Fahrenheit: " + fahrenheit);

            }


        }

    }

    public static void main(String[] args) {
        new CelsiusToFehrenheit();
    }
}
