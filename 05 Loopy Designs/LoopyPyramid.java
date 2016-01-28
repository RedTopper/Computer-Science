 /**
 * Write a description of class LoopyPyramid here.
 * Makes a Pyramid!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyPyramid
{
   public static void pyramid(int x)
   {
       if(((double) x / (double) 2) == (double)((int) x / (int) 2))
       {
           x = x + 1;
       }
       System.out.print(" ");
       int mid = x/2;
       int midcount = 0;
       for( int i = 1; i < (x/2) + 2; i++)
       {
           for (int j = 0; j < x; j++)
           {
               if(j < mid - midcount || j > mid + midcount)
               {
                   System.out.print("  ");
               }
               else
               {
                   System.out.print("* ");
               }
           }
           System.out.println("");
           System.out.print(" ");
           midcount = midcount + 1;
       }
    System.out.println("");
   }
}
