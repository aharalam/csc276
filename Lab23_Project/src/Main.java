import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Some experimenting...
        // Are my images there? (these are not being displayed, but the ones inside of Lab23_Project are being shown).
        System.out.println(Main.class.getResource("/images/msu_logo.png"));
        System.out.println(Main.class.getResource("/images/um_logo.png"));
        System.out.println(Main.class.getResource("/images/osu_logo.png"));

        // When the program starts, it will show a dialog box with a welcome message
        // using JOptionPane.showMessageDialog.
        // Display a welcome message dialog box
        JOptionPane.showMessageDialog(null, "Welcome");

        // Display the welcome frame
        JFrame jFrame = new JFrame("Welcome Frame");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLayout(new BorderLayout());

        // Create panels for the buttons
        JPanel westPanel = new JPanel(new GridLayout(2, 1));
        JPanel eastPanel = new JPanel(new GridLayout(2, 1));
        JPanel southPanel = new JPanel(new GridLayout(1, 2));

        // Add two buttons to westPanel with images and rollover effects
        //JButton westButton1 = new JButton(new ImageIcon("um_logo.png"));
        JButton westButton1 = new JButton(new ImageIcon(Main.class.getResource("/images/um_logo.png")));
        //westButton1.setIcon(new ImageIcon("/images/um_logo.png"));
        westButton1.setRolloverIcon(new ImageIcon(Main.class.getResource("/images/osu_logo.png")));
        westButton1.setToolTipText("UM Logo");

        JButton westButton2 = new JButton();
        westButton2.setIcon(new ImageIcon(Main.class.getResource("/images/msu_logo.png")));
        westButton2.setToolTipText("MSU Logo");

        westPanel.add(westButton1);
        westPanel.add(westButton2);

        // Add two buttons to eastPanel
        JButton eastButton1 = new JButton("East 1");
        JButton eastButton2 = new JButton("East 2");
        eastPanel.add(eastButton1);
        eastPanel.add(eastButton2);

        // Add two buttons to southPanel
        JButton southButton1 = new JButton("South 1");
        JButton southButton2 = new JButton("South 2");
        southPanel.add(southButton1);
        southPanel.add(southButton2);

        // Add panels to the frame
        jFrame.add(westPanel, BorderLayout.WEST);
        jFrame.add(eastPanel, BorderLayout.EAST);
        jFrame.add(southPanel, BorderLayout.SOUTH);

        // Set frame visibility to true
        jFrame.setVisible(true);
    }
}
