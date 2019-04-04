
/**
 * Class DatabaseSupplier
 * Berisi mengenai database Supplier
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */
public class DatabaseSupplier
{
    
    // instance variables - replace the example below with your own
    private Supplier[] listSupplier;
    private Supplier supplier;

    /**
     * Method untuk menambah supplier
     * @param  supplier
     * @return true
     */
    public boolean addSupplier(Supplier supplier)
    {
        return true;
    }
    
    /**
     * Method untuk menghapus supplier
     * @param  supplier
     */
    public void removeSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    /**
     * Method untuk mengambil nilai dari var supplier
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Method untuk mengambil listSupplier
     * @return listSupplier
     */
    public Supplier[] getListSupplier()
    {
        return listSupplier;
    }
    
}
