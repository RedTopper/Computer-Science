 
/**
 * Class that represents Binary numbers and their operations. 
 * APCS related: Underlying implementation (int array in this example) should be able to be easily changed to ArrayList, LinkedList, String, ... 
 * The number of bits, REGISTER_SIZE, is also easily changed. 
 * Students will get practice with common "array" operations: traversing a list forwards & backwards, rotating elements, checking the values
 * of each element, changing the values in elements, throwing exceptions, string operations (substring & concatenation), (possibly) 
 * Integer.toString, boolean flags, and modulo '%'. 
 * <B><U>NON-APCS:</U></B> use of 'this' to call a particular constructor. <B><U>NOTES:</U></B>  Contains some typical student solutions and
 * some not so typical solutions.  For example: twosComplement and int2bin call each other (mutual recursion), but don't have to be written this way. 
 * 
 * @author Kyle Gillette
 * @version 4-2-02
 * 
 * Modifications by Derek Miller
 * 12-11-09
 */

public class Binary implements Bin
{   private int [] bit;                            // The underlying data structure that holds the bits. 
    private final static int REGISTER_SIZE = 8;   // Number of bits - some arbitrary size is necessary in order represent negative numbers.

    // Only the following need to be changed if the underlying implementation is changed.
    public int getBit(int nth) { return bit[nth]; }
    public void setBit(int nth, int value) { bit[nth] = value; }
    
    public Binary() { bit = new int [REGISTER_SIZE]; }    // The default constructor - called by all other constructors

    // This constructor takes a binary number as a parameter called anyBin
    // It then sets the current binary number (this) to the value of anyBin
    // The default constructor is called using this() before the values of the bit array are set
    public Binary( Binary anyBin )
    {   
        this();
        for( int i = 0; i < REGISTER_SIZE; i++) {
            bit[i] = anyBin.getBit(i);
        }
    }

    // This constructor takes a decimal number as a parameter called number
    // It then sets the current binary number (this) to the binary value of number
    // The default constructor is called using this() before the values of the bit array are set
    public Binary( int number )
    {  
        this();
        Binary anyBin = new Binary(int2bin(number));
        for( int i = 0; i < REGISTER_SIZE; i++) {
            bit[i] = anyBin.getBit(i);
        }
    }
    
    // This constructor takes a String as a parameter called bitString
    // It then sets the current binary number (this) to the binary representation of the String
    // This is necessary because of the GUI we are using for the Java applet
    // The default constructor is called using this() before the values of the bit array are set 
    public Binary( String bitString )                   
    {  
        this(); 
        if(bitString.length() != REGISTER_SIZE) {
            throw new IllegalArgumentException( "Number is not " + REGISTER_SIZE + " Bits." );
        }
        for( int i = 0; i < REGISTER_SIZE; i++) {
            int j = Integer.parseInt(bitString.substring(i, i + 1));
            bit[i] = j;
        }
    } 
    
    // Converts the current binary number (this) to a String
    // You will need to convert each bit individually to do this...a loop sounds nice
    public String toString()                          
    {   
        String str = "";
        for( int i = 0; i < REGISTER_SIZE; i++) {
            Integer j = new Integer(0);
            j = bit[i];
            str =  str + j.toString();
        }
        return str;
    }

    // Converts the parameter, num, into a binary number
    // The value of this should not change since this method returns a NEW binary number
    public Binary int2bin( int num )         
    {   
        Binary anyBin = new Binary();
        boolean neg = false;
        if(num < 0) {
            neg = true;
            num = num * -1;
        }
        int atRegister = REGISTER_SIZE - 1;
        int remainder = num;
        while( remainder != 0) {
            anyBin.setBit(atRegister, remainder % 2);
            atRegister--;
            remainder = remainder / 2;
            if(atRegister == -2) {
                 throw new IllegalArgumentException( "Number exceeds a signed " + REGISTER_SIZE + " Bits." );
            }
        }
        if(neg) {
            anyBin = anyBin.twosComplement();
        }
       return anyBin;
    }    
    
    // Converts the current binary number (this) to an integer
    public int bin2int()
    {   
       Binary anyBin = new Binary(this);
       int j = 0;
       int l = 1;
       boolean neg = false;
       if(this.bit[0] == 1) {
           anyBin = new Binary(anyBin.not());
           neg = true;
       }
       for( int i = REGISTER_SIZE - 1; i >= 0; i--) {
           for(int k = 0; k < ((i - REGISTER_SIZE) * -1) - 1; k++) {
               l *= 2;
            }
            j += anyBin.getBit(i) * l;
            l = 1;
       }
       if(neg) {
            j = j * -1;
            j--;
       }
       return j;
    }       
    
    // Find the opposite of every bit in the current binary number (this)
    // Do not actually change the value of this
    public Binary not()
    {   
        Binary anyBin = new Binary();
        for(int i = 0; i < REGISTER_SIZE; i++) {
            if(bit[i] == 0) {
                anyBin.setBit(i, 1);
            } else {
                anyBin.setBit(i, 0);
            }
        }
        return new Binary(anyBin);
    }
    
    // Add the current binary number (this) to the value sent as rhs (right-hand side)
    // Do not actually change the value of this
    public Binary add( Binary rhs )
    {   
        Binary anyBin = new Binary();
        int carry = 0;
        for(int i = REGISTER_SIZE - 1; i >= 0; i--) {
            carry = this.getBit(i) + rhs.getBit(i) + carry;
            if(carry == 0) {
                anyBin.setBit(i, 0);
            } else if(carry == 1) {
                anyBin.setBit(i, 1);
                carry = 0;
            } else if(carry == 2){
                anyBin.setBit(i, 0);
                carry = 1;
            } else if(carry == 3){
                anyBin.setBit(i, 1);
                carry = 1;
            }
        }
        return anyBin;
     }   
     
     public Binary and( Binary rhs )
    {   
        Binary anyBin = new Binary();
        int carry = 0;
        for(int i = REGISTER_SIZE - 1; i >= 0; i--) {
            boolean one = bit[i] == 1;
            boolean two = rhs.getBit(i) == 1;
            if(one && two){
                anyBin.setBit(i, 1);
            }
        }
        return anyBin;
     }   
     
     public Binary or( Binary rhs )
    {   
        Binary anyBin = new Binary();
        int carry = 0;
        for(int i = REGISTER_SIZE - 1; i >= 0; i--) {
            boolean one = bit[i] == 1;
            boolean two = rhs.getBit(i) == 1;
            if(one || two){
                anyBin.setBit(i, 1);
            }
        }
        return anyBin;
     }   
    
    // Find the Two's Complement of the current binary number (this)
    public Binary twosComplement()                                
    {   
        Binary anyBin = new Binary();
        anyBin = this.not();
        anyBin = anyBin.add(new Binary("00000001"));
        return anyBin;
    }            
    
    // Rotates all bits to the left of the current binary number (this) and adds a 0 on the right
    // Do not actually change the value of this
    // Used for binary multiplication by 2
    public Binary rotateLeft()
    {   
        Binary anyBin = new Binary();
        for(int i = 0; i < REGISTER_SIZE - 1; i++) {
            anyBin.setBit(i, bit[i + 1]);
        }
        return anyBin;
    }    

    // Rotates all bits to the right of the current binary number (this) and adds a 0 on the left
    // Do not actually change the value of this
    // Used for binary division by 2
    public Binary rotateRight()                        
    {   
        Binary anyBin = new Binary();
        for(int i = 1; i < REGISTER_SIZE; i++) {
            anyBin.setBit(i, bit[i - 1]);
        }
        return anyBin;
    }        
}
