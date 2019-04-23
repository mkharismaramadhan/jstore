/**
 * Class JStore
 * Berisi mengenai fungsi utama JStore
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
import java.util.ArrayList;
public class JStore {
    /**
     * Method untuk main program
     */
    public static void main(String[] args) {
        Location lokasi = new Location("Serang", "Banten", "Kota Cabang");
        try {
            DatabaseSupplier.addSupplier(new Supplier("aji", "aji@gmail.com", "+628576590000", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("roy", "roy@gmail.com", "+628576593333", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("kevin", "kevin@gmail.com", "+628576593333", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("aji", "aji@gmail.com", "+628576590000", lokasi));
        } catch (SupplierAlreadyExistsException err){
            System.out.println("==Supplier Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Rama","rama@gmail.com","rama","1234", 2019, 9, 10));
            DatabaseCustomer.addCustomer(new Customer("Kharisma","kharisma@gmail.com","kharisma","5678", 2019, 8, 7));
            DatabaseCustomer.addCustomer(new Customer("Ramadhan","ramadhan@gmail.com","ramadhan","9908", 2019, 3, 3));
            DatabaseCustomer.addCustomer(new Customer("Rama","rama@gmail.com","rama","1234", 2019, 9, 10));
        }catch (CustomerAlreadyExistsException err){
            System.out.println("===Customer Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

        try {
            DatabaseItem.addItem(new Item("Rama", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Kharisma", 3000, ItemCategory.Furniture,ItemStatus.New, DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item("Ramadhan", 4000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
            DatabaseItem.addItem(new Item("Rama", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//item
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        item.add(2);

        ArrayList<Integer> item1 = new ArrayList<Integer>();
        item1.add(2);
        item1.add(3);

        //ArrayList<Integer> item2 = new ArrayList<Integer>();
        //item2.add(1);
        //item2.add(3);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
            //DatabaseInvoice.addInvoice(new Sell_Installment(item2, 10, DatabaseCustomer.getCustomer(2)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item1, DatabaseCustomer.getCustomer(3)));
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException err){
            System.out.println("===Invoice Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//REMOVE
        try {
            DatabaseItem.removeItem(4);
        } catch (ItemNotFoundException e) {
            System.out.println("===Item Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseInvoice.removeInvoice(4);
        } catch (InvoiceNotFoundException e) {
            System.out.println("===Invoice Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseCustomer.removeCustomer(4);
        } catch (CustomerNotFoundException e) {
            System.out.println("===Customer Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseSupplier.removeSupplier(4);
        }catch (SupplierNotFoundException e) {
            System.out.println("===Supllier Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(3));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println("===Don't Have Active===");
            System.out.println(e.getExMessage());
            System.out.println();
        }
        ArrayList<Invoice> InvDB = DatabaseInvoice.getInvoiceDatabase();
        ArrayList<Supplier> SupDB = DatabaseSupplier.getSupplierDatabase();
        ArrayList<Customer> CustDB = DatabaseCustomer.getCustomerDatabase();
        ArrayList<Item> ItemmDB = DatabaseItem.getItemDatabase();

        System.out.println("====Supplier====\n" + SupDB);
        System.out.println("====Customer====\n" + CustDB);
        System.out.println("====Item====\n" + ItemmDB);
        System.out.println(InvDB);


    }
}
        /*DatabaseCustomer.addCustomer(new Customer("Aji","aji@gmail.com","aji","1234",1998,4,21));
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
*/
