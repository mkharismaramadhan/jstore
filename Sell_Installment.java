
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, 
    int installmentPeriod, Customer customer)
    {
        super(id, item, totalItem);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
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
        totalPrice = installmentPrice*installmentPeriod;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public String toString()
    {
         return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "status: "
                + this.INVOICE_STATUS + "Installment Period: " + this.installmentPeriod + "Sell success";
    }

}
