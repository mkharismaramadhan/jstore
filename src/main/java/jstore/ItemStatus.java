package jstore;
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
    private String value;
       
    public String toString()
    {
        return value;
    }
    
    private ItemStatus(String value)
    {
        this.value=value;
    }
}
