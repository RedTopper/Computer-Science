
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
    private Tile a[];
    
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
    public int maxFood()
    {
        makeOneArray();
        selectionSort("food");
        int popused = 0;
        resetBoolArray();
        for(int tilething = 0; tilething < a.length; tilething++)
        {
            if((a[tilething].getWorkable()) && (popused < pop))
            {
                for(int rows = 0; rows < hexes.length; rows++)
                {
                    for(int cols = 0; cols < hexes[0].length; cols++)
                    {
                        if((hexes[rows][cols] != null) && (a[tilething].getId() == hexes[rows][cols].getId()))
                        {
                            workedTiles[rows][cols] = true;
                            cols = 100;
                            rows = 100;
                            popused++;
                        }
                    }
                }
            }
        }
        return getFood();
    }
    public int maxProduction()
    {
        makeOneArray();
        selectionSort("prod");
        int popused = 0;
        resetBoolArray();
        for(int tilething = 0; tilething < a.length; tilething++)
        {
            if((a[tilething].getWorkable()) && (popused < pop))
            {
                for(int rows = 0; rows < hexes.length; rows++)
                {
                    for(int cols = 0; cols < hexes[0].length; cols++)
                    {
                        if((hexes[rows][cols] != null) && (a[tilething].getId() == hexes[rows][cols].getId()))
                        {
                            workedTiles[rows][cols] = true;
                            cols = 100;
                            rows = 100;
                            popused++;
                        }
                    }
                }
            }
        }
        return getProduction();
    }
    public int maxGold()
    {
        makeOneArray();
        selectionSort("gold");
        int popused = 0;
        resetBoolArray();
        for(int tilething = 0; tilething < a.length; tilething++)
        {
            if((a[tilething].getWorkable()) && (popused < pop))
            {
                for(int rows = 0; rows < hexes.length; rows++)
                {
                    for(int cols = 0; cols < hexes[0].length; cols++)
                    {
                        if((hexes[rows][cols] != null) && (a[tilething].getId() == hexes[rows][cols].getId()))
                        {
                            workedTiles[rows][cols] = true;
                            cols = 100;
                            rows = 100;
                            popused++;
                        }
                    }
                }
            }
        }
        return getGold();
    }
    public void resetBoolArray()
    {
        for(int rows = 0; rows < workedTiles.length; rows++)
        {
            for(int cols = 0; cols < workedTiles[0].length; cols++)
            {
                workedTiles[rows][cols] = false;
            }    
        }
    }
    public void makeOneArray()
    {
        int len = 0;
        for(int rows = 0; rows < hexes.length; rows++)
        {
            for(int cols = 0; cols < hexes[0].length; cols++)
            {
                if(hexes[rows][cols] != null)
                {
                    len++;
                }
            }
        }
        int traverser = 0;
        a = new Tile[len];
        for(int rows = 0; rows < hexes.length; rows++)
        {
            for(int cols = 0; cols < hexes[0].length; cols++)
            {
                if(hexes[rows][cols] != null)
                {
                    a[traverser] = hexes[rows][cols];
                    traverser++;
                }
            }
        }
    }
    
    public void selectionSort(String who)
    {
        int maxPos, max;
        if(who == "food")
        {
            for (int i=0; i<a.length-1; i++)
            {
                max = a[i].getFood();
                maxPos = i;
                for (int j=i+1; j<a.length; j++)
                if (max < a[j].getFood())
                {
                    max = a[j].getFood();
                    maxPos = j;
                }
                swap(i, maxPos);
            }
        }
        if(who == "prod")
        {
            for (int i=0; i<a.length-1; i++)
            {
                max = a[i].getProduction();
                maxPos = i;
                for (int j=i+1; j<a.length; j++)
                if (max < a[j].getProduction())
                {
                    max = a[j].getProduction();
                    maxPos = j;
                }
                swap(i, maxPos);
            }
        }
        if(who == "gold")
        {
            for (int i=0; i<a.length-1; i++)
            {
                max = a[i].getGold();
                maxPos = i;
                for (int j=i+1; j<a.length; j++)
                if (max < a[j].getGold())
                {
                    max = a[j].getGold();
                    maxPos = j;
                }
                swap(i, maxPos);
            }
        }
    }
              
    public void swap(int i, int j)
    {
      Tile temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
}
