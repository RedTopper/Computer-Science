
/**
 * Settlement is a full settlement. It holds a lot
 * of tiles.
 * 
 * @author 1714057
 * @version 12/3/2014
 */
public class Settlement
{
    private int pop;
    private Tile city;
    private Tile[][] hexes;
    private boolean[][] workedTiles;
    
    public Settlement(int population, Tile cityinfo, Tile[][] cityhexes, boolean[][] cityWorkedTiles)
    {
        pop = population;
        city = cityinfo;
        hexes = cityhexes;
        workedTiles = cityWorkedTiles;
    }
    public int getFood()
    {
        int amountOfFood = 0;
        for(int rows = 0; rows < hexes.length; rows++)
        {
            for(int cols = 0; cols < hexes[0].length; cols++)
            {
                if(hexes[rows][cols] != null && workedTiles[rows][cols] == true && hexes[rows][cols].getWorkable() == true)
                {
                    amountOfFood += hexes[rows][cols].getFood();
                }
            }
        }
        amountOfFood += city.getFood();
        return amountOfFood;
    }
    public int getProduction()
    {
        int amountOfProduction = 0;
        for(int rows = 0; rows < hexes.length; rows++)
        {
            for(int cols = 0; cols < hexes[0].length; cols++)
            {
                if(hexes[rows][cols] != null && workedTiles[rows][cols] == true && hexes[rows][cols].getWorkable() == true)
                {
                    amountOfProduction += hexes[rows][cols].getProduction();
                }
            }
        }
        amountOfProduction += city.getProduction();
        return amountOfProduction;
    }
    public int getGold()
    {
        int amountOfGold = 0;
        for(int rows = 0; rows < hexes.length; rows++)
        {
            for(int cols = 0; cols < hexes[0].length; cols++)
            {
                if(hexes[rows][cols] != null && workedTiles[rows][cols] == true && hexes[rows][cols].getWorkable() == true)
                {
                    amountOfGold += hexes[rows][cols].getGold();
                }
            }
        }
        amountOfGold += city.getGold();
        return amountOfGold;
    }
}
