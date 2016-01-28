import java.util.ArrayList;
/**
 * Write a description of class JProject here.
 * 
 * @author 1714057
 * @version today
 */
public class JProject
{
    int Steps = 0;
    int People = 0;
    ArrayList<Integer> Peoples = new ArrayList<>();
    /**
     * Constructor for objects of class JProject
     */
    public JProject(int steps, int people)
    {
        this.Steps = steps;
        this.People = people;
        for(int i = 0; i < People; i++)
        {
            Peoples.add(i + 1);
        }
    }

    public int killem()
    {
        System.out.println("Elements are standing in a circle numbered 1 through " + Integer.toString(People) + 
            ", and, \nbecause removing oneself from an ArrayList is against Java's\nword, they need a more creative way to do so.");
        System.out.println("");
        System.out.println("So, they begin to remove the others from the Peoples ArrayList \none by one until there is just one standing.");
        System.out.println("");
        int removerIndex = -1;
        int lastPersonIndex = 0;
        while(People > 1)
        {
            for(int i = 0; i < Steps; i++)
            {
                if(removerIndex < People - 1)
                {
                    removerIndex++;
                }
                else
                {
                    removerIndex = 0;
                }
                if(i < Steps - 1)
                {
                    lastPersonIndex = removerIndex;
                }
            }
            System.out.println("Arrrgh! Element name " + Peoples.get(lastPersonIndex).toString() + " removed " + Peoples.get(removerIndex).toString() + " and is now down for the count!");
            Peoples.remove(removerIndex);
            removerIndex--;
            People--;
        }
        System.out.println("");
        System.out.println("Element name " + Peoples.get(0).toString() + " is the last one standing, and removes itself \nfrom the Persons ArrayList.");
        return Peoples.get(0);
    }
}
