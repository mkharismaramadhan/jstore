package jstore;
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
    private static int LAST_ITEM_ID=0;

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
    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()==itemDB.getName()&&item.getCategory()==itemDB.getCategory()&&item.getStatus()==itemDB.getStatus()&&item.getSupplier()==itemDB.getSupplier())
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        //tambahan
        LAST_ITEM_ID=item.getId();
        return true;
    }
    
    public static Item getItemFromID(int id)
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                return itemDB;
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }
    
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }
    
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
}
