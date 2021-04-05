import java.awt.*; // <-- OLD Java GUI
import java.awt.event.*; //<-- event handling code
import javax.swing.*; //<-- Swing library

// Event driven programming

public class JFrameEx2{

    public static void main(String args[]){

        JFrame F[] =  new JFrame[5];


        WindowDisposer wd = new WindowDisposer(F.length);
        
        for(int i=0;i<F.length; i++){
            JFrame f = new JFrame();
            f.setTitle("CS2113, actually I like it! ("+i+")");
            f.setSize(300,400);
            f.setLocation(2000+i*50,-100+i*50);
            f.addWindowListener(wd); //registering this instance as
                                     //the object whose methods get
                                     //called when a window event
                                     //occurs. 
            
            F[i]=f;
        }
        

        for(int i=0;i<F.length;i++){
            F[i].setVisible(true); //make the frame visible
        }
    }
}
