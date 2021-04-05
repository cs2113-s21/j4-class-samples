import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame{

    //TextFields! 
    private JTextField fromValue;
    private JTextField toValue;

    //dropdown menus
    private JComboBox<String> fromUnits;
    private JComboBox<String> toUnits;
    
    private final String[] units = {
        "feet", "inches", "meters", "centimeters"
    };
    
    private final double[] cfact = {
        1.0000, 1.0 / 12, 3.28084, 0.0328084
    };

    public UnitConverter(){
        super();

        fromValue = new JTextField("1.0", 10);
        toValue   = new JTextField("1.0", 10);
        fromUnits = new JComboBox<String>(units); //dropdown options of from/to
        toUnits   = new JComboBox<String>(units);
        toValue.setEditable(false); //do not let the result be edited

        // Create panel with flow layout and add GUI elements
        JPanel dpanel = new JPanel(new FlowLayout()); 
        dpanel.add(new JLabel("from: "));
        dpanel.add(fromValue);
        dpanel.add(fromUnits);
        dpanel.add(new JLabel(" to: "));
        dpanel.add(toValue);
        dpanel.add(toUnits);

        // fromValue.addActionListener(new ActionListener(){
        //         public void actionPerformed(ActionEvent e){ convert();}
        //     });
        // toUnits.addActionListener(new ActionListener(){
        //         public void actionPerformed(ActionEvent e){ convert();}
        //     });
        // fromUnits.addActionListener(new ActionListener(){
        //         public void actionPerformed(ActionEvent e){ convert();}
        //     });

        fromValue.addActionListener((e) -> convert());
        toUnits.addActionListener((e) -> convert());
        fromUnits.addActionListener((e) -> convert());


        fromValue.getDocument().addDocumentListener(new DocumentListener(){
                public void changedUpdate(DocumentEvent e){ convert();}
                public void removeUpdate(DocumentEvent e){ convert();}
                public void insertUpdate(DocumentEvent e){ convert();}
                
            });
        
        this.add(dpanel);
        
        this.setLocation(2000,-100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }


    private void convert(){

        //get the index selected in the comboboxes
        int fIdx = fromUnits.getSelectedIndex();
        int tIdx = toUnits.getSelectedIndex();

        //retrieve the from value as a double
        double fVal;
        try{
            fVal = Double.parseDouble(fromValue.getText());
        }catch(NumberFormatException e){
            return;
        }

        //first convert from value to feet and then divde by the
        //convert to units
        double tVal = (fVal*cfact[fIdx])/cfact[tIdx];
             
        //round to 3 decimal places
        tVal = Math.round(tVal * 1000.0)/1000.0;
             
        toValue.setText(""+tVal); //set the toValue text field

    }
        
    public static void main(String args[]){
        UnitConverter uc = new UnitConverter();
        uc.setVisible(true);
    }

}
