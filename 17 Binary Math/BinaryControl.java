  
/**
 * Class that controls events in the GUI.  There are two uses of inner-classes in this example: named (Mode, OrMode, AndMode, AddMode) and 
 * anonymous (used for all the listeners.)  <B><U>NAMED INNER CLASSES</U></B>The interface Mode specifies one method - setMode - that is 
 * called almost every method in this class.  The behavior of setMode will change depending on whether Mode is an OrMode, AndMode, or AddMode.
 * This is a neat use of polymorphism and avoids the use of explicit dispatch (if-thens) to do the desired behavior.  Of course, it would be 
 * easy to create a Mode class that has a field that remembers it's state - OR, AND, or ADD - and dispatches the correct behavior ...  
 * <B><U>ANONYMOUS INNER CLASSES</U></B> are very cool.  If we avoid them, then I would have to create a named class (or named inner-class)
 * for every action listener - ugh!  The are similar to something we already know how to do.  Consider:<break><code>LineSeg a = new LineSeg( 
 * new Point(0,0), new Point(3,4) );</code> vs. <break>Point x = new Point(0,0);<break>Point y = new Point(3,4);<break>LineSeg a = new 
 * LineSeg(x,y);<break><break>Clearly, the one that uses named variables is longer.  The first creates two anonymous Points - simple!  Anonymous
 * inner classes are similar - you don't name the class, you just create it (and its methods inside) right where you need it.  It is, of course,
 * a one shot deal.  You can't use it elsewhere.  OrMode is used two places, but AndMode and AddMode are used in one place each so they could have 
 * been written as anonymous inner-classes (OrMode could have, but duplicate code would be in two places.)
 * 
 * @author Kyle Gillette
 * @version 5-30-04
 * 
 * Modifications by Derek Miller
 * 12-11-09
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryControl extends JApplet 
{   private BinaryView view;    
    

    public void addBinary()
        {   
            Binary first = new Binary( view.getFirstBinField() );
            Binary second = new Binary( view.getSecondBinField() );
            view.setIntResultLabel( first.add(second).bin2int() );
            view.setBinResultLabel( first.add(second).toString() ); 
        } 
        
        public void andBinary()
        {   
            Binary first = new Binary( view.getFirstBinField() );
            Binary second = new Binary( view.getSecondBinField() );
            view.setIntResultLabel( first.and(second).bin2int() );
            view.setBinResultLabel( first.and(second).toString() ); 
        } 
        
        public void orBinary()
        {   
            Binary first = new Binary( view.getFirstBinField() );
            Binary second = new Binary( view.getSecondBinField() );
            view.setIntResultLabel( first.or(second).bin2int() );
            view.setBinResultLabel( first.or(second).toString() ); 
        } 
    
     /**
     * Creates a view, then sets up the listeners.
     */ 
        
    public void init()                                
    {   view = new BinaryView(this);        // A copy of 'this' is sent to the view.
        
        
        
        /* The following anonymous inner-class deserves some explanation.  It should not be possible to instantiate an ActionListener (it
         * is an interface.)  Notice that is is immediately followed by braces and a definition for the actionPerformed method, so now it 
         * has 'implemented' the interface and is no longer abstract.  The syntax does take some getting used to as it looks like a call to
         * a constructor.
         */
        view.firstIntFieldListener(new ActionListener()  
        {   public void actionPerformed(ActionEvent event)   
            {   view.setFirstBinField( new Binary().int2bin( view.getFirstIntField() ).toString() );
                addBinary();           // Updates the view specified by the Mode.
            }
        } );   

        view.firstBinFieldListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   view.setFirstIntField( new Binary(view.getFirstBinField()).bin2int() );                                            
                addBinary();
            }
        } );    
        
        view.secondIntFieldListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {  view.setSecondBinField( new Binary().int2bin( view.getSecondIntField() ).toString() );                                             
                addBinary();
            }
        } );   

        view.secondBinFieldListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   view.setSecondIntField( new Binary(view.getSecondBinField()).bin2int() );                                            
                addBinary();
            }
        } );                   

        view.notFirstListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary not = new Binary( view.getFirstBinField() ).not();                                            
                view.setFirstBinField( not.toString() );
                view.setFirstIntField( not.bin2int() );
                addBinary();
            }
        } );  
        
        view.notSecondListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary not = new Binary( view.getSecondBinField() ).not();                                            
                view.setSecondBinField( not.toString() );
                view.setSecondIntField( not.bin2int() ); 
                addBinary();
            }
        } );  
        
        view.twosCompFirstListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary twosComp = new Binary( view.getFirstBinField() ).twosComplement();                                            
                view.setFirstBinField( twosComp.toString() );
                view.setFirstIntField( twosComp.bin2int() ); 
                addBinary();
            }
        } );   
        
        view.twosCompSecondListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary twosComp = new Binary( view.getSecondBinField() ).twosComplement();                                            
                view.setSecondBinField( twosComp.toString() );
                view.setSecondIntField( twosComp.bin2int() ); 
                addBinary();
            }
        } );          

        view.mult2FirstListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary rotateLeft = new Binary( view.getFirstBinField() ).rotateLeft();                                            
                view.setFirstBinField( rotateLeft.toString() );
                view.setFirstIntField( rotateLeft.bin2int() ); 
                addBinary();
            }
        } );   
 
        view.mult2SecondListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary rotateLeft = new Binary( view.getSecondBinField() ).rotateLeft();                                            
                view.setSecondBinField( rotateLeft.toString() );
                view.setSecondIntField( rotateLeft.bin2int() ); 
                addBinary();
            }
        } );   
 
        view.div2FirstListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary rotateRight = new Binary( view.getFirstBinField() ).rotateRight();                                            
                view.setFirstBinField( rotateRight.toString() );
                view.setFirstIntField( rotateRight.bin2int() ); 
                addBinary();
            }
        } );   
 
        view.div2SecondListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   Binary rotateRight = new Binary( view.getSecondBinField() ).rotateRight();                                            
                view.setSecondBinField( rotateRight.toString() );
                view.setSecondIntField( rotateRight.bin2int() ); 
                addBinary();
            }
        } );
        
        view.addListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   
                addBinary();
            }
        } );   
        
        view.andListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   
                andBinary();
            }
        } ); 
        
        view.orListener(new ActionListener()            
        {   public void actionPerformed(ActionEvent event)   
            {   
                orBinary();
            }
        } ); 
    }
}

