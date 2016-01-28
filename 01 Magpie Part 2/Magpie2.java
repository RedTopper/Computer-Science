/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        statement = " " + statement + " ";
        String response = "";
        int i = 0;
        statement = statement.replace(".", "");
        statement = statement.replace("?", "");
        statement = statement.replace("!", "");
        statement = statement.replace("'", " ");
        if (statement.toLowerCase().contains(" mother ") == true
                || statement.toLowerCase().contains(" father ") == true
                || statement.toLowerCase().contains(" sister ") == true
                || statement.toLowerCase().contains(" brother ") == true)
        {
            response = "Tell me more about your family.";
            return response;
        }
        else if (statement.toLowerCase().contains(" cat ") == true
                || statement.toLowerCase().contains(" dog ") == true
                || statement.toLowerCase().contains(" pet ") == true)
        {
            response = "Tell me more about your pets.";
            return response;
        }
        else if (statement.toLowerCase().contains(" miller ") == true)
        {
            response = "Wow, Mr. Miller sounds like a cool teacher!";
            return response;
        }
        else if (statement.toLowerCase().contains(" ur dum") == true
                || statement.toLowerCase().contains(" you're dum") == true
                || statement.toLowerCase().contains(" you are dum") == true)
        {
            response = "Wow, that was rude!";
            return response;
        }
        else if (statement.toLowerCase().contains(" your dum") == true)
        {
            response = "Gosh, it's \"You are\" or \"You're\"";
            return response;
        }
        else if (statement.toLowerCase().contains(" 420 ") == true)
        {
            response = "Blaze it!";
            return response;
        }
        else if  (statement.trim().length() == 0)
        {
           response = "Are you still there?";
           return response;
        }
        else if(statement.toLowerCase().contains(" no ") == true)
        {
            response = "Why no?";
            return response;
        }
        else
        {
            response = getRandomResponse();
            return response;
        }
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Yeah, cool.";
        }
        else if (whichResponse == 5)
        {
            response = "Seems interesting.";
        }

        return response;
    }
}
