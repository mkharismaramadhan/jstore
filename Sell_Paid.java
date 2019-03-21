
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, String date, int totalItem,
    int totalPrice)
    {
        super(id, item, date, totalItem, totalPrice);

    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
        
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
        
    }
    
    public void printData()
    {
        System.out.println("==========Sell and Paid=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item :" + getItem().getName());
        System.out.println("Invoice Status :" + INVOICE_STATUS);
        System.out.println("Invoice Type :" + INVOICE_TYPE);
        System.out.println("Total Harga :" + getTotalPrice());
    }
}
