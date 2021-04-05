import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx2{


    public static void main(String args[]){

        JButton bEast = new JButton("EAST");
        JButton bWest = new JButton("WEST");
        JButton bNorth = new JButton("NORTH");
        JButton bSouth = new JButton("SOUTH");
        
        JButton bCenterNorth = new JButton("CENTER NORTH");
        JButton bCenterSouth = new JButton("CENTER SOUTH");


        JFrame frame = new JFrame();

        
        frame.add(bEast,BorderLayout.EAST);
        frame.add(bWest,BorderLayout.WEST);
        frame.add(bNorth,BorderLayout.NORTH);
        frame.add(bSouth,BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(bCenterNorth, BorderLayout.NORTH);
        panel.add(bCenterSouth, BorderLayout.SOUTH);
        
        frame.add(panel,BorderLayout.CENTER);
        
        frame.pack();
        
        frame.setLocation(2000,-100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);        
    }

}
