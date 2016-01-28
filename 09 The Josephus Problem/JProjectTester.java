
/**
 * Tests JProject class. The numbers printed at the end of the 
 * test are gathered from the project on themrmiller.com.
 * TESTS 10-11 ARE PROBABLY GOING TO BREAK THE PROGRAM!
 * 
 * @author 1714057
 * @version today
 */
public class JProjectTester
{
    public void runOne(int test)
    {
        if(test == 1)
        {
            JProject jproj = new JProject(2,6);
            System.out.println("Test to see if step = 2");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("2 4 6 3 1 5");
        }
        if(test == 2)
        {
            JProject jproj = new JProject(2,7);
            System.out.println("Test to see if step = 2");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("2 4 6 1 5 3 7");
        }
        if(test == 3)
        {
            JProject jproj = new JProject(2,8);
            System.out.println("Test to see if step = 2");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("2 4 6 8 3 7 5 1");
        }
        if(test == 4)
        {
            JProject jproj = new JProject(2,9);
            System.out.println("Test to see if step = 2");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("2 4 6 8 1 5 9 7 3");
        }
        if(test == 5)
        {
            JProject jproj = new JProject(3,6);
            System.out.println("Test to see if step = 3");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("3 6 4 2 5 1");
        }
        if(test == 6)
        {
            JProject jproj = new JProject(4,6);
            System.out.println("Test to see if step = 4");
            System.out.println("");
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("4 2 1 3 6 5");
        }
        if(test == 7)
        {
            System.out.println("Test to see if the program can handle large amounts of people");
            System.out.println("");
            JProject jproj = new JProject(2,30);
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 3 7 11 15 19 23 27 1 9 \n17 25 5 21 13 29");
        }
        if(test == 8)
        {
            System.out.println("Test to see if the program can handle large amounts of people");
            System.out.println("");
            JProject jproj = new JProject(6,30);
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("6 12 18 24 30 7 14 21 28 5 15 23 2 11 22 3 16 27 10 26 13 1 20 17 \n9 19 29 25 8 4");
        }
        if(test == 9)
        {
            System.out.println("Test to see if step = people");
            System.out.println("");
            JProject jproj = new JProject(8,8);
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("8 1 3 6 5 2 7 4");
        }
        if(test == 10)
        {
            System.out.println("WARNING: THIS MIGHT BREAK THE PROGRAM OR PRINT RAMDOM NUMBERS!");
            System.out.println("Test to see if step = 1");
            System.out.println("");
            JProject jproj = new JProject(1,6);
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("ERR");
        }
        if(test == 11)
        {
            System.out.println("WARNING: THIS MIGHT BREAK THE PROGRAM OR PRINT RAMDOM NUMBERS!");
            System.out.println("Test to see if step = 6 (and people = 1)");
            System.out.println("");
            JProject jproj = new JProject(6,1);
            jproj.killem();
            System.out.println("");
            System.out.println("If the story went the original way, the order should be:");
            System.out.print("ERR");
        }
    }
    public void runAll()
    {
        for(int i = 1; i < 11; i++)
        {
            runOne(i);
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("");
        }
    }
}
