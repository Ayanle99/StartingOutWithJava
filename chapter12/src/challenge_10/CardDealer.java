package challenge_10;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class CardDealer extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();
    private JPanel cardsPanel = new JPanel();
    private JPanel dealerPanel = new JPanel();


    private static final String FILE_PATH = "src/challenge_10/deck/png";
    private ArrayList<String> cards = new ArrayList<>();

    private Random random = new Random();

    private JLabel card_1;
    private JLabel card_2;

    private JButton exitBtn = new JButton("Exit");
    private JButton newGame = new JButton("New Game");

    public CardDealer(){

        super("Card Dealer");

        readCards();
        deal();

        add(mainPanel);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void readCards(){

        File folder = new File(FILE_PATH);
        File[] listOfFiles = folder.listFiles();

        try {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    cards.add(file.getAbsolutePath());
                }
            }
        }catch (NullPointerException e){
            System.out.println(e.toString());
        }

    }
    public void deal(){

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        card_1 = new JLabel();
        card_2 = new JLabel();


        cardsPanel.setLayout(new GridLayout(1, 2));
        card_1.setBorder(BorderFactory.createRaisedBevelBorder());
        card_2.setBorder(BorderFactory.createRaisedBevelBorder());


        newGame.addActionListener(this);
        exitBtn.addActionListener(this);

        cardsPanel.add(card_1);
        cardsPanel.add(card_2);

        dealerPanel.setLayout(new GridLayout(1, 2));
        dealerPanel.add(exitBtn);
        dealerPanel.add(newGame);

        mainPanel.add(cardsPanel, BorderLayout.CENTER);
        mainPanel.add(dealerPanel, BorderLayout.SOUTH);

    }


    public static void main(String[] args) {
        new CardDealer();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==newGame){


            if (cards.size() >= 1){

                int rand = random.nextInt(cards.size());
                int rand2 = random.nextInt(cards.size());

                String card1 = cards.get(rand);
                String card2 = cards.get(rand2);

                ImageIcon icon1 = new ImageIcon(card1);
                ImageIcon icon2 = new ImageIcon(card2);

                card_1.setIcon(icon1);
                card_2.setIcon(icon2);

                cards.remove(card1);
                cards.remove(card2);


            }else {

                mainPanel.setBackground(Color.RED);
                cardsPanel.setBackground(Color.RED);
                dealerPanel.setBackground(Color.RED);

                JOptionPane.showMessageDialog(null,
                        "There is no more cards on the deck left.");


            }

        }
    }
}
