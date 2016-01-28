
/**
 * Unit tests for the Civilization V project
 * 
 * @author Derek Miller (and 1714057)
 * @version 12/3/2014 NOTE - updated by 1714057
 * 
 * ALL TESTS HAVE BEEN CAREFULLY CALCULATED BY A HUMAN.
 * (and not an iffy semi functional program, this is
 * legit stuff here)
 * ALL PREVIOUS MISTAKES HAVE BEEN CORRECTED.
 * WATCH YOURSELF WHEN COPYTING AND PASTING
 * CODE!
 * 
 * Thanks - 1714057
 */
public class CivVTest
{
    // All tests assume Tile constructor takes food, production, gold in that order
    
    public void All()
    {
        System.out.println("Begin test 1: Philly");
        System.out.println("So that means the test is " + phillyTest());
        System.out.println("Begin test 2: Berlin");
        System.out.println("So that means the test is " + berlinTest());
        System.out.println("Begin test 3: Delhi");
        System.out.println("So that means the test is " + delhiTest());
        System.out.println("Begin test 4: Bielefeld");
        System.out.println("So that means the test is " + bieleTest());
    }
    
    public boolean phillyTest()
    {
        int pop = 12;
        Tile city = new Tile(true, 2, 2, 0);
        Tile[][] hexes = {{new Tile(true, 2, 0, 0), new Tile(false, 0, 2, 0), new Tile(false, 5, 0, 0), new Tile(false, 0, 4, 0), null, null},
                            {new Tile(false, 2, 0, 0),new Tile(true, 4, 1, 0),new Tile(true, 1, 3, 2),new Tile(true, 4, 0, 2),new Tile(false, 3, 2, 0),null},
                            {new Tile(true, 5, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 0, 4, 2),new Tile(true, 4, 0, 2),new Tile(false, 1, 1, 0)},
                            {new Tile(false,1,1,0),new Tile(true,0,4,0),new Tile(true,4,0,0),new Tile(true,4,0,2),new Tile(true,4,1,2),new Tile(true,3,0,5)}, /** Center row with city removed **/
                            {new Tile(false,2,0,0),new Tile(true,3,2,0),new Tile(true,4,1,0),new Tile(true,1,3,0),new Tile(true,4,0,2),new Tile(true,0,3,2)},
                            {new Tile(false,2,0,0),new Tile(true,4,0,0),new Tile(true,1,1,0),new Tile(true,4,0,0),new Tile(true,1,1,0),null},
                            {new Tile(false,2,0,0),new Tile(false,2,0,0),new Tile(true,2,0,0),new Tile(true,0,5,0),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,false,false,false},
                                    {true,false,false,true,false,false},
                                    {false,true,false,false,true,true}, /** Center row with city removed **/
                                    {false,true,true,true,false,true},
                                    {false,false,false,false,false,false},
                                    {false,false,false,true,false,false}};
        Settlement philly = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + philly.getFood() + ". It should be 27"); //generated debug output
        System.out.println("The amount of production is " + philly.getProduction() + ". It should be 29"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + philly.getGold() + ". It should be 13"); //generated debug output
        return philly.getFood() == 27 && philly.getProduction() == 29 && philly.getGold() == 13;
    }
    
    public boolean bieleTest()
    {
        int pop = 12;
        Tile city = new Tile(true, 5, 5, 2);
        Tile[][] hexes = {{new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 2),null,null},
                          {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0),new Tile(true, 0, 4, 0),null},
                          {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 5, 2, 4),new Tile(true, 1, 0, 4),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 2)},
                          {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 0),new Tile(true, 0, 4, 0),new Tile(false,0, 0, 0)}, /** Center row with city removed **/
                          {new Tile(true, 2, 0, 0),new Tile(true, 0, 5, 0),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0),new Tile(false,0, 0, 0),new Tile(false,0, 0, 0)},
                          {new Tile(true, 2, 0, 0),new Tile(true, 0, 5, 0),new Tile(true, 0, 4, 0),new Tile(false,0, 0, 0),new Tile(false,0, 0, 0),null},
                          {new Tile(true, 2, 0, 0),new Tile(false,0, 0, 0),new Tile(false,0, 0, 0),new Tile(false,0, 0, 0),null,null}};
        boolean[][] workedTiles = {{false,false,false,true, false,false},
                                   {true, true, true, true, true, false},
                                   {true, true, true, true, true, true },
                                   {true, true, true, true, true, false}, /** Center row with city removed **/
                                   {true, true, true, true, false,false},
                                   {true, true, true, true, false,false},
                                   {true, true, true, false,false,false}};
        Settlement biele = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + biele.getFood() + ". It should be 47"); //generated debug output
        System.out.println("The amount of production is " + biele.getProduction() + ". It should be 29"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + biele.getGold() + ". It should be 26"); //generated debug output
        return biele.getFood() == 47 && biele.getProduction() == 29 && biele.getGold() == 26;
    }
    
 
    public boolean berlinTest()
    {
        int pop = 14;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 1, 0, 1), new Tile(true, 1, 3, 0), new Tile(true, 4, 0, 0), new Tile(false, 0, 4, 0), null, null},
                            {new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 1),new Tile(true, 3, 0, 4),new Tile(false, 2, 0, 0),null},
                            {new Tile(true, 0, 4, 4),new Tile(true, 3, 2, 1),new Tile(true, 1, 3, 1),new Tile(true, 2, 4, 3),new Tile(true, 4, 0, 1),new Tile(false, 4, 0, 0)},
                            {new Tile(true,1,1,0),new Tile(true,1,3,0),new Tile(true,0,4,5),new Tile(true,1,1,2),new Tile(true,3,1,0),new Tile(true,4,1,0)}, /** Center row with city removed **/
                            {new Tile(true,1,0,1),new Tile(true,4,0,0),new Tile(true,1,0,1),new Tile(true,1,3,0),new Tile(true,0,4,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,3,1,0),null},
                            {new Tile(true,1,0,1),new Tile(false,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {false,true,true,false,false,true}, /** Center row with city removed **/
                                    {false,true,false,true,true,false},
                                    {false,false,false,false,false,false},
                                    {false,false,false,false,false,false}};
        Settlement berlin = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + berlin.getFood() + ". It should be 36"); //generated debug output
        System.out.println("The amount of production is " + berlin.getProduction() + ". It should be 32"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + berlin.getGold() + ". It should be 25"); //generated debug output
        return berlin.getFood() == 36 && berlin.getProduction() == 32 && berlin.getGold() == 25;
    }
    
    public boolean delhiTest()
    {
        int pop = 45;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 2, 0, 2), new Tile(true, 3, 2, 2), new Tile(true, 2, 0, 0), new Tile(true, 4, 0, 0), null, null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 1, 1, 5),new Tile(true, 2, 4, 3),new Tile(true, 2, 3, 5),new Tile(true, 2, 0, 0),null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 1, 2, 5),new Tile(true, 2, 5, 4),new Tile(true, 4, 1, 2),new Tile(true, 0, 4, 0)},
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,4,2),new Tile(true,2,1,2),new Tile(true,0,2,0)}, /** Center row with city removed **/
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,3,0),new Tile(true,0,5,0),new Tile(true,1,3,0),new Tile(true,2,5,0),new Tile(true,4,0,0),null},
                            {new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,2,0,0),new Tile(true,0,4,0),null,null}};
        boolean[][] workedTiles = {{true,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,true}, /** Center row with city removed **/
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,false,false}};
        Settlement delhi = new Settlement(pop,city,hexes,workedTiles);
        System.out.println("The amount of food is " + delhi.getFood() + ". It should be 69"); //generated debug output
        System.out.println("The amount of production is " + delhi.getProduction() + ". It should be 65"); //generated debug output
        System.out.println("The amount of Reddit Gold is " + delhi.getGold() + ". It should be 55"); //generated debug output 
        return delhi.getFood() == 69 && delhi.getProduction() == 65 && delhi.getGold() == 55;
    }
}
