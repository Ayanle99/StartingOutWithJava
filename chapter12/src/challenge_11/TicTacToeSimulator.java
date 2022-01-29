package challenge_11;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToeSimulator extends JFrame implements ActionListener {

    private JPanel mainPanel = new JPanel();
    private JPanel boardPanel = new JPanel();
    private JPanel controlPanel = new JPanel();


    private int[][] gameBoards = new int[3][3];
    private JButton exitBtn = new JButton("Exit");
    private JButton newGameBtn = new JButton("New Game");
    private JButton resetBtn = new JButton("Reset");

    private JLabel[][] labels = new JLabel[3][3];

    private boolean draw = false;


    public TicTacToeSimulator(){

        super("Tic-Tac-Toa Simulator");
        setConponents();


        add(mainPanel, BorderLayout.CENTER);
        setSize(new Dimension(500, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void setConponents() {

        mainPanel.setLayout(new BorderLayout());

        boardPanel.setLayout(new GridLayout(3,3));
        controlPanel.setLayout(new GridLayout(1,3));

        mainPanel.setBorder(new EmptyBorder(20,20,20,20));


        int x = 20, y = 20;

        for (int i = 0;i<3;i++){

            for (int j = 0;j<3;j++){

                labels[i][j] = new JLabel(" ", SwingConstants.CENTER);
                labels[i][j].setFont(new Font("Helvetica", Font.BOLD, 30));

                labels[i][j].setBounds(x,y,100,100);
                labels[i][j].setBorder(BorderFactory.createLoweredBevelBorder());

                boardPanel.add(labels[i][j]);
                x+=100;

            }
            x = 20;
            y += 100;

        }


        exitBtn.addActionListener(this);
        newGameBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        controlPanel.add(exitBtn);
        controlPanel.add(resetBtn);
        controlPanel.add(newGameBtn);


        mainPanel.add(boardPanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);


    }
    private int[][] getRandomNumbers(){

        Random random = new Random();

        for (int i = 0; i < 3;i++){

            for (int j =0;j<3;j++){

                gameBoards[i][j] = random.nextInt(2);
            }
        }

        return gameBoards;
    }
    private void updateLabels(){

        int[][] getChoices = getRandomNumbers();

        for (int i = 0;i < getChoices.length;i++){
            for (int j = 0;j<3;j++){
                int number = getChoices[i][j];
                char letter = number == 1 ? 'X' : 'O';
                labels[i][j].setText(String.valueOf(letter));

            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==resetBtn){
            for (int i = 0;i <3;i++){
                for (int j =0;j<3;j++){
                    labels[i][j].setText(" ");
                }
            }
        }
        if (e.getSource()==newGameBtn){

            updateLabels();
            getWinner();
        }

        if (e.getSource()==exitBtn){System.exit(0);}
    }
    private void getWinner(){

        if (Y_Player_Wins() && X_Player_Wins()){

            draw=true;

            if (draw){
                JOptionPane.showMessageDialog(null,
                        "Draw");
            }else {
                draw=false;
            }

        }

        if (X_Player_Wins() && !draw){
            JOptionPane.showMessageDialog(null,
                    "X player wins.");

        }

        if (Y_Player_Wins() && !draw){
            JOptionPane.showMessageDialog(null, "Y player wins.");
        }

    }

    private boolean Y_Player_Wins(){

        // check diangle 1 & 2 for O
        boolean diangle1 = labels[0][0].getText().equals("O") && labels[1][1].getText().equals("O") && labels[2][2].getText().equals("O");
        boolean diangle2 = labels[0][2].getText().equals("O") && labels[1][1].getText().equals("O") && labels[2][0].getText().equals("O");


        // check vertical axis
        boolean col_1 = labels[0][0].getText().equals("O") && labels[1][0].getText().equals("O") && labels[2][0].getText().equals("O");
        boolean col_2 = labels[0][1].getText().equals("O") && labels[1][1].getText().equals("O") && labels[2][1].getText().equals("O");
        boolean col_3 = labels[0][2].getText().equals("O") && labels[1][2].getText().equals("O") && labels[2][2].getText().equals("O");



        // check horizontally axis
        boolean h_1 = labels[0][0].getText().equals("O") && labels[0][1].getText().equals("O") && labels[0][2].getText().equals("O");
        boolean h_2 = labels[1][0].getText().equals("O") && labels[1][1].getText().equals("O") && labels[1][2].getText().equals("O");
        boolean h_3 = labels[2][0].getText().equals("O") && labels[2][1].getText().equals("O") && labels[2][2].getText().equals("O");


        return (diangle1 || diangle2) ||
                (col_1 || col_2 || col_3)
                || (h_1 || h_2 || h_3);
    }
    private boolean X_Player_Wins(){

        // check diangle 1 & 2 for X
        boolean diangle1 = labels[0][0].getText().equals("X") && labels[1][1].getText().equals("X") && labels[2][2].getText().equals("X");
        boolean diangle2 = labels[0][2].getText().equals("X") && labels[1][1].getText().equals("X") && labels[2][0].getText().equals("X");


        // check vertical axis
        boolean col_1 = labels[0][0].getText().equals("X") && labels[1][0].getText().equals("X") && labels[2][0].getText().equals("X");
        boolean col_2 = labels[0][1].getText().equals("X") && labels[1][1].getText().equals("X") && labels[2][1].getText().equals("X");
        boolean col_3 = labels[0][2].getText().equals("X") && labels[1][2].getText().equals("X") && labels[2][2].getText().equals("X");


        // check horizontally axis
        boolean h_1 = labels[0][0].getText().equals("X") && labels[0][1].getText().equals("X") && labels[0][2].getText().equals("X");
        boolean h_2 = labels[1][0].getText().equals("X") && labels[1][1].getText().equals("X") && labels[1][2].getText().equals("X");
        boolean h_3 = labels[2][0].getText().equals("X") && labels[2][1].getText().equals("X") && labels[2][2].getText().equals("X");


        return (diangle1 || diangle2) ||
                (col_1 || col_2 || col_3)
                || (h_1 || h_2 || h_3);
    }


    public static void main(String[] args) {

        new TicTacToeSimulator();
    }

}
