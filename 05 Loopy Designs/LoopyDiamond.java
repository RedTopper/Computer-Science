 /**
 * Write a description of class LoopyDiamond here.
 * Makes a Diamond!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyDiamond
{
   public static void Diamond(int x)
   {
       System.out.print(" ");
       int mid = x/2;
       int midcount = 0;
       boolean up = true;
       for( int i = 1; i < x + 1; i++)
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
