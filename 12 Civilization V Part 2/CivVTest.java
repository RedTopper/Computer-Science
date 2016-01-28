
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
    // All tests assume Tile constructor takes food, production, gold, ID in that order
    
    public static boolean phillyTest()
    {
        int pop = 12;
        Tile city = new Tile(true, 2, 2, 0, 1);
        Tile[][] hexes = {{new Tile(true, 2, 0, 0, 2), new Tile(false, 0, 2, 0, 3), new Tile(false, 5, 0, 0, 4), new Tile(false, 0, 4, 0, 5), null, null},
                            {new Tile(false, 2, 0, 0, 6),new Tile(true, 4, 1, 0, 7),new Tile(true, 1, 3, 2, 8),new Tile(true, 4, 0, 2, 9),new Tile(false, 3, 2, 0, 10),null},
                            {new Tile(true, 5, 0, 0, 11),new Tile(true, 4, 0, 0, 12),new Tile(true, 4, 0, 0, 13),new Tile(true, 0, 4, 2, 14),new Tile(true, 4, 0, 2, 15),new Tile(false, 1, 1, 0, 16)},
                            {new Tile(false,1,1,0, 17),new Tile(true,0,4,0, 18),new Tile(true,4,0,0, 19),new Tile(true,4,0,2, 20),new Tile(true,4,1,2, 21),new Tile(true,3,0,5, 22)}, /** Center row with city removed **/
                            {new Tile(false,2,0,0, 23),new Tile(true,3,2,0, 24),new Tile(true,4,1,0, 25),new Tile(true,1,3,0, 26),new Tile(true,4,0,2, 27),new Tile(true,0,3,2, 28)},
                            {new Tile(false,2,0,0, 29),new Tile(true,4,0,0, 30),new Tile(true,1,1,0, 31),new Tile(true,4,0,0, 32),new Tile(true,1,1,0, 33),null},
                            {new Tile(false,2,0,0, 34),new Tile(false,2,0,0, 35),new Tile(true,2,0,0, 36),new Tile(true,0,5,0, 37),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,false,false,false},
                                    {true,false,false,true,false,false},
                                    {false,true,false,false,true,true}, /** Center row with city removed **/
                                    {false,true,true,true,false,true},
                                    {false,false,false,false,false,false},
                                    {false,false,false,true,false,false}};
        Settlement philly = new Settlement(pop,city,hexes,workedTiles); 
        
        System.out.println("The max amount of food is " + philly.maxFood() + ". It should be 51");
        System.out.println("The max amount of production is " + philly.maxProduction() + ". It should be 31");
        System.out.println("The max amount of gold is " + philly.maxGold() + ". It should be 21");
        return philly.maxFood() == 51 && philly.maxProduction() == 31 && philly.maxGold() == 21;
    }
    
 
    public static boolean berlinTest()
    {
        int pop = 14;
        Tile city = new Tile(true, 5, 4, 5, 1);
        Tile[][] hexes = {{new Tile(true, 1, 0, 1, 2), new Tile(true, 1, 3, 0, 3), new Tile(true, 4, 0, 0, 4), new Tile(false, 0, 4, 0, 5), null, null},
                            {new Tile(true, 4, 0, 0, 6),new Tile(true, 4, 0, 0, 7),new Tile(true, 4, 0, 1, 8),new Tile(true, 3, 0, 4, 9),new Tile(false, 2, 0, 0, 10),null},
                            {new Tile(true, 0, 4, 4, 11),new Tile(true, 3, 2, 1, 12),new Tile(true, 1, 3, 1, 13),new Tile(true, 2, 4, 3, 14),new Tile(true, 4, 0, 1, 15),new Tile(false, 4, 0, 0, 16)},
                            {new Tile(true,1,1,0, 17),new Tile(true,1,3,0, 18),new Tile(true,0,4,5, 19),new Tile(true,1,1,2, 20),new Tile(true,3,1,0, 21),new Tile(true,4,1,0, 22)}, /** Center row with city removed **/
                            {new Tile(true,1,0,1, 23),new Tile(true,4,0,0, 24),new Tile(true,1,0,1, 25),new Tile(true,1,3,0, 26),new Tile(true,0,4,0, 27),new Tile(true,4,0,0, 28)},
                            {new Tile(true,1,0,1, 29),new Tile(true,1,0,1, 30),new Tile(true,1,0,1, 31),new Tile(true,1,0,1, 32),new Tile(true,3,1,0, 33),null},
                            {new Tile(true,1,0,1, 34),new Tile(false,1,0,1, 35),new Tile(true,1,0,1, 36),new Tile(true,1,0,1, 37),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {false,true,true,false,false,true}, /** Center row with city removed **/
                                    {false,true,false,true,true,false},
                                    {false,false,false,false,false,false},
                                    {false,false,false,false,false,false}};
        Settlement berlin = new Settlement(pop,city,hexes,workedTiles);
        
        System.out.println("The max amount of food is " + berlin.maxFood() + ". It should be 52"); //generated debug output
        System.out.println("The max amount of production is " + berlin.maxProduction() + ". It should be 39"); //generated debug output
        System.out.println("The max amount of gold is " + berlin.maxGold() + ". It should be 32"); //generated debug output
        return berlin.maxFood() == 52 && berlin.maxProduction() == 39 && berlin.maxGold() == 32;
    }
    
    public static boolean delhiTest()
    {
        int pop = 45;
        Tile city = new Tile(true, 5, 4, 5, 1);
        Tile[][] hexes = {{new Tile(true, 2, 0, 2, 2), new Tile(true, 3, 2, 2, 3), new Tile(true, 2, 0, 0, 4), new Tile(true, 4, 0, 0, 5), null, null},
                            {new Tile(true, 2, 0, 2, 6),new Tile(true, 1, 1, 5, 7),new Tile(true, 2, 4, 3, 8),new Tile(true, 2, 3, 5, 9),new Tile(true, 2, 0, 0, 10),null},
                            {new Tile(true, 2, 0, 2, 11),new Tile(true, 2, 0, 2, 12),new Tile(true, 1, 2, 5, 13),new Tile(true, 2, 5, 4, 14),new Tile(true, 4, 1, 2, 15),new Tile(true, 0, 4, 0, 16)},
                            {new Tile(true,2,0,2, 17),new Tile(true,2,0,2, 18),new Tile(true,2,0,2, 19),new Tile(true,1,4,2, 20),new Tile(true,2,1,2, 21),new Tile(true,0,2,0, 22)}, /** Center row with city removed **/
                            {new Tile(true,2,0,2, 23),new Tile(true,2,0,2, 24),new Tile(true,2,0,2, 25),new Tile(true,1,3,0, 26),new Tile(true,1,3,0, 27),new Tile(true,4,0,0, 28)},
                            {new Tile(true,1,3,0, 29),new Tile(true,0,5,0, 30),new Tile(true,1,3,0, 31),new Tile(true,2,5,0, 32),new Tile(true,4,0,0, 33),null},
                            {new Tile(true,1,3,0, 34),new Tile(true,1,3,0, 35),new Tile(true,2,0,0, 36),new Tile(true,0,4,0, 37),null,null}};
        boolean[][] workedTiles = {{true,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,true}, /** Center row with city removed **/
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,false,false}};
        Settlement delhi = new Settlement(pop,city,hexes,workedTiles);
        
        System.out.println("The amount of food is " + delhi.maxFood() + ". It should be 69"); //generated debug output
        System.out.println("The amount of production is " + delhi.maxProduction() + ". It should be 65"); //generated debug output
        System.out.println("The amount of gold is " + delhi.maxGold() + ". It should be 55"); //generated debug output 
        return delhi.maxFood() == 69 && delhi.maxProduction() == 65 && delhi.maxGold() == 55;
    }
}
