
/**
 * Class Location
 * Berisi mengenai location
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor dari class location yang berfungsi untuk
     * menset variabel
     * @param city, province, description
     */
    public Location(String city, String province, String 
    description)
    {
    this.city = city;
    this.province = province;
    this.description = description;
    }
    
    /**
     * Method untuk mendapatkan nilai province
     * @return province
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * Method untuk mendapatkan nilai city
     * @return city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * Method untuk mendapatkan nilai description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Method untuk menset nilai province
     * @param province
     */
    public void setProvince(String province)
    {
    this.province = province;
    }
    
    /**
     * Method untuk menset nilai city
     * @param city
     */
    public void setCity(String city)
    {
    this.city = city;
    }
    
    /**
     * Method untuk menset nilai description
     * @param description
     */
    public void setDescription(String description)
    {
    this.description = description;
    }
    
    /**
     * Method untuk mencetak nilai province
     */
    public void printData()
    {
        System.out.println("==========LOCATION=======");
        System.out.println("Provinsi :" + province);
        System.out.println("Kota :" + city);
        System.out.println("Deksripsi :" + description);
    }
}
