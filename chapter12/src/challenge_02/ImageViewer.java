package challenge_02;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.IOException;

public class ImageViewer extends JFrame implements ActionListener {

    private String filePath = "/Users/max/IdeaProjects/chapter12/src/challenge_02/pics";

    private  File file;

    private  JPanel panel = new JPanel();
    private  JPanel mainPanel = new JPanel();

    private  JButton openBtn = new JButton("Open picture");
    private  JLabel pictureLabel = new JLabel();

    private  JFileChooser fileChooser = new JFileChooser(filePath);


    public ImageViewer(){

        super("Image Viewer");


        add(buildPanel(), BorderLayout.NORTH);
        setSize(300,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private  JPanel buildPanel(){


        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));


        openBtn.addActionListener(this);

        panel.add(openBtn);
        panel.add(pictureLabel);

        getContentPane().setBackground(Color.BLACK);
        pictureLabel.setToolTipText("hide picture");

        mainPanel.add(panel, BorderLayout.CENTER);


        mainPanel.setBackground(Color.gray);
        panel.setBackground(Color.gray);

        return mainPanel;
    }

    public static void main(String[] args) {
        new ImageViewer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        fileChooser.setAcceptAllFileFilterUsed(false);

        int option = fileChooser.showOpenDialog(ImageViewer.this);

        if(option == JFileChooser.APPROVE_OPTION){

            file = fileChooser.getSelectedFile();

            ImageIcon imageIcon = new
                    ImageIcon(new ImageIcon(String.valueOf(file)
            ).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));

            pictureLabel.setIcon(imageIcon);

        }
    }
}
