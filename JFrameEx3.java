import java.awt.*; // <-- OLD Java GUI
import java.awt.event.*; //<-- event handling code
import javax.swing.*; //<-- Swing library

// Event driven programming

public class JFrameEx3{

    public static void main(String args[]){

        DisposableJFrame F[] =  new DisposableJFrame[5];


        WindowDisposer wd = new WindowDisposer(F.length);
        
        for(int i=0;i<F.length; i++){
            DisposableJFrame f = new DisposableJFrame(i);

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
