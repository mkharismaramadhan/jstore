package jstore;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    private String value;
    
    private InvoiceType(String value)
    {
        this.value=value;
    }
    
    public String toString()
    {
        return value;
    }
    

}
