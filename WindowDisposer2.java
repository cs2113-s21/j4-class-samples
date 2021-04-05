import java.awt.event.*; //<-- event handling code
import javax.swing.*;
import java.util.*;

public class WindowDisposer2 extends WindowAdapter{

    private ArrayList<DisposableJFrame> winList;
    
    public WindowDisposer2(){
        super();
        winList = new ArrayList<DisposableJFrame>();
    }
    

    public void addDJFrame(DisposableJFrame f){
        winList.add(f);
    }
    
    public void windowClosing(WindowEvent e){
        
        //Liked to print out which window closed ... 
        DisposableJFrame f = (DisposableJFrame) e.getWindow();
        
        System.out.println("Window Closing! Frame with id=" + f.getId() + " is closing.");

        //remove this disposable frame
        winList.remove(f);
        
        if(winList.size() == 0){
            System.exit(0);
        }
    }
}
