package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class InvoiceController {

    @RequestMapping("/invoicecustomer/{id_customer}")
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<Invoice> invoice = null;
        try {
            invoice = DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
            return invoice;
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping("/invoice/{id_invoice}")
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoices = DatabaseInvoice.getInvoice(id_invoice);
        return invoices;
    }

    @RequestMapping(value = "/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value="listitem") ArrayList<Integer> listItem,
                                     @RequestParam(value="id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Paid(listItem, DatabaseCustomer.getCustomer(id_customer)));
            if(res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value="listitem") ArrayList<Integer> listItem,
                                       @RequestParam(value="id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(id_customer)));
            if(res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value="listitem") ArrayList<Integer> listItem,
                                            @RequestParam(value="period") int installment_period,
                                            @RequestParam(value="id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Installment(listItem, installment_period,DatabaseCustomer.getCustomer(id_customer)));
            if(res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/canceltransaction", method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value="invoiceID") int invoiceID)
    {
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(invoiceID));
        return DatabaseInvoice.getInvoice(invoiceID);
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value="id") int id_invoice){
        boolean res = Transaction.finishTransaction(DatabaseInvoice.getInvoice(id_invoice));
        if (res == true){
            System.out.println("Invoice ini telah diakhiri");
            return DatabaseInvoice.getInvoice(id_invoice);
        }
        return null;
    }
}
