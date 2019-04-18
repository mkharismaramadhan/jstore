
/**
 * Class DatabaseSupplier
 * Berisi mengenai database Supplier
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
import java.util.ArrayList;
public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    public static ArrayList<Supplier> getSupplierDatabase()
    {
     return SUPPLIER_DATABASE;   
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * Method untuk menambah supplier
     * @param  supplier
     * @return true
     */
    public static boolean addSupplier(Supplier supplier)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()==supplierDB.getName()&&supplier.getEmail()==supplierDB.getEmail()&&supplier.getPhoneNumber()==supplierDB.getPhoneNumber())
            {
            return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID=supplier.getId();
        return true;
    }
    
    public static Supplier getSupplier(int id)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                return supplierDB;
            }
        }
        return null;
    }
    
    public static boolean removeSupplier(int id)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                return true;
            }
        }
        return false;
    }
    

    
}
