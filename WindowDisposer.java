import java.awt.event.*; //<-- event handling code
import javax.swing.*;

public class WindowDisposer extends WindowAdapter{

    private int numWindows;
    
    public WindowDisposer(int numWindows){
        super();
        this.numWindows = numWindows;
    }
    

    public void 	windowClosing(WindowEvent e){
        
        //Liked to print out which window closed ... 
        DisposableJFrame f = (DisposableJFrame) e.getWindow();
        
        System.out.println("Window Closing! Frame with id=" + f.getId() + " is closing.");
        if(--numWindows == 0){
            System.exit(0);
        }
    }
}
