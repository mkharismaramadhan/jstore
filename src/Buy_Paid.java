
import java.util.ArrayList;
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive = false;
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
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nBuy Success";
        return string;
    }

}
