
/**
 * This class holds a resource. Any resource.
 * 
 * @author 1714057
 * @version 12/3/2014
 */
public abstract class Resource
{
    private int amount;
    public Resource(int resourceamount)
    {
        amount = resourceamount;
    }
    public int getAmount()
    {
        return amount;
    }
}
