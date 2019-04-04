
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        super(id, item, totalItem);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
        
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
        
    }
    
    public String toString()
    {
        
        return "==========Buy and Paid======="  
        + "\nID :" + getId()
        + "\nItem :" + getItem().getName()
        + "\nAmount :" + getTotalItem()
        + "\nBuy date :" + getDate()
        + "\nPrice :" + getItem().getPrice()
        + "\nPrice Total :" + getTotalPrice()
        + "\nSupplier ID :" + getItem().getSupplier().getId()
        + "\nSupplier Name :" + getItem().getSupplier().getName()
        + "\nStatus = PAID\nBuy Success";
    }

}
