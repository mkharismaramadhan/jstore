
/**
 * Class Item
 * Berisi mengenai item dari jStore
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */

public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor dari class yang menset variabel
     * @param id, name, stock, price, category, supplier
     */
    public Item(int id, String name, int stock, int price,
    ItemCategory category, ItemStatus status, Supplier supplier)
    {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.status = status;
        this.supplier = supplier;        
    }
    
    /**
     * Method untuk mendapatkan nilai ID
     * @return id
     */
    public int getID() 
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
     * Method untuk mendapatkan nilai stock
     * @return stock
     */
    public int getStock()
    {
        return stock;
    }
    
    /**
     * Method untuk mendapatkan nilai price
     * @return price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Method untuk mendapatkan nilai category
     * @return category
     */
    public ItemCategory getCategory() 
    {
        return category;
    }
    
    /**
     * Method untuk mendapatkan nilai category
     * @return category
     */
    public ItemStatus getStatus() 
    {
        return status;
    }
    
    /**
     * Method untuk mendapatkan nilai supplier
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
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
     * Method untuk menset nilai stock
     * @param stock
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    /**
     * Method untuk menset nilai price
     * @param price
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
   
    /**
     * Method untuk menset nilai category
     * @param category
     */
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    
    /**
     * Method untuk menset nilai category
     * @param category
     */
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    
    /**
     * Method untuk menset nilai supplier
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    /**
     * Method untuk mencetak nama item
     */
    public void printData()
    {
        System.out.println("==========ITEM=======");
        System.out.println("ID :" + id);
        System.out.println("Name :"  + name );
        System.out.println("Kategori :" + category);
        System.out.println("Status :" + status);
        System.out.println("Supplier :" + supplier.getName());
    }
    
}
