
/**
 * Class DatabaseItem
 * Berisi mengenai database item
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */

public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private Item item;

    /**
     * Method untuk menambahkan item
     * @param item
     * @return true
     */
    public boolean additem(Item item)
    {
        return true;
    }
    
    /**
     * Method untuk mengurangi item
     * @param item
     * @return true
     */
    public boolean removeItem(Item item)
    {
        return true;
    }
    
    /**
     * Method untuk mengambil nilai item
     * @return item
     */
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method untuk mengambil nilai list item
     * @return listItem
     */
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
