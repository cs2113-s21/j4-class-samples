import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEx1 extends JFrame{

    public ButtonEx1(){

        super();
        
        JButton swapButton = new JButton("Swap");
        JLabel l0 = new JLabel("0");
        JLabel l1 = new JLabel("1");

        SwapListener sw = new SwapListener(l0,l1);
        swapButton.addActionListener(sw);
        
        this.add(l0,BorderLayout.WEST);
        this.add(swapButton,BorderLayout.CENTER);
        this.add(l1,BorderLayout.EAST);
        this.pack();
        
        this.setLocation(2000,-100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    
    private class SwapListener implements ActionListener{
        private JLabel l0;
        private JLabel l1;

        public SwapListener(JLabel l0, JLabel l1){
            this.l0 = l0;
            this.l1 = l1;
        }
        
        public void actionPerformed(ActionEvent e){
            String tmp = l0.getText();
            l0.setText(l1.getText());
            l1.setText(tmp);
        }
    }

    public static void main(String args[]){
        
        ButtonEx1 frame = new ButtonEx1();               
        frame.setVisible(true);

    }

}
