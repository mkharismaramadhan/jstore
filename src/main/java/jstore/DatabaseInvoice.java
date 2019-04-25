package jstore;
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
    
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoiceDB.getItem().equals(invoice.getItem()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                return invoice;
            }
        }
        return null;
    }
    
    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> invoice_list = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if( (invoice.getCustomer() == customer)  && (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoice.getInvoiceStatus() == InvoiceStatus.Installment) ){
                invoice_list.add(invoice);
            }
        }
        if(invoice_list != null){
            return invoice_list;
        }
        else{
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }
    
     public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                if(invoice.getIsActive()==true)
                {
                    invoice.setIsActive(false);
                }
                INVOICE_DATABASE.remove(id);
                return true;
            }
        }
         throw new InvoiceNotFoundException(id);
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