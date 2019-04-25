package jstore;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.ArrayList;

public class Sell_Unpaid extends Invoice
{
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item,
    Customer customer)
    {
        super(item);
        this.customer = customer;
        //this.dueDate = Calendar.getInstance();
        //this.dueDate.add(Calendar.DATE,+1);
        //INVOICE_TYPE = InvoiceType.Sell;
        //INVOICE_STATUS = InvoiceStatus.Unpaid;
        isActive = true;
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
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nIs Active: " + getIsActive();
        string += "\nDue date: " + getdueDate();
        string += "\nIf payment is not received by dueDate, transaction will be cancelled.";
        return string;
    }
}
