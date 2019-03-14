
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.New;
        Item barang = new Item(1, "Handphone", 10, 15000, category, status, supplier);
        DatabaseItem.additem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(1, barang, "14 Maret 2019", barang.getPrice());
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        System.out.println("=========================Order New Item===================");
        pesan.printData();
        barang.printData();
    }
    
    public static void orderSecondItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Furniture;
        ItemStatus status = ItemStatus.Second;
        Item barang = new Item(2, "Kursi", 10, 20000, category, status, supplier);
        DatabaseItem.additem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(2, barang, "14 Maret 2019", barang.getPrice());
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        System.out.println("=========================Order Second Item===================");
        pesan.printData();
        barang.printData();
    }
    
    public static void orderRefurbishedItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Stationery;
        ItemStatus status = ItemStatus.Refurbished;
        Item barang = new Item(4, "Pulpen", 10, 1000, category, status, supplier);
        DatabaseItem.additem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(4, barang, "14 Maret 2019", barang.getPrice());
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        System.out.println("=========================Order Refurbished Item===================");
        pesan.printData();
        barang.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        InvoiceStatus status = InvoiceStatus.Paid;
        ItemStatus status2 = ItemStatus.Sold;
        Invoice pesan = new Invoice(1, item, "14 Maret 2019", item.getPrice());
        pesan.setInvoiceStatus(status);
        item.setStatus(status2);
        System.out.println("=========================Sell Item Paid===================");
        pesan.printData();
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        InvoiceStatus status = InvoiceStatus.Unpaid;
        ItemStatus status2 = ItemStatus.Sold;
        Invoice pesan = new Invoice(2, item, "14 Maret 2019", item.getPrice());
        pesan.setInvoiceStatus(status);
        item.setStatus(status2);
        System.out.println("=========================Sell Item Unpaid===================");
        pesan.printData();
        item.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        InvoiceStatus status = InvoiceStatus.Installment;
        ItemStatus status2 = ItemStatus.Sold;
        Invoice pesan = new Invoice(3, item, "14 Maret 2019", item.getPrice());
        pesan.setInvoiceStatus(status);
        item.setStatus(status2);
        System.out.println("=========================Sell Item Installment===================");
        pesan.printData();
        item.printData();
    }
}
