 /**
 * Write a description of class LoopyCircle here.
 * Makes a Circle!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyCircle
{
   public static void Circle(int x)
   {
       System.out.print(" ");
       int mid = x/2;
       int cX;
       int cY;
       int midcount = 0;
       boolean up = true;
       for( int i = 0; i <= x; i++)
       {
           for (int j = 0; j <= x; j++)
           {
               if(((((j-mid) - 0) * ((j-mid) - 0)) + (((i - mid) - 0) * ((i - mid) - 0))) < ((mid * mid) + mid))
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }
           }
           System.out.println("");
           System.out.print(" ");
       }
       System.out.println("");
   }
}
