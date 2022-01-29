package challenge_05;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartSystem extends JFrame {

    private JPanel mainPanel = new JPanel();

    private JPanel bookPanel = new JPanel();
    private JPanel cartPanel = new JPanel();
    private JPanel controlPanel = new JPanel();

    private JList<String> bookList;
    private JList<String> cartList;
    private ArrayList<Double> prices = new ArrayList<>();

    private JButton removeBtn = new JButton("Remove");
    private JButton exitBtn = new JButton("Exit");
    private JButton clearAllBtn = new JButton("Clear All");
    private JButton checkOutBtn = new JButton("Check Out");


    public ShoppingCartSystem(){

        super("Shopping Cart System");

        mainPanel.setLayout(new BorderLayout());

        build_book_panel();
        build_cart_panel();
        setControlPanel();

        add(mainPanel, BorderLayout.NORTH);
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void build_cart_panel(){


        cartPanel.setBorder(BorderFactory.createTitledBorder("Shopping Cart"));

        DefaultListModel<String> model = new DefaultListModel<>();

        bookList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()){
                    String str = (String) bookList.getSelectedValue();
                    model.addElement(str);
                }
            }
        });

        cartList = new JList<String>(model);
        JScrollPane scrollPane = new JScrollPane(cartList);

        cartPanel.add(scrollPane);
        mainPanel.add(cartPanel, BorderLayout.EAST);

    }
    private void build_book_panel(){

        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        ArrayList<String> books = new ArrayList<>();
        bookPanel.setBorder(BorderFactory.createTitledBorder("Books"));

        try {

            Scanner sc = new Scanner(new File("src/challenge_05/books.txt"));

            while (sc.hasNext()){

                String[] split = sc.nextLine().split(",");

                prices.add(Double.parseDouble(split[1]));

                books.add(split[0]);

                DefaultListModel<String> model = new DefaultListModel<String>();

                for (String book : books){
                    model.addElement(book);
                }

                bookList = new JList<String>(model);


            }


        }catch (Exception e){
            System.out.println(e.toString());
        }

        JScrollPane scrollPane = new JScrollPane(bookList);
        bookPanel.add(scrollPane);
        mainPanel.add(bookPanel, BorderLayout.WEST);
    }

    private void setControlPanel(){


        controlPanel.setBorder(BorderFactory.createTitledBorder("Check Out"));

        controlPanel.add(removeBtn);
        controlPanel.add(clearAllBtn);
        controlPanel.add(exitBtn);
        controlPanel.add(checkOutBtn);


        clearAllBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultListModel<String> model = (DefaultListModel<String>) cartList.getModel();

                if (!model.isEmpty()){
                    model.removeAllElements();
                }
            }
        });


        checkOutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultListModel model = (DefaultListModel) cartList.getModel();

                double total = 0, subTotal = 0;

                ArrayList<String> selection = new ArrayList<>();

                for (int i = 0; i < model.size();i++){

                     selection.add(model.getElementAt(i).toString());

                     switch (model.getElementAt(i).toString()){

                         case "I did it It Your Way":
                             subTotal += 11.95;

                             break;

                         case "The History of Scotland":
                             subTotal += 14.50;

                             break;

                         case "Learn Calculus in One Day":
                             subTotal += 29.95;

                             break;

                         case "Feel the Stress":
                             subTotal += 18.50;
                             break;

                         default:
                     }
                }

                DecimalFormat df = new DecimalFormat("#,###.00");

                JOptionPane.showMessageDialog(null,
                        "Sub total: $" + subTotal
                +"\nTax: $" + df.format((subTotal * 0.06))
                +"\nTotal: $" + df.format((subTotal + (subTotal*0.06))) );

            }
        });


        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultListModel model = (DefaultListModel) cartList.getModel();

                String selection = (String) cartList.getSelectedValue();
                model.removeElement(selection);


            }
        });

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainPanel.add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {

        new ShoppingCartSystem();

    }




}
