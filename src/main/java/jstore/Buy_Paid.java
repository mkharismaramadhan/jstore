package jstore;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Buy_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        setIsActive(false);
        //this.isActive=false;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    // public void setInvoiceStatus(InvoiceStatus status)
    // {
        
    // }
    
    public String toString()
    {
       setTotalPrice(0);
/*       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
*/
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

         return "========INVOICE========" +
                "\nID: " +  getId() +
       //         "\nItem: " + getItem().getName() +
       //         "\nAmount: "  + getTotalItem() +
                "\nBuy date: " + sdf.format(getDate()) +
       //         "\nPrice: " + getItem().getPrice() +
                "\nTotal price: " + getTotalPrice() +
       //         "\nSupplier ID: " + getItem().getSupplier().getId() +
       //         "\nSupplier name: " + getItem().getSupplier().getName() +
                "\nStatus: " + InvoiceStatus.Paid +
                "\nSell Success\n";
    }
}