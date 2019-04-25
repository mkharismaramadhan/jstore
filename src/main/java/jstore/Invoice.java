package jstore;
/**
 * Class Invoice
 * Berisi mengenai invoice
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
import java.util.Calendar;
import java.util.ArrayList;

public abstract class Invoice
{
    // instance variables - replace the example below with your own
   
    private int id;
    private Calendar date;
    private int totalPrice;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    //private int totalItem;
    private boolean isActive;
    private Customer customer;
    //private InvoiceStatus status;
    //private InvoiceType type;

    public Invoice(ArrayList<Integer> item)
    {
       //this.id = id;
       this.item = item;
       id = DatabaseInvoice.getLastInvoiceID()+1;
       //this.totalItem = totalItem;
       //this.date = Calendar.getInstance();
       //setTotalPrice(totalItem*item.getPrice());
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
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    /**
     * Method untuk mendapatkan nilai date
     * @return date
     */
    public Calendar getDate()
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
    
    abstract public InvoiceStatus getInvoiceStatus();
    
    abstract public InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * Method untuk mendapatkan nilai totalPrice
     * @return totalPrice
     */
    /*public int getTotalItem()
    {
        return totalItem;
    }
    */
    /*
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    
    public InvoiceType getInvoiceType()
    {
        return type;
    }
    */
    
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
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk menset nilai date
     * @param date
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    /**
     * Method untuk menset nilai totalPrice
     * @param totalPrice
     */
    public void setTotalPrice (int totalPrice)
    {
         for(Integer invoice : item)
        {
            totalPrice=totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    
    
    /*/**
     * Method untuk menset nilai item
     * @param item
     
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    */
    
    /**
     * Method untuk menset nilai item
     * @param item
     */
    /*public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    */
    
    /**
     * Method untuk mencetak nilai totalPrice
     */
    public abstract String toString();

}