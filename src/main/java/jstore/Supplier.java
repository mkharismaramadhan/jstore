package jstore;
import java.util.regex.*;
import java.util.*;
/**
 * Class Supplier
 * Berisi mengenai Supplier
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    public Supplier(String name, String email, 
    String phoneNumber, Location location)
    {
            id=DatabaseSupplier.getLastSupplierID()+1;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.location = location;
    }
    
    /**
     * Method untuk mendapatkan nilai ID
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method untuk mendapatkan nilai name
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method untuk mendapatkan nilai email
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk mendapatkan nilai phoneNumber
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Method untuk mendapatkan nilai location
     * @return location
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Method untuk menset nilai id
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk menset nilai name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method untuk menset nilai email
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Method untuk menset nilai phoneNumber
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Method untuk menset nilai location
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    /**
     * Method untuk mencetak nama
     */
    public String toString()
    {
        return "===SUPPLIER==="+
        "\nID: " + id+
        "\nName: " + name+
        "\nEmail: " + email+
        "\nPhone Number: " + phoneNumber+
        "\nLocation: " + location.getCity();
    }
     
}
