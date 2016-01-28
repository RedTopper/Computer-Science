 
/**
 * Class that represents Binary numbers and operations.
 * 
 * @author Kyle Gillette
 * @version 6-19-04
 */

public interface Bin 
{   /**
    *  Returns the String representation of a binary number.
    *  @return the String representation of a binary number.
    */ 
    public String toString();

    /**
    *  Returns the bitwise not representation of a binary number (1s become 0s and 0s become 1s.)
    *  @return the bitwise not representation of a binary number.
    */  
    public Binary not();

    /**
    *  Returns the sum of two binary numbers. 
    *  @param rhs the Binary number being added.
    *  @return the sum of two binary numbers.
    */     
    public Binary add( Binary rhs ); 
    
    /**
    *  Returns the sum of two binary numbers. 
    *  @param rhs the Binary number being added.
    *  @return the sum of two binary numbers.
    */     
    public Binary and( Binary rhs ); 
    
    /**
    *  Returns the sum of two binary numbers. 
    *  @param rhs the Binary number being added.
    *  @return the sum of two binary numbers.
    */     
    public Binary or( Binary rhs ); 
    
    /**
    *  Returns the representation of a binary number where each bit has been move to the left one position ( a 0 is put in the rightmost position.)
    *  @return the representation of a binary number whose bits have been rotated left.
    */   
    public Binary rotateLeft();

    /**
    *  Returns the representation of a binary number where each bit has been move to the right one position ( a 0 is put in the leftmost position.)
    *  @return the representation of a binary number whose bits have been rotated right.
    */      
    public Binary rotateRight();
     
    /**
    *  Returns the Binary number that is equivalent to the integer number given.
    *  @param num the decimal number to be converted to Binary.
    *  @return the converted Binary number.
    */         
    public Binary int2bin( int num );

    /**
    *  Returns the decimal value of the current Binary number. 
    *  @return the decimal value of the current Binary number. 
    */         
    public int bin2int();
  
    /**
    *  Returns the additive inverse value of the current Binary number (equivalent to multiplying by -1 .) 
    *  @return the additive inverse value of the current Binary number. 
    */        
    public Binary twosComplement();
}
