/**|my codeits▾  FRONT - ALL - RANDOM | CODEOSOPHY - SDKS - PROGRAMMINGPUNS - CODINGTHOUGHTS - WORLDCODE - LISTENTOCODE - CODEPROMPTS - SCREENSHOTS - ASKCODE  MORE>>|
 * |-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
 * |    /r/hailstone                                                                                                                                                 |
 * | Over 8 4 2 1 coders!                                                                                                                                            |
 * |      (try 7!)         hailstone  |----------|   |-------|                                             Want to join? sign in or ask Mr. Miller in seconds | Java |
 * | ---------------------------------| comments |----related-----------------------------------------------------------------|--------------------------------------|
 * |  ↑  |------| No matter how much you want to, don't hail corporate. (m8.bluejay.exe)                                      | search                               |
 * |     | java | Submitted a while ago by 1714057                                                                            |--------------------------------------|
 * |  ↓  | code | 58 comments.                                                                                                | This post was submitted on 1/10/2015 |
 * |     |------|                                                                                                             | 1,336 points. (99% upcoded)          |
 * |                                                                                                                          | shortlink: http://code.it/h4i1s70n3  |
 * | all 58 comments                                                                                                          |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username          | password         |
 * | sorted by: logical order▾                                                                                                |-------------------|------------------|
 * |                                                                                                                          | [ ]remember me                  login|
 * |                                                                                                                          |--------------------------------------|
 */
public class hailstone
{
    public static int hailstone(int x) //Method that runs hailstone on a number. Should always return 1.
    {
        int[] ex = new int[] {x,0,0,0}; //x is the number that it is on, 0 is the length, 0 is the max, and 0 is quiet mode 
                                        //(false) in that order
        ex = hailstone(ex); //gets the number you typed.
        return ex[0]; //It should be one. Or it could be an overflow error. Take your pick, user.
    }
    public static void hailcorporate() //Method that runs hailstone 1000 times.
    {
        hailcorporate(1000); //Pretty small method, if I say so myself.
    }
    public static void hailcorporate(int x) //For the people who are curious about other maxes (not hardcoded to 1000)
    {
        int[] numberlen = new int[5]; //Make a place to store the number used when finding the max length
        int[] numbermax = new int[5]; //Make a place to store the number used when finding the max max
        int[] len = new int[5]; //Make a place to store the max length
        int[] max = new int[5]; //Make a place to store the max max
        for(int num = 1; num <= x; num++) //Go from 1 to x
        {
            int[] ex = new int[] {num,0,0,1}; //sets up array (in quiet mode, we don't want to wake Mr. Miller!)
            ex = hailstone(ex); //runs hailstone on it (SHHH! Be VERY quiet!)
            boolean runlen = true; //Wouldn't want to overwrite all of the lower numbers!
            boolean runmax = true; //ditto.
            for(int number = 0; number < 5; number++) //checks spots 0 - 4
            {
                if(runlen && ex[1] >= len[number]) //Hey! We found a longer length in that spot using that number!
                {
                    for(int i = 3; i >=number; i--) //Shoves everything over to make room
                    {
                        len[i + 1] = len[i]; //Shoving
                        numberlen[i + 1] = numberlen[i]; //Still being a bully.
                    }
                    len[number] = ex[1]; //Put length HERE
                    numberlen[number] = num; //Put seed HERE
                    runlen = false; //Don't overwrite those smaller numbers!
                }
                if(runmax && ex[2] >= max[number]) //Everything is same as above, just with max.
                {
                    for(int i = 3; i >=number; i--) //All of these comments are usless
                    {
                        max[i + 1] = max[i]; //No, really, they are.
                        numbermax[i + 1] = numbermax[i]; //Seriously, all you have to do is read the loop above.
                    }
                    max[number] = ex[2]; //This whole if statement is a copy with the variables max and numbermax instead.
                    numbermax[number] = num; //This is a filler comment. It makes it look like I did work.
                    runmax = false; //You still reading these? Nice work!
                }
            }
        }
        for(int i = 1; i <= 5; i++) //Ok, show them the money!
        {
            System.out.println("For seed #" + i + ": It's seed was " + 
                                numberlen[i - 1] + " and its length was " + len[i - 1]); //Do it reel good
        }
        for(int i = 1; i <= 5; i++) //Show me some more!
        {
            System.out.println("For seed #" + i + ": It's seed was " + 
                                numbermax[i - 1] + " and its max was " + max[i - 1]); //And more!
        }
        //Job's done!
    }
    private static int[] hailstone(int[] x) //Method that gets called a lot. Maybe he should change his phone number.
    {
        int[] ex = new int[4]; //set up a place to store things.
        for(int i = 0; i < 4; i++) //actually store them
        {
            ex[i] = x[i]; //I wasn't kidding.
        }
        if(ex[3] == 0) //Is it in quiet mode? No? Print the number it's on, then!
        {
            System.out.print(ex[0] + " "); //Show me the number!
        }
        if(ex[0] == 1) //Did we just find the base case? We are home free if the number is 1!
        {
            if(ex[3] == 0) //Is it in quiet mode? No? Print the final numbers, then!
            {
                System.out.println(""); //Push enter, please.
                System.out.println("The length was: " + ex[1]); //Show me the length!
                System.out.println("The max was: " + ex[2]); //Show me the max!
            }
            return ex; //Return dat array. We are finally done.
        }
        if(ex[1] == 0) //Is it the first run? Is the length 0? Yes? Then set these variables!
        {
            ex[1] = ex[1] + 1; //set the length to 1, since we start with a number.
            ex[2] = ex[0]; //set the max to the number you start with. A great example on why is 8, where the sequence is 
                           //8 4 2 1, and never needs to multiply (which never makes a new max, because all numbers are even).
        }
        if(x[0] % 2 == 0) //Can it devide by 2? Yes? OK!
        {
            ex = new int[] {ex[0] / 2, ex[1] + 1, ex[2], ex[3]}; //Actually does math for once.
            return hailstone(ex); //HERE WE GO AGAIN, TO THE TOP, WE GO!
        }
        else //Can it devide by 2? No? OK!
        {
            if(ex[0] * 3 + 1 > ex[2]) //Does this make a bigger number? Yes? Cool!
            {
                ex[2] = ex[0] * 3 + 1; //Makes max maxer!
            }
            ex = new int[] {ex[0] * 3 + 1, ex[1] + 1, ex[2], ex[3]}; //Does some more math.
            return hailstone(ex); //HERE WE GO AGAIN, TO THE TOP, WE GO!
        }
    }
}
