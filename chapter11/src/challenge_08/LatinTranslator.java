package challenge_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatinTranslator extends JFrame implements ActionListener {

    private JPanel panel = new JPanel();

    private JButton dexterBtn = new JButton("Dexter");
    private JButton sinisterBtn = new JButton("Sinister");
    private JButton mediumBtn = new JButton("Medium");

    public LatinTranslator(){

        super("Latin Translator");


        panel.add(sinisterBtn);
        panel.add(dexterBtn);
        panel.add(mediumBtn);

        sinisterBtn.addActionListener(this);
        dexterBtn.addActionListener(this);
        mediumBtn.addActionListener(this);


        add(panel, BorderLayout.NORTH);
        setSize(310,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==sinisterBtn){
            JOptionPane.showMessageDialog(null,
                    "\nLatin: Sinister\nEnglish: Left");
        }
        if (e.getSource()==dexterBtn){
            JOptionPane.showMessageDialog(null,
                    "\nLatin: Dexter\nEnglish: Right");
        }

        if (e.getSource()==mediumBtn){
            JOptionPane.showMessageDialog(null,
                    "Latin: Medium\nEnglish: Center");
        }


    }

    public static void main(String[] args) {
        new LatinTranslator();
    }
}
