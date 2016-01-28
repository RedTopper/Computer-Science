
/**
 * Write a description of class TranslateTest here.
 * Test Translate class
 * @author 1714057
 * @version lame
 */
public class TranslateTest
{
    public void testAll()
    {
        for(int i = 0; i < 20; i++)
            tester(i);
    }
    public void tester(int number)
    {
        if(number == 1)
            testItToP("Hello!");
        if(number == 2)
            testItToP("Hello, because you are reading this, where is my chest?!");
        if(number == 3)
            testItToP("Hello, is that thing where a sir where is my money in the chest coin in a...? Excuse me!!");
        if(number == 4)
            testItToP("Because...");
        if(number == 5)
            testItToP("I am testing with this translator.");
        if(number == 6)
            testItToP("Hello, hello, hello, hello!");
        if(number == 7)
            testItToE("I be sailing the seven seas with this translatarr\'.");
        if(number == 8)
            testItToE("arrr, ahoy be that me maties?");
        if(number == 9)
            testItToE("Arrr, arrr, arrr, arrr.");
        if(number == 10)
        {
            Translate s1 = new Translate("Hello!", false);
            Translate s2 = new Translate("Ahoy!", true);
            compare(s1, s2);
        }
        if(number == 11)
        {
            Translate s1 = new Translate("arrr.", true);
            Translate s2 = new Translate("Excuse me.", false);
            compare(s1, s2);
        }
        if(number == 12)
        {
            Translate s1 = new Translate("Goodbye!", false);
            Translate s2 = new Translate("Ahoy!", true);
            compare(s1, s2);
        }
    }
    private void testItToE(String str)
    {
        Translate s1 = new Translate(str, true);
        System.out.println("The tester typed (pirate):\n" + s1.getOriginalPhrase());
        System.out.println("And translated it to (english):\n" + s1.getTranslatedPhrase() + "\n");
    }
    private void testItToP(String str)
    {
        Translate s1 = new Translate(str, false);
        System.out.println("The tester typed (english):\n" + s1.getOriginalPhrase());
        System.out.println("And translated it to (pirate):\n" + s1.getTranslatedPhrase() + "\n");
    }
    private void compare(Translate trans1, Translate trans2)
    {
        System.out.println("The phrase " + trans1.getOriginalPhrase() + " and " + trans2.getOriginalPhrase() + " appear to be " + trans1.equals(trans2) + ".\n");
    }
}
