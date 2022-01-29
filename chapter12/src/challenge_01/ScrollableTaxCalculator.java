package challenge_01;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.text.DecimalFormat;

public class ScrollableTaxCalculator extends JFrame implements ChangeListener{

    private JPanel mainPanel = new JPanel();

    private JPanel purchasePanel = new JPanel();
    private JPanel resultPanel = new JPanel();
    private JPanel sliderPanel = new JPanel();

    private JLabel purchaseLabel = new JLabel("Purchase amt: $");
    private JTextField pTF = new JTextField(10);

    private JLabel amountLabel = new JLabel("Amount: $");
    private JTextField aTF = new JTextField(10);

    private JLabel salesTax = new JLabel("Sales tax: $");
    private JTextField salesTaxTF = new JTextField(10);

    private JLabel totalLabel = new JLabel("Total: $");
    private JTextField totalTF = new JTextField(10);


    private JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 2);


    public ScrollableTaxCalculator(){

        super("Game");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        // purchase panel
        purchasePanel.setLayout(new GridLayout(1,2));
        purchasePanel.add(purchaseLabel);
        purchasePanel.add(pTF);

        purchasePanel.setBorder(BorderFactory.createTitledBorder("Purchase"));

        // result Panel
        resultPanel.setLayout(new GridLayout(3, 2));
        resultPanel.add(amountLabel);
        resultPanel.add(aTF);
        resultPanel.add(salesTax);
        resultPanel.add(salesTaxTF);
        resultPanel.add(totalLabel);
        resultPanel.add(totalTF);

        resultPanel.setBorder(BorderFactory.createTitledBorder("Results"));

        // slider pnnel
        sliderPanel.setBorder(BorderFactory.createTitledBorder("Tax"));

        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(2);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        sliderPanel.add(slider);
        slider.addChangeListener(this);

        // set result textfields to uneditable
        aTF.setEditable(false);
        salesTaxTF.setEditable(false);
        totalTF.setEditable(false);

        // adding three panels to the main panel
        mainPanel.add(purchasePanel, BorderLayout.NORTH);
        mainPanel.add(resultPanel, BorderLayout.CENTER);
        mainPanel.add(sliderPanel, BorderLayout.SOUTH);
    }


    @Override
    public void stateChanged(ChangeEvent e) {

       DecimalFormat df = new DecimalFormat("#,###.00");

       if (!pTF.getText().isEmpty()){

           double purchaseAmount = Double.parseDouble(pTF.getText());

           // get the sales tax from slider
           double salesTax = slider.getValue();
           double subTotal = (purchaseAmount * (salesTax/100));
           double total = subTotal + purchaseAmount;

           // set the result TFs
           aTF.setText(df.format(purchaseAmount));
           salesTaxTF.setText(df.format(subTotal));
           totalTF.setText(df.format(total));


       }


    }

    public static void main(String[] args) {
        new ScrollableTaxCalculator();
    }
}
