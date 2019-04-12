/**
 * Merupakan Class DatabaseInvoice.
 *
 * @author M. Kharisma Ramadhan
 * @version 28/02/2019
 */
import java.util.ArrayList;
public class DatabaseInvoice
{
    // variabel yang digunakan dalam class
    //private Invoice[] listInvoice; // inisialisasi variabel
    //private Invoice invoice;
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;
    
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
     return INVOICE_DATABASE;   
    }
    
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    { 
        INVOICE_DATABASE.add(invoice);
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
        Invoice value = null;
        for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getId() == id){
                value = invoice;
            }
        }
        return value;
    }
    
    public static Invoice getActiveOrder(Customer customer)
    {
       Invoice value = null;
       for (Invoice invoice : INVOICE_DATABASE){
            if ((invoice.getInvoiceStatus()==InvoiceStatus.Unpaid||
            invoice.getInvoiceStatus()==InvoiceStatus.Installment)
            &&invoice.getIsActive()==true){
                value = invoice;
            }
        }
        return value;
    }
    
    public static boolean removeInvoice(int id)
    {
        boolean value = false;
        for (Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId()==id && invoice.getIsActive()==true){
            invoice.setIsActive(false);
            INVOICE_DATABASE.remove(id);
            value = true;
            }
        }
        return value;
    }

    
    
    /*
     * Method of class DatabaseInvoice
     * @return true

    public static boolean addInvoice(Invoice invoice)
    {
        // return dari accessor 
        return true;
    }

    public static boolean removeInvoice(Invoice invoice)
    {
        // return dari accessor 
        return true;
    }
    
    
    /**
     * Method of class DatabaseInvoice
     * @return supplier
     
    public Invoice getInvoice()
    {
        // return dari accessor 
        return invoice;
    }
    
    /**
     * Method of class DatabaseInvoice
     * @return listSupplier
     
    //public Invoice[] getListInvoice(){
        // return dari accessor 
      //  return listInvoice;
   // }
   */
}