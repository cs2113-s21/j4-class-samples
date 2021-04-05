import java.awt.*; // <-- OLD Java GUI
import javax.swing.*; //<-- Swing library

// Anything that begins with J is from the swing library

public class JFrameEx1{

    public static void main(String args[]){

        JFrame F[] =  new JFrame[5];


        for(int i=0;i<F.length; i++){
            JFrame f = new JFrame();
            f.setTitle("CS2113, actually I like it! ("+i+")");
            f.setSize(300,400);
            f.setLocation(2000+i*50,-100+i*50);
            F[i]=f;
        }
        

        for(int i=0;i<F.length;i++){
            F[i].setVisible(true); //make the frame visible
        }
    }
}
