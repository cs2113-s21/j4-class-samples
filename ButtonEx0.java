import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEx0{

    public static void main(String args[]){

        JFrame frame = new JFrame();
        
        JButton swapButton = new JButton("Swap");
        JLabel l0 = new JLabel("0");
        JLabel l1 = new JLabel("1");

        SwapListener sw = new SwapListener(l0,l1);
        swapButton.addActionListener(sw);
        
        frame.add(l0,BorderLayout.WEST);
        frame.add(swapButton,BorderLayout.CENTER);
        frame.add(l1,BorderLayout.EAST);
        frame.pack();
        
        frame.setLocation(2000,-100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);

    }

    private static class SwapListener implements ActionListener{
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
}
