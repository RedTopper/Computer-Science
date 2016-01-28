 /**
 * Write a description of class LoopyCDiamond here.
 * Makes a CDiamond!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyCDiamond
{
   public static void CDiamond(int x)
   {
       if(((double) x / (double) 2) == (double)((int) x / (int) 2))
       {
           x = x + 1;
       }
       System.out.print(" ");
       int mid = x/2;
       int midcount = 0;
       boolean up = true;
       for( int i = 1; i < x + 1; i++)
       {
           for (int j = 0; j < x; j++)
           {
               if(j == mid - midcount || j == mid + midcount)
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
           if(up == true)
           {
               midcount++;
               if(midcount >= mid)
               {
                   up = false;
                   midcount++;
               }
           }
           if(up == false)
           {
               midcount--;
           }
       }
       System.out.println("");
   }
}
