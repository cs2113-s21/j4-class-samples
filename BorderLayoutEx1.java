import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx1{


    public static void main(String args[]){

        JButton bEast = new JButton("EAST");
        JButton bWest = new JButton("WEST");
        JButton bNorth = new JButton("NORTH");
        JButton bSouth = new JButton("SOUTH");
        JButton bCenter = new JButton("CENTER");


        JFrame frame = new JFrame();

        frame.add(bEast,BorderLayout.EAST);
        frame.add(bWest,BorderLayout.WEST);
        frame.add(bNorth,BorderLayout.NORTH);
        frame.add(bSouth,BorderLayout.SOUTH);
        frame.add(bCenter,BorderLayout.CENTER);
        frame.pack();
        
        frame.setLocation(2000,-100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);        
    }

}
