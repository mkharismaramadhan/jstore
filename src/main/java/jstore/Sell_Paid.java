package jstore;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sell_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;

    // public Sell_Paid(int id, ArrayList<Integer> item, int totalItem, Customer customer)
    // {
    //    super(id, item,totalItem);
    //    this.customer=customer;
    // }
    
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        setIsActive(false);
        int total =0;
        for (int id: item)
        {
            Item temp = DatabaseItem.getItemFromID(id);
            int priceTemp = 0;
            if(temp!= null){
                priceTemp = temp.getPrice();
            }
            total  +=priceTemp;
        }
        super.setTotalPrice(total);
        //this.isActive = false;
    }
   
    public Customer getCustomer(){
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    // public void setInvoiceStatus(InvoiceStatus status)
    // {
        
    // }
    
    public String toString()
    {
       setTotalPrice(0);
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }

       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

       return "========INVOICE========" +
               "\nID: " +  getId() + 
       //        "\nItem: " + getItem().getName() +
       //        "\nAmount: "  + getTotalItem() +
               "\nBuy date: " + sdf.format(getDate()) +
       //        "\nPrice: " + getItem().getPrice() +
               "\nTotal price: " + getTotalPrice() +
       //        "\nSupplier ID: " + getItem().getSupplier().getId() +
       //        "\nSupplier name: " + getItem().getSupplier().getName() +
               "\nCustomer ID: " + customer.getId() +
               "\nCustomer Name: " + customer.getName() +
               "\nStatus: " + InvoiceStatus.Paid + 
               "\nSell Success\n";
    }
}
