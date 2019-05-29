package jstore;
public class CustomerNotFoundException extends Exception
{
    private int customer_error;

    public CustomerNotFoundException(int customer_input){
        super("====Customer Not Found====\n" +
                "Customer ID: ");
        customer_error = customer_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + customer_error + " not found.\n";
    }
}