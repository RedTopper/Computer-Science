import java.util.Scanner;

/**
 * Start of the program, creates user loop.
 * 
 * @author 1714057 
 * @version v1
 */
public class dice
{
    //main method
    public static void main()
    {
        //Adds dieroll class
        Dieroll die = new Dieroll();
        
        System.out.println("Welcome to Dice Roll v1, by RedHat \n\nTo begin, how many times you want to \nroll the die:");
        Scanner in = new Scanner(System.in);
        System.out.print("~$ ");
        String conf = in.nextLine();
        
        //user input loop. Use "exit" to exit.
        while(!conf.toLowerCase().equals("exit"))
        {
            System.out.println(die.getResponse(conf));
            System.out.print("~$ ");
            conf = in.nextLine();
        }
        System.out.print("Java Virtual Machine is going down for\na halt NOW!");
    }
    //A totally uncallable method that does magic things
    public static void doMagicThings()
    {
        System.out.println("I'm sorry, user, I can't allow you to do that...");
        System.out.print("Java Virtual Machine is going down for\na halt NOW!");

    }
}
