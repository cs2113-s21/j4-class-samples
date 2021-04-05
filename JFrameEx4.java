import java.awt.*; // <-- OLD Java GUI
import java.awt.event.*; //<-- event handling code
import javax.swing.*; //<-- Swing library

// Event driven programming

public class JFrameEx4{

    public static void main(String args[]){

        DisposableJFrame F[] =  new DisposableJFrame[5];


        WindowDisposer2 wd = new WindowDisposer2();
        
        for(int i=0;i<F.length; i++){
            DisposableJFrame f = new DisposableJFrame(i);

            wd.addDJFrame(f);
            
            f.addWindowListener(wd); //registering this instance as
                                     //the object whose methods get
                                     //called when a window event
                                     //occurs. 
            
            F[i]=f;
        }
        

        for(int i=0;i<F.length;i++){
            F[i].setVisible(true); //make the frame visible
        }

        //could add more windows at this point
    }
}
