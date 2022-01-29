package challenge_07;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ShadeDesigner extends JFrame {

    private  String[] styles = {
            "Regular shades",
            "Folding shades",
            "Roman shades"
    };

    private String[] sizes = {
            "25 inches wide",
            "27 inches wide",
            "32 inches wide",
            "40 inches wide"
    };

    private    String[] colors = {
            "Natural",
            "Blue",
            "Teal",
            "Red",
            "Green"
    };

    private JPanel mainPanel = new JPanel();
    private JPanel listPanel = new JPanel();
    private JPanel resultPanel = new JPanel();

    private JLabel totalLabel = new JLabel("Total: $");
    private JTextField totalTF = new JTextField(10);

    private JList<String> styleList,sizesList,colorsList;

    private double total = 50;


    public ShadeDesigner(){

        super("Shade Designer");

        buildPanel();


        add(mainPanel, BorderLayout.NORTH);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildPanel(){

        mainPanel.setBorder(new EmptyBorder(20,20,20,20));
        listPanel.setLayout(new GridLayout(1,3));


        styleList = new JList<>(styles);
        styleList.setBorder(BorderFactory.createTitledBorder("Styles"));
        sizesList = new JList<>(sizes);
        sizesList.setBorder(BorderFactory.createTitledBorder("Sizes"));
        colorsList = new JList<>(colors);
        colorsList.setBorder(BorderFactory.createTitledBorder("Colors"));

        listPanel.add(new JScrollPane(styleList));
        listPanel.add(new JScrollPane(sizesList));
        listPanel.add(new JScrollPane(colorsList));


        resultPanel.setLayout(new GridLayout(1, 2));
        resultPanel.add(totalLabel);
        totalTF.setEditable(false);
        resultPanel.add(totalTF);

        styleList.addListSelectionListener(new StyleListener());
        sizesList.addListSelectionListener(new sizeListListener());
        colorsList.addListSelectionListener(new colorListListener());

        mainPanel.add(listPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);


    }

    private class colorListListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            String selection = (String) colorsList.getSelectedValue();

            if (!e.getValueIsAdjusting()) {

                if (selection.equalsIgnoreCase(colors[0])){
                    total += 5;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(colors[1])){
                    total += 0;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(colors[2])){
                    total += 0;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(colors[3])){
                    total += 0;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(colors[4])){
                    total += 0;
                    totalTF.setText(String.valueOf(total));
                }
            }
        }
    }
    private class sizeListListener implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e) {

            String selection = (String) sizesList.getSelectedValue();

            if (!e.getValueIsAdjusting()) {

                if (selection.equalsIgnoreCase(sizes[0])){
                    total += 0;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(sizes[1])){

                    total += 2;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(sizes[2])){
                    total += 4;
                    totalTF.setText(String.valueOf(total));
                }
                if (selection.equalsIgnoreCase(sizes[3])){
                     total += 6;
                     totalTF.setText(String.valueOf(total));
                }

            }

        }
    }
    private class StyleListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {

            String selection = (String) styleList.getSelectedValue();

            if (!e.getValueIsAdjusting()){

               if (selection.equalsIgnoreCase(styles[0])){
                   total += 0;
                   totalTF.setText(String.valueOf(total));
               }
               if (selection.equalsIgnoreCase(styles[1])){
                   total += 10;
                   totalTF.setText(String.valueOf(total));
               }
               if (selection.equalsIgnoreCase(styles[2])){
                   total += 15;
                   totalTF.setText(String.valueOf(total));
               }

            }
        }
    }
    public static void main(String[] args) {
        new ShadeDesigner();
    }
}
