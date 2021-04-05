import javax.swing.*;

public class DisposableJFrame extends JFrame{

    private int id;


    public DisposableJFrame(int id){
        super();
        this.id = id;
        this.setTitle("CS2113, actually I like it! ("+id+")");
        this.setSize(300,400);
        this.setLocation(2000+id*50,-100+id*50);

    }
    
    public int getId(){
        return id;
    }

    //rest of this functionality comes from extending JFrame

}
