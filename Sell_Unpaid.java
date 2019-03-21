
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private String dueDate;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalItem,
    int totalPrice, String dueDate)
    {
        super(id, item, date, totalItem, totalPrice);
        this.dueDate = dueDate;
        INVOICE_TYPE = InvoiceType.Sell;
        INVOICE_STATUS = InvoiceStatus.Unpaid;
        
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
        
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
        
    }
    
    public String getdueDate()
    {
        return dueDate;
    
    }
    
    public void printData()
    {
        System.out.println("==========Sell and Unpaid=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item :" + getItem().getName());
        System.out.println("Invoice Status :" + INVOICE_STATUS);
        System.out.println("Invoice Type :" + INVOICE_TYPE);
        System.out.println("Total Harga :" + getTotalPrice());
    }
}
