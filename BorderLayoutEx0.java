import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx0{


    public static void main(String args[]){

        JButton button1 = new JButton("Button 1");
        JFrame frame = new JFrame();

        frame.add(button1,BorderLayout.CENTER);
        frame.pack();
        frame.setLocation(2000,-100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);        
    }

}
