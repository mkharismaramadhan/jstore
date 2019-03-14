/**
 * Class JStore
 * Berisi mengenai fungsi utama JStore
 * @author M. Kharisma Ramadhan
 * @version 1.0
 * since 2019
 */

public class JStore
{
    /**
     * Method untuk main program
     */
    public static void main(String[] args)
    {
        Location lokasi = new Location("Serang", "Banten", "Tempat tinggal");
        Supplier identitas = new Supplier(10, "Rama", "mkharismar98@gmail.com", "087771831612", lokasi);
        lokasi.printData();
        identitas.printData();
        Transaction.orderNewItem(identitas);
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        Transaction.orderSecondItem(identitas);
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        Transaction.orderRefurbishedItem(identitas);
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
        
        //Item barang = new Item(8, "Kharisma", 10, 15000, "tech", identitas);
        //Invoice unit = new Invoice(12, barang, "12 Maret 2019", 15000); 
        //identitas.printData();
        //System.out.println(identitas.getPhoneNumber());
        //identitas.setName("xxx");
        //identitas.printData();
        //DatabaseItem.additem(barang);
    }
    
    /**
     * Constructor dari JStore
     */
    public JStore()
    {
    }
}
