/**
 * Class JStore
 * Berisi mengenai fungsi utama JStore
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
import java.util.ArrayList;
public class JStore
{
    /**
     * Method untuk main program
     */
    public static void main(String[] args)
    {
        Location lokasi = new Location("Serang","Banten","Kota Cabang");
        DatabaseSupplier.addSupplier(new Supplier("Alex", "alex@gmail.com", "+628124545121", lokasi));
        DatabaseSupplier.addSupplier(new Supplier("Amin", "amin@gmail.com", "+6287771831112", lokasi));
        DatabaseSupplier.addSupplier(new Supplier("Tony", "tony@gmail.com", "+6299465121589", lokasi));
        
        for(Supplier supplier : DatabaseSupplier.getSupplierDatabase())
        {
            System.out.println(supplier);
        }
        
        DatabaseCustomer.addCustomer(new Customer("Aji","aji@gmail.com","aji","1234",1998,4,21));
        DatabaseCustomer.addCustomer(new Customer("Joni","joni@gmail.com","joni","1234",1998,3,27));
        DatabaseCustomer.addCustomer(new Customer("Yusuf","yususf@gmail.com","yusuf","1234",1998,5,26));
        
        for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(customer);
        }
        
        DatabaseItem.addItem(new Item("Handphone", 1, 2000000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        DatabaseItem.addItem(new Item("Kursi", 2, 1500000, ItemCategory.Furniture, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        DatabaseItem.addItem(new Item("Pulpen/dus", 3, 1000000, ItemCategory.Stationery, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        DatabaseItem.addItem(new Item("Laptop", 1, 3000000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        
        for(Item item : DatabaseItem.getItemDatabase())
        {
            System.out.println(item);
        }
        
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        
        DatabaseInvoice.addInvoice(new Sell_Paid(items, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Unpaid(items, DatabaseCustomer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Installment(items, 12, DatabaseCustomer.getCustomer(3)));
        
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            //System.out.println(invoice);
        }
        
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice);
        }
        
       
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1));
        
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice);
        }
        
        
        
    }
    
    public JStore()
    {
    }
}
