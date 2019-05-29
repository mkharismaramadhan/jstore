package jstore;
import java.util.ArrayList;
public class DatabaseSupplier {
    //private Supplier[] listSupplier;
    //private Supplier supplier;
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    public static ArrayList<Supplier> getSupplierDatabase() {
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierID() {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier)
            throws SupplierAlreadyExistsException {
        for (Supplier temp : SUPPLIER_DATABASE) {
            if (((temp.getEmail().equals(supplier.getEmail())) || (temp.getPhoneNumber().equals(supplier.getPhoneNumber())))) {
                throw new SupplierAlreadyExistsException(supplier);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }

    public static Supplier getSupplier(int id) {
        for (Supplier supplier : SUPPLIER_DATABASE) {
            if (supplier.getId() == id) {
                return supplier;
            }
        }
        return null;
    }

    public static boolean removeSupplier(int id) throws SupplierNotFoundException {
        for ( Supplier sup : SUPPLIER_DATABASE ){
            if (sup.getId() == id) {
                ArrayList<Item> temp = DatabaseItem.getItemFromSupplier(sup);
                if (temp != null) {
                    for (Item item : temp){
                        try {
                            DatabaseItem.removeItem(item.getId());
                        } catch (ItemNotFoundException e) {
                            System.out.print(e.getExMessage());
                        }
                    }
                }
                SUPPLIER_DATABASE.remove(sup);
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }
}