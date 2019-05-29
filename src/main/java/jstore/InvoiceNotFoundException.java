package jstore;
public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input){
        super("====Invoice Not Found====\n" +
                "Invoice ID: ");
        invoice_error=invoice_input;
    }

    public String getExMessage(){
        return super.getMessage() + invoice_error + " not found.\n";
    }
}