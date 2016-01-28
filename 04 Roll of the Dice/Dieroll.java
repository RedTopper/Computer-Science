import java.util.Arrays;
/**
 * Dieroll handles and computes the user's input.
 * 
 * @author 1714057
 * @version v1
 */
public class Dieroll
{
    int amountOfDieRolls = -1;
    int amountOfSides = -1;
    int user = -1;
    int height = -1;
    //So the program does not crash, rolls must exist.
    int[] rolls = new int[1];
    //Config vars.
    boolean fullConf = false;
    boolean compute = false;
    
    public String getResponse(String conf)
    {
        //Basically called when the program is started to start converting numbers from the user
        if( fullConf == false )
        {
            if( isInteger(conf) > 0)
            {
                //Hey! That's a number, store it in user!
                user = isInteger(conf);
            }
            else
            {
                //Something went wrong!
                return "\"" + conf + "\" is not a valid 32 bit positive number!";
            }
        }
        //If we got here, then it has either been fully configed or it is a valid number
        
        //Since the first statement breaks the operation with a return, the words can never
        //reach these if statement until conf is true.
        //Compute calls dieRoll and stores it in the array int rolls[]
        if( conf.equals("compute") )
        {
            System.out.println("Loading...");
            dieRoll();
            return "Ok, type view or debug to see the chart!";
        }
        //Prints the array to the screen
        if( compute == true && conf.equals("debug") )
        {
            return convertArray(rolls);
        }
        //Prints the graph
        if( compute == true && conf.equals("view") )
        {
            graph();
            return "Ok, here you go.";
        }
        //Resets all of the vars to the defult so you can restart. This will also re-create the array
        if( conf.equals("reset") )
        {
            amountOfDieRolls = -1;
            amountOfSides = -1;
            user = -1;
            height = -1;
            fullConf = false;
            compute = false;
            return "Ok, let's restart. How many times do \nyou want to roll the die?";
        }
        //called if not configed yet.
        if( amountOfDieRolls < 0 )
        {
            //Positive numbers, please!
            if( user > 0)
            {
                amountOfDieRolls = user;
                return "Ok, " + Integer.toString(user) + 
                " times. Next, amount of sides \non that die, please:";
            }
        }
        //called if not configured yet
        if( amountOfSides < 1 )
        {
            // A die must have 2 sides!
            //This resets the 
            if( user > 1 && user < 33 )
            {
                amountOfSides = user;
                rolls = new int[(amountOfSides * 2) - 1];
                return "Ok, " + Integer.toString(user) +
                " sides on that die. Next, the \nheight of the graph (32 reccomended):";

            }
            else
            {
                return "Oh, and it needs to be between 2 and 32:";
            }
        }
        
        if( height < 1 )
        {
            // A die must have 2 sides!
            //This resets the 
            if( user > 15 && user < 129 )
            {
                height = user;
                fullConf = true; //all done
                rolls = new int[(amountOfSides * 2) - 1];
                return "Ok, the graph will be " + Integer.toString(user) +
                " chars \nhigh. Type compute to go, or reset \nto reset:";

            }
            else
            {
                return "Oh, and it needs to be between 16 and 128:";
            }
        }
        //Literally nothing returned true. God freaking, user, listen to the program!
        return "Huh? No, I don't understand \"" + conf + "\"";
    }
    
    //Rolls the die.
    public void dieRoll()
    {
        double die1;
        double die2;
        int tempint;
        for(int i = 0; i < amountOfDieRolls; i++)
        {
            //rolls any number 0 to amount of sides - 1
            die1 = (Math.random() * (amountOfSides)); //die 1
            die2 = (Math.random() * (amountOfSides)); //die 2
            tempint = ((int) (die1)) + 1; //convert die1 to int, also shifts from (0 thru (sides - 1)) to (1 thru sides) 
            tempint = tempint + ((int) (die2)) + 1; //add and convert die2
            rolls[tempint - 2] = rolls[tempint - 2] + 1; //store it, shifts all data over 2 
            
        }

        compute = true; //all done
    }
    
    //Checks if user input is an integer.
    public static int isInteger(String s)
    {
        try 
        { 
            Integer.parseInt(s); 
        }
        catch(NumberFormatException e) 
        { 
            return -1; 
        }
        // only got here if we didn't return false
        return Integer.parseInt(s);
    }
    
    //used only for debug.
    public String convertArray(int[] var)
    {
        return Arrays.toString(var);
    }
    
    //makes and prints graph to the screen
    public void graph()
    {
        int max = getMax(rolls);
        int[] percent = new int[rolls.length];
        //computes the percents for each value
        for(int i = 0; i < rolls.length; i++)
        {
            percent[i] = (int)(((double) rolls[i] / (double) max) * (double) height);
        }
        //makes the top of the graph
        System.out.print("--");
        for(int i = 0; i < rolls.length; i++)
        {
            System.out.print("----");
        }
        System.out.println("");
        //if the percent is above a value, it makes a " ** ", else the bar is blank.
        for(int i = height; i > 0; i--)
        {
            System.out.print("|");
            for(int j = 0; j < rolls.length; j++)
            {
                if(percent[j] >= i)
                {
                    System.out.print(" ** ");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println("|");
        }
        System.out.print(" ");
        //makes the numbers at the bottom
        for(int i = 2; i < rolls.length + 2; i++)
        {
            String temp = "";
            temp = Integer.toString(i);
            if(temp.length() == 1)
            {
                System.out.print(" " + Integer.toString(i) + "  ");
            }
            else
            {
                System.out.print(" " + Integer.toString(i) + " ");
            }
        }
        System.out.println("");
        //ok, all done
    }
    //Max of an array
    public int getMax(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > temp)
            {
                temp = arr[i];
            }
        }
        //boom, easy
        return temp;
    }
}
