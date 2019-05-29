package jstore;
import java.util.ArrayList;
public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE= new ArrayList<Invoice>();
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
        for(Invoice temp : INVOICE_DATABASE){
            if(invoice.getCustomer() == temp.getCustomer() && invoice.getItem() == temp.getItem()){
                throw new InvoiceAlreadyExistsException(invoice);
//                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }

    public static Invoice getInvoice(int id)
    {
       for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getId() == id)
            {
                return invoice;
            }
       }
       return null;
    }

    //   public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveInvoiceException {
    //     ArrayList<Invoice> temp = new ArrayList<Invoice>();
    //     for(Invoice invoice : INVOICE_DATABASE){
    //         if( (invoice.getCustomer() == customer)  && (invoice.getIsActive()) && ((invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoice.getInvoiceStatus() == InvoiceStatus.Installment)) ){
    //            temp.add(invoice);
    //       }
    //  }
    //    if(temp.size() > 0){
    //         return temp;
    //    }
    //    else{
    //       throw new CustomerDoesntHaveActiveInvoiceException(customer);
    //   }
    //}

    public static ArrayList<Invoice> getActiveOrder(Customer customer){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            System.out.println("CUSTOMER in invoice = "+invoice.getCustomer().getName());
            System.out.println("CUSTOMER in db = "+customer.getName());
            if (customer.getId()==(invoice.getCustomer().getId()) && invoice.getIsActive() ) {
                temp.add(invoice);
            }
        }
        if (temp.size() > 0) {
            return temp;
        }
        return temp;
    }
    
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId() == id){
                if (invoice.getIsActive()) {
                    invoice.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
//        return false;
    }


    public static ArrayList<Invoice> getInactiveOrder(Customer customer) {
        ArrayList<Invoice> temp = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            System.out.println("CUSTOMER in invoice = "+invoice.getCustomer().getName());
            System.out.println("CUSTOMER in db = "+customer.getName());
            if (customer.getId()==(invoice.getCustomer().getId()) && !invoice.getIsActive() ) {
                temp.add(invoice);
            }
        }
        if (temp.size() > 0) {
            return temp;
        }
        return temp;
    }
}