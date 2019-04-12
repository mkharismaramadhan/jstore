
/**
 * Class DatabaseItem
 * Berisi mengenai database item
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */

import java.util.ArrayList;

public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;

    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    /**
     * Method untuk menambahkan item
     * @param item
     * @return true
     */
    public static boolean addItem(Item item)
    {
        boolean value = false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()!=itemDB.getName() && item.getStatus()!=
            itemDB.getStatus() && item.getSupplier()!=itemDB.getSupplier())
            {
                ITEM_DATABASE.add(item);
                value = true;
            }
        }
        return value;
    }
    
    public static Item getItemFromID(int id)
    {
        Item value = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                value = itemDB;
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> value = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier() == supplier)
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status)
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static boolean removeItem(int id)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}
