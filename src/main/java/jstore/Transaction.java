package jstore;
/**
* <h1>Transaction.java</h1>
* <p>
* XClass ini merupakan bagian invoice dari JStore Application
* XClass ini representasi dari sebuah invoice yang terdapat pada JStore Application
* </p>
* 
* 
* @author   M. Kharisma Ramadhan
* @version  1.0
* @since    2019/03/14
*/
import java.util.*;

public class Transaction{

    public static void orderNewItem(ArrayList<Integer> item_list){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void orderSecondItem (ArrayList<Integer> item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void orderRefurbishedItem (ArrayList<Integer> item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemPaid (ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice=new Sell_Paid(item,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemUnpaid (ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice=new Sell_Unpaid(item,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemInstallment (ArrayList<Integer> item, Customer customer, int installmentPeriod)
    {
        Invoice invoice=new Sell_Installment(item,installmentPeriod,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static boolean finishTransaction(Invoice invoice){
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()&&(invoice.getInvoiceStatus().equals("Installment")||invoice.getInvoiceStatus().equals("Unpaid"))){
                invoice.setIsActive(false);
                System.out.print(invoice.getIsActive());
                return true;
            }
        }
        return false;
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