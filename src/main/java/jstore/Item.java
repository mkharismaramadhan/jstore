package jstore;

public class Item
{
    private int id;
    private String name;
    // private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    /**
     * Konstruktor dari kelas Item
     * @param name Sebagai nama dari barang
     * @param price Sebagai harga dari barang yang tersedia
     * @param category Sebagai kategori dari barang yang tersedia
     * @param supplier Sebagai penyuplai barang
     */
    public Item(String name, int price, ItemCategory category, ItemStatus status, Supplier supplier)
    {
        this.id = DatabaseItem.getLastItemID()+1;
        this.name=name;
        this.status=status;
        this.price=price;
        this.supplier=supplier;
        this.category=category;
    }

    /**
     * Metode ini akan menampilkan Id yang di set pada konstruktor atau mutator
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metode ini akan menampilkan nama yang di set pada konstruktor atau mutator
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Metode ini akan menampilkan harga dari suatu barang yang di set pada konstruktor atau mutator
     * @return price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Metode ini akan menampilkan kategori suatu barang yang di set pada konstruktor atau mutator
     * @return category
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    /**
     * Metode ini akan menampilkan nama penyuplai yang di set pada konstruktor atau mutator
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
     /**
     * Metode ini akan meminta Id yang akan ditampilkan di aksesor
     * @param id Id dari barang yang ingin di-set
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Metode ini akan meminta nama dari barang yang akan ditampilkan di aksesor
     * @param name Nama untuk barang yang ingin di-set
     */
    public void setName(String name)
    {
        this.name=name;
    }

    /**
     * Metode ini akan meminta harga dari barang yang akan ditampilkan di aksesor
     * @param price Harga dari barang yang ingin di-set
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /**
     * Metode ini akan meminta kategori dari barang yang akan ditampilkan di aksesor
     * @param category Kategori dari barang yang ingin di-set
     */
    public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
    
    /**
     * Metode ini akan meminta nama penyuplai barang yang akan ditampilkan di aksesor
     * @param supplier Penyuplai dari barang yang ingin di-set
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    //public void printData()
	//{
	//	System.out.println("\n======== ITEM ========");
	//	System.out.println("ID: " + id);
	//	System.out.println("Name: " + name);
	//	System.out.println("Category: " + category);
	//	System.out.println("Status: " + status);
	//	System.out.println("Supplier: " + supplier.getName());
	//}
    
    /**
     * Metode ini dijalankan untuk mencetak nama dari barang pada layar
     */
    public String toString(){
        return	"Item: {" +
				"ID: " + id +
				", Name: " + name +
				", Category: " + category +
				", Status: " + status +
				", Supplier: " + supplier.getName()+ "}\n";
    }
}
