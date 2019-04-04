
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;

public class Sell_Unpaid extends Invoice
{
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private Calendar dueDate;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem,
    Customer customer)
    {
        super(id, item, totalItem);
        this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE,+1);
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
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public Calendar getdueDate()
    {
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    
    public String toString()
    {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "Status: "
                + this.INVOICE_STATUS + "Due date: " + this.dueDate
                + "If payment is not received by due date, transcation will be canceled";
    }
}
