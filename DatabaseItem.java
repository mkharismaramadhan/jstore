
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
    private static String[] listItem;
    public static Item itemDB;

    /**
     * Method untuk menambahkan item
     * @param item
     * @return true
     */
    public static boolean additem(Item item)
    {
        itemDB = item;
        if (itemDB == item)
        return true;
        else
        return false;
    }
    
    /**
     * Method untuk mengurangi item
     * @param item
     * @return true
     */
    public boolean removeItem(Item itemDB)
    {
        return true;
    }
    
    /**
     * Method untuk mengambil nilai item
     * @return item
     */
    public Item getItem()
    {
        return itemDB;
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
