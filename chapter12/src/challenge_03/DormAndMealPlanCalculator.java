package challenge_03;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class DormAndMealPlanCalculator extends JFrame implements ActionListener {

    // Dorms
    private static double DORM_ALLEN_HALL = 1_500;
    private static double DROM_PIKEe_HALL = 1_600;
    private static double DORM_FARTHING_HALL = 1_200;
    private static double DORM_UNIVERSITY_SUITES = 1_800;

    // Meal plan
    private static double SEVEN_DAYS_PER_WEEK = 560;
    private static double TWO_WEEKS_MEAL_PLAN = 1_095;
    private static double UNLIMITED_MEALS = 1_500;


    private JPanel mainPanel = new JPanel();
    private JPanel panel = new JPanel();

    private JLabel totalLabel = new JLabel("\tTotal: $");

    private String[] dorms = {

            "Allen Hall",
            "Pike Hall",
            "Farthing Hall",
            "University Suites"
    };

    private String[] mealPlan = {

            "7 meals per week:",
            "14 meals per week",
            "Unlimited meals"
    };

    private JComboBox<String> combo_1 = new JComboBox<String>(dorms);
    private JComboBox<String> combo_2 = new JComboBox<String>(mealPlan);


    public DormAndMealPlanCalculator(){

        super("Dorm And Meal Plan Calculator");

        buildPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void buildPanel(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        combo_1.addActionListener(this);
        combo_2.addActionListener(this);

        panel.setLayout(new GridLayout(3, 1));

        panel.add(combo_1);
        panel.add(combo_2);
        panel.add(totalLabel);


        mainPanel.add(panel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new DormAndMealPlanCalculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String dorm_selected = (String) combo_1.getSelectedItem();
        String meal_plan_selected = (String) combo_2.getSelectedItem();

        DecimalFormat df = new DecimalFormat("#,###.00");

        double total = 0;
        double meal = 0;

        if (dorm_selected.equalsIgnoreCase(dorms[0])){

            total = DORM_ALLEN_HALL;

            if (meal_plan_selected.equalsIgnoreCase(mealPlan[0])){
                meal = SEVEN_DAYS_PER_WEEK;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[1])){
                meal = TWO_WEEKS_MEAL_PLAN;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[2])){
                meal = UNLIMITED_MEALS;
            }

        }

        if (dorm_selected.equalsIgnoreCase(dorms[1])){

            total = DROM_PIKEe_HALL;

            if (meal_plan_selected.equalsIgnoreCase(mealPlan[0])){
                meal = SEVEN_DAYS_PER_WEEK;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[1])){
                meal = TWO_WEEKS_MEAL_PLAN;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[2])){
                meal = UNLIMITED_MEALS;
            }

        }

        if (dorm_selected.equalsIgnoreCase(dorms[2])){

            total = DORM_FARTHING_HALL;

            if (meal_plan_selected.equalsIgnoreCase(mealPlan[0])){
                meal = SEVEN_DAYS_PER_WEEK;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[1])){
                meal = TWO_WEEKS_MEAL_PLAN;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[2])){
                meal = UNLIMITED_MEALS;
            }


        }

        if (dorm_selected.equalsIgnoreCase(dorms[3])){

            total = DORM_UNIVERSITY_SUITES;

            if (meal_plan_selected.equalsIgnoreCase(mealPlan[0])){
                meal = SEVEN_DAYS_PER_WEEK;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[1])){
                meal = TWO_WEEKS_MEAL_PLAN;
            }else if (meal_plan_selected.equalsIgnoreCase(mealPlan[2])){
                meal = UNLIMITED_MEALS;
            }


        }


        totalLabel.setText("Total $" + df.format(total+meal));

    }
}
