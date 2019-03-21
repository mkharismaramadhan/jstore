/**
 * Class Invoice
 * Berisi mengenai invoice
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
   
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    
    /**
     * Constructor dari class invoice yang berfungsi untuk
     * menset variabel
     * @param id, item, date, totalPrice
     */
    public Invoice(int id, Item item, String date, int totalItem,
    int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalItem = totalItem;
        this.totalPrice = totalPrice;
    }
    
    /**
     * Method untuk mendapatkan nilai ID
     * @return id
     */   
    public int getId()
    {
        return id;
    }
    
    /**
     * Method untuk mendapatkan nilai item
     * @return item
     */
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method untuk mendapatkan nilai date
     * @return date
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Method untuk mendapatkan nilai totalPrice
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * Method untuk mendapatkan nilai totalPrice
     * @return totalPrice
     */
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    
    public InvoiceType getInvoiceType()
    {
        return type;
    }
    
    /**
     * Method untuk menset nilai id
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk menset nilai item
     * @param item
     */
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk menset nilai date
     * @param date
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * Method untuk menset nilai totalPrice
     * @param totalPrice
     */
    public void setTotalPrice (int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    /**
     * Method untuk menset nilai item
     * @param item
     */
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    
    /**
     * Method untuk menset nilai item
     * @param item
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * Method untuk mencetak nilai totalPrice
     */
    public abstract void printData();

}