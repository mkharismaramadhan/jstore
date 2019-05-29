package jstore;
public class CustomerDoesntHaveActiveInvoiceException extends Exception
{
    private Customer customer_error;
    public CustomerDoesntHaveActiveInvoiceException(Customer customer_input)
    {
        super("====Dont Have Active====\n");
        customer_error = customer_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + customer_error+ "doesnt have active invoice\n";
    }
}
