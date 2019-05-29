package jstore;
import java.text.SimpleDateFormat;
import java.util.*;
public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private String date;
    private Calendar tanggal;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Invoice(ArrayList<Integer> item)
    {
       // this.id=id;
       // this.totalItem=totalItem;
       // setTotalPrice(totalItem*item.getPrice());
       
       this.id = DatabaseInvoice.getLastInvoiceID()+1;
       this.item = item;
        tanggal = Calendar.getInstance();
        Date dates = new Date();
        this.setDate(dateFormat.format(dates));
        this.date = getDate();
    }

    public int getId()
    {
        return id;
    }
    
    public ArrayList<Integer> getItem()
    {
        return item;
    }

    public String getDate() {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
        
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public void setTotalPrice(int totalPrice)
    {
        for(Integer invoice : item)
        {
            this.totalPrice=this.totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }
    
    // public void setTotalItem(int totalItem)
    // {
    //   this.totalItem=totalItem;
    // }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        // this.invoiceStatus=invoiceStatus;
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    public abstract String toString();
}
