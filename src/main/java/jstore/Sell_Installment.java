package jstore;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Sell_Installment extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int InstallmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
        isActive = true;
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
        
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
        
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
        
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
        
    }
    
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice = (totalPrice/installmentPeriod)*(102/100);
    }

    public void setTotalPrice()
    {
        setTotalPrice(installmentPrice*installmentPeriod);
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
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
        string += "\nInstallment Price: " + getInstallmentPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nIs Active: " + getIsActive();
        string += "\nInstallment period: " + getInstallmentPeriod();
        string += "\nSell Success";
        return string;
    }

}
