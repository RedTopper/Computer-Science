
/**
 * Tile is a tile. It holds information and returns for tile
 * based stuff.
 * 
 * @author 1714057 
 * @version 12/3/2014
 */
public class Tile
{
    private boolean workable;
    private Resource food;
    private Resource production;
    private Resource gold;
    public Tile(boolean workable, int food, int production, int gold)
    {
        this.workable = workable;
        this.food = new Food(food);
        this.production = new Production(production);
        this.gold = new Gold(gold);
    }
    public int getFood()
    {
        return food.getAmount();
    }
    public int getProduction()
    {
        return production.getAmount();
    }
    public int getGold()
    {
        return gold.getAmount();
    }
    public boolean getWorkable()
    {
        return workable;   
    }
}
