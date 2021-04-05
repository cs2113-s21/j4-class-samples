import java.awt.*; // <-- OLD Java GUI
import javax.swing.*; //<-- Swing library

// Anything that begins with J is from the swing library

public class JFrameEx0{

    public static void main(String args[]){

        JFrame f = new JFrame();

        f.setTitle("CS2113, actually I like it!");
        f.setSize(300,400);
        f.setLocation(2000,-100);
        


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//call
                                                         //System.exit(0)
                                                         //when the
                                                         //frame is
                                                         //closed

        //How does it know when the frame is closed?! Great question.
        
        
        f.setVisible(true); //make the frame visible
                            //starts the GUI thread
    }

}
