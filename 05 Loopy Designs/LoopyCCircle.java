 /**
 * Write a description of class LoopyCCircle here.
 * Makes a CCircle!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyCCircle
{
   public static void CCircle(int x)
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
               if((((((j-mid) - 0) * ((j-mid) - 0)) + (((i - mid) - 0) * ((i - mid) - 2))) < ((mid * mid) + mid)) && (((((j-mid) - 0) * ((j-mid) - 0)) + (((i - mid) - 0) * ((i - mid) - 2))) > ((mid * mid) - mid)))
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
