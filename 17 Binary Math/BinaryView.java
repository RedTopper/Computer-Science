 
/**
 * Creates the GUI interface for binary numbers.  It does not decide on or perform any actions, however the 'hooks' for the 
 * action listeners are created here.
 * 
 * @author Kyle Gillette
 * @version 5/30/04
 * 
 * Modifications by Derek Miller
 * 12-11-09
 * 
 * unsetting border on the selected mode (setORState, setAndState, setAddState) added 6/27/04 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryView
{   private JButton notFirstNumButton;                      // Buttons
    private JButton notSecondNumButton;
    private JButton twosCompFirstNumButton;
    private JButton twosCompSecondNumButton;
    private JButton mult2firstNumButton;
    private JButton div2firstNumButton;
    private JButton mult2secondNumButton;
    private JButton div2secondNumButton;
    private JButton addButton; 
    private JButton andButton; 
    private JButton orButton; 
    
    private JTextField firstIntField;                       // Fields
    private JTextField secondIntField;
    private JTextField firstBinField;
    private JTextField secondBinField;
    
    private JLabel intResultLabel = new JLabel();           // Labels
    private JLabel binResultLabel = new JLabel();
    private JLabel base10Label = new JLabel("BASE 10", JLabel.CENTER);
    private JLabel base2Label = new JLabel("BASE 2 (8-bit)", JLabel.CENTER);
    private JLabel resultLabel = new JLabel("RESULT");
    
    /**
     * Constructor 
     * 
     **/ 
    public BinaryView( BinaryControl itsApplet )                     // BinaryControl is a JApplet
    {   itsApplet.getContentPane().setLayout(new GridLayout(5,7)); 
    
        // ROW 1
        itsApplet.getContentPane().add( new JLabel(" ") );         
        itsApplet.getContentPane().add( base10Label );
        itsApplet.getContentPane().add( base2Label );
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );        

        // ROW 2
        firstIntField = new JTextField(3);
        firstBinField = new JTextField(8);
        notFirstNumButton = new JButton("NOT");
        twosCompFirstNumButton = new JButton("2s Comp");
        mult2firstNumButton = new JButton("MULT by 2");
        div2firstNumButton = new JButton("DIV by 2"); 
        
        itsApplet.getContentPane().add( new JLabel("NUM 1", JLabel.CENTER) );        
        itsApplet.getContentPane().add( firstIntField );
        itsApplet.getContentPane().add( firstBinField );
        itsApplet.getContentPane().add( notFirstNumButton );
        itsApplet.getContentPane().add( twosCompFirstNumButton );
        itsApplet.getContentPane().add( mult2firstNumButton ); 
        itsApplet.getContentPane().add( div2firstNumButton );         

        // ROW 3
        secondIntField = new JTextField(3);
        secondBinField = new JTextField(8);
        notSecondNumButton = new JButton("NOT");
        twosCompSecondNumButton = new JButton("2s Comp");
        mult2secondNumButton = new JButton("MULT by 2");
        div2secondNumButton = new JButton("DIV by 2");   
        
        
        itsApplet.getContentPane().add( new JLabel("NUM 2 ", JLabel.CENTER) );
        itsApplet.getContentPane().add( secondIntField );
        itsApplet.getContentPane().add( secondBinField );
        itsApplet.getContentPane().add( notSecondNumButton );
        itsApplet.getContentPane().add( twosCompSecondNumButton );
        itsApplet.getContentPane().add( mult2secondNumButton ); 
        itsApplet.getContentPane().add( div2secondNumButton );  
        
        // ROW 4
        itsApplet.getContentPane().add( new JLabel("RESULT base 10") );
        itsApplet.getContentPane().add( intResultLabel );
        itsApplet.getContentPane().add( new JLabel("RESULT base 2") );        
        itsApplet.getContentPane().add( binResultLabel );
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );  
        
        
        // ROW 5
        itsApplet.getContentPane().add( new JLabel(" ") );
        itsApplet.getContentPane().add( new JLabel(" ") );
        addButton = new JButton("ADD");
        itsApplet.getContentPane().add( addButton );
        andButton = new JButton("AND");
        itsApplet.getContentPane().add( andButton );
        orButton = new JButton("OR");
        itsApplet.getContentPane().add( orButton );
        
    }    

    // Field and Lable Mutators
    public void setFirstIntField(int num) { firstIntField.setText( new Integer(num).toString() );}
    public void setSecondIntField(int num) { secondIntField.setText( new Integer(num).toString() );}
    public void setFirstBinField(String bits) { firstBinField.setText( bits );}
    public void setSecondBinField(String bits) { secondBinField.setText( bits );}
    public void setIntResultLabel(int num) { intResultLabel.setText( new Integer(num).toString() );}
    public void setBinResultLabel(String bits) { binResultLabel.setText( bits );}
    
    // Field Accessors
    public int getFirstIntField() { return Integer.parseInt( firstIntField.getText() );}
    public String getFirstBinField() { return firstBinField.getText(); }  
    public int getSecondIntField() { return Integer.parseInt( secondIntField.getText() );}
    public String getSecondBinField() { return secondBinField.getText(); }  
    
    // Button and Field listeners - listeners for fields contain Field in their name
    public void notFirstListener(ActionListener a)  {   notFirstNumButton.addActionListener(a);  } 
    public void notSecondListener(ActionListener a)   {   notSecondNumButton.addActionListener(a);  } 
    public void twosCompFirstListener(ActionListener a)   {   twosCompFirstNumButton.addActionListener(a);   } 
    public void twosCompSecondListener(ActionListener a)  {   twosCompSecondNumButton.addActionListener(a);  } 
    public void mult2FirstListener(ActionListener a)   {   mult2firstNumButton.addActionListener(a);  } 
    public void mult2SecondListener(ActionListener a)  {   mult2secondNumButton.addActionListener(a);  } 
    public void div2FirstListener(ActionListener a)   {   div2firstNumButton.addActionListener(a);   } 
    public void div2SecondListener(ActionListener a)   {   div2secondNumButton.addActionListener(a);   } 
    public void firstIntFieldListener(ActionListener a)   {   firstIntField.addActionListener(a);   } 
    public void firstBinFieldListener(ActionListener a)    {   firstBinField.addActionListener(a);   } 
    public void secondIntFieldListener(ActionListener a)   {   secondIntField.addActionListener(a);   } 
    public void secondBinFieldListener(ActionListener a)    {   secondBinField.addActionListener(a);   }
    public void addListener(ActionListener a)   {   addButton.addActionListener(a);   }
    public void andListener(ActionListener a)   {   andButton.addActionListener(a);   }
    public void orListener(ActionListener a)   {   orButton.addActionListener(a);   }
}

