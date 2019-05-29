package jstore;
import java.util.*;

public class Transaction{
    
    public static void orderNewItem(ArrayList<Integer> item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

    }

    public static void orderSecondItem(ArrayList<Integer> item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        //itemID.add(item.getId())
        Invoice invoice=new Buy_Paid(itemID);
        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println("===Invoice Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }
    }

    public static void sellItemPaid(ArrayList<Integer> item, Customer customer){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
        //itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static void sellItemUnpaid(ArrayList<Integer> item, Customer customer){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
       // itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer, int installmentPeriod){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
       // itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static boolean finishTransaction (Invoice invoice){
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null){
            invoice.setIsActive(false);
            System.out.println("Invoice isActive: " + invoice.getIsActive());
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean cancelTransaction (Invoice invoice){
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null){
            try {
                DatabaseInvoice.removeInvoice(invoiceDB.getId());
                return true;
            }catch (InvoiceNotFoundException e){
                System.out.println(e.getExMessage());
                return false;
            }

        }
        else{
            return false;
        }
    }
}