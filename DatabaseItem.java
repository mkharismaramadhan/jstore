
/**
 * Write a description of class DatabaseItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private Item item;

    /**
     * Constructor for objects of class DatabaseItem
     */
    public boolean additem(Item item)
    {
        return true;
    }
    
    public boolean removeItem(Item item)
    {
        return true;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
