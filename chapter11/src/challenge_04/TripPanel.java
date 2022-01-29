package challenge_04;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class TripPanel extends JPanel {

    // allowed expenses for the trip
    private static final int ALLOWED_EXPENSES = 6000;

    // day,airfare, and car rental labels
    private JLabel dayLabel = new JLabel(" Days on trip");
    private JLabel airfareLabel = new JLabel(" Airfare");
    private JLabel carRentalLabel = new JLabel(" Car rental fee");

    // milesDriven,parking, and taxi labels
    private JLabel milesDrivenLabel = new JLabel(" Miles driven");
    private JLabel parkingFeeLabel = new JLabel("  Parking fee");
    private JLabel taxiChargesLabel = new JLabel(" Taxi charges");

    // conference, and lodging label
    private JLabel conferenceLabel = new JLabel(" Confrence fee");
    private JLabel lodgingLabel = new JLabel(" Lodging charges");

    // dayTF,airfare, and carRental TFs
    private JTextField dayTF = new JTextField(10);
    private JTextField airfareTF = new JTextField(10);
    private JTextField carRentalTF = new JTextField(10);

    // milesDriven, parking, and taxi TFs
    private JTextField milesDrivenTF = new JTextField(10);
    private JTextField parkingFeeTF = new JTextField(10);
    private JTextField taxiChargesTF = new JTextField(10);

    // conference textfield and lodging textfields
    private JTextField conferenceTF = new JTextField(10);
    private JTextField lodgingTF = new JTextField(10);

    private double totalExpenses = 0.0;

    public TripPanel(){

        buildPanel();
    }

    private void buildPanel() {

        setLayout(new GridLayout(8,8));

        setBackground(Color.decode("#FF3333"));

        add(dayLabel);
        add(dayTF);

        add(airfareLabel);
        add(airfareTF);

        add(carRentalLabel);
        add(carRentalTF);

        add(milesDrivenLabel);
        add(milesDrivenTF);

        add(parkingFeeLabel);
        add(parkingFeeTF);

        add(taxiChargesLabel);
        add(taxiChargesTF);

        add(conferenceLabel);
        add(conferenceTF);

        add(lodgingLabel);
        add(lodgingTF);


        // set background of labels
        setStyle();

    }

    private void setStyle(){

        dayLabel.setForeground(Color.WHITE);
        airfareLabel.setForeground(Color.WHITE);
        carRentalLabel.setForeground(Color.WHITE);

        milesDrivenLabel.setForeground(Color.WHITE);
        parkingFeeLabel.setForeground(Color.WHITE);
        dayLabel.setForeground(Color.WHITE);

        taxiChargesLabel.setForeground(Color.WHITE);
        conferenceLabel.setForeground(Color.WHITE);
        lodgingLabel.setForeground(Color.WHITE);

        dayTF.setBackground(Color.RED);
        dayTF.setForeground(Color.WHITE);

        airfareTF.setBackground(Color.RED);
        airfareTF.setForeground(Color.WHITE);

        carRentalTF.setBackground(Color.RED);
        carRentalTF.setForeground(Color.WHITE);

        milesDrivenTF.setBackground(Color.RED);
        milesDrivenTF.setForeground(Color.WHITE);

        parkingFeeTF.setBackground(Color.RED);
        parkingFeeTF.setForeground(Color.WHITE);

        taxiChargesTF.setBackground(Color.RED);
        taxiChargesTF.setForeground(Color.WHITE);

        conferenceTF.setBackground(Color.RED);
        conferenceTF.setForeground(Color.WHITE);

        lodgingTF.setBackground(Color.RED);
        lodgingTF.setForeground(Color.WHITE);


    }

    private int getDays(){
        int days = 0;

        if (!dayTF.getText().isEmpty()){
            days = Integer.parseInt(dayTF.getText());
        }

        return days;
    }

    private double getExpenses(){

        totalExpenses += (getDays() * 37);

        if (!airfareTF.getText().isEmpty()){
            double airFare = Double.parseDouble(airfareTF.getText().toString());
            totalExpenses += airFare;
        }

        if (!lodgingTF.getText().isEmpty()){
            double lodging = Double.parseDouble(lodgingTF.getText().toString());
            totalExpenses += (getDays() * 95);
        }

        if (!conferenceTF.getText().isEmpty()){

            double conf = Double.parseDouble(conferenceTF.getText());
            totalExpenses += conf;

        }

        if (!taxiChargesTF.getText().isEmpty()){

            totalExpenses += (getDays() * 20);

        }

        if (!parkingFeeTF.getText().isEmpty()){

            totalExpenses += (getDays() * 10);

        }


        if (!milesDrivenTF.getText().isEmpty()){

             double miles = Double.parseDouble(milesDrivenTF.getText());
             if (miles > 0){
                 totalExpenses += miles * 0.27;
             }else {
                 totalExpenses += 0;
             }

        }

        if (!carRentalTF.getText().isEmpty()){
            totalExpenses += Double.parseDouble(carRentalTF.getText());
        }

        return totalExpenses;

    }
    public double getTotalExpenses(){
        return getExpenses();
    }
    public double getTotalAllowedExpenses(){
        return ALLOWED_EXPENSES;
    }
    public double getExcess(){

        double excess = 0;

        if (totalExpenses > ALLOWED_EXPENSES){
            excess = ALLOWED_EXPENSES-totalExpenses;
        }else {
            excess=0;
        }

        return excess;
    }
    public double getSavedAmount(){
        double amount = 0;

        if (totalExpenses < ALLOWED_EXPENSES){
            amount = ALLOWED_EXPENSES-totalExpenses;
        }else {
            amount=0;
        }
        return amount;
    }


}
