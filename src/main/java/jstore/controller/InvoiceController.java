package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoicecustomer/{id_customer}", method = RequestMethod.GET)
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<Invoice> tempArrayList = new ArrayList<Invoice>();
        try {
            tempArrayList = DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
        } catch (CustomerDoesntHaveActiveException e) {
            e.getExMessage();
        }
        return tempArrayList;
    }

    @RequestMapping(value = "/invoice/{id_invoice}", method = RequestMethod.GET)
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoice = DatabaseInvoice.getInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping(value = "/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value="listItem") ArrayList<Integer> arrayListItem,
                                     @RequestParam(value="customerID") int customerID
    ){
        Invoice tempInvoice = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(arrayListItem, DatabaseCustomer.getCustomer(customerID)));
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        tempInvoice = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return tempInvoice;
    }

    @RequestMapping(value = "/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value="listItem") ArrayList<Integer> arrayListItem,
                                       @RequestParam(value="customerID") int customerID
    )
    {
        Invoice tempInvoice = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(arrayListItem, DatabaseCustomer.getCustomer(customerID)));
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        tempInvoice = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return tempInvoice;
    }

    @RequestMapping(value = "/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value="listItem") ArrayList<Integer> arrayListItem,
                                            @RequestParam(value="customerID") int customerID,
                                            @RequestParam(value="installmentPeriod") int installmentPeriod
    )
    {
        Invoice tempInvoice = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(arrayListItem, installmentPeriod,DatabaseCustomer.getCustomer(customerID)));
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        tempInvoice = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return tempInvoice;
    }

    @RequestMapping(value = "/canceltransaction", method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value="invoiceID") int invoiceID)
    {
        try {
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(invoiceID));
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }
        return DatabaseInvoice.getInvoice(invoiceID);
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value="invoiceID") int invoiceID)
    {
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(invoiceID));
        return DatabaseInvoice.getInvoice(invoiceID);
    }
}