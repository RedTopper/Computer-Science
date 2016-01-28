
/**
 * Write a description of class LoopyTriangle here.
 * Makes a triangle!
 * x = width and height
 * 
 * @author 1714057 
 * @version 1
 */
public class LoopyTriangle
{
   public static void triangle(int x)
   {
       System.out.print(" ");
       int blank = x;
       for( int i = 1; i < (x+1); i++)
       {
           for (int j = 0; j < (x-blank+1); j++)
           {
               System.out.print("* ");
           }
           System.out.println("");
           System.out.print(" ");
           blank = x-i;
       }
       System.out.println("");
   }
}
