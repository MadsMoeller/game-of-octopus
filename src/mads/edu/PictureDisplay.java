package mads.edu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PictureDisplay {

    public static void displayPicture() {
        ImageIcon image = new ImageIcon("res/the dream of the fishermans wife.jpg");

        JLabel label = new JLabel();
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setTitle("Octoerotica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        frame.add(label);
        frame.pack();
    }
}
