
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
    public static void orderNewItem(Item item)
    {
        Invoice pesan = new Buy_Paid(1, item, "21/03/2019", 1, item.getPrice());
        if (pesan instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        pesan.printData();
        item.printData();
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice pesan = new Buy_Paid(2, item, "21/03/2019", 1, item.getPrice());
        if (pesan instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        pesan.printData();
        item.printData();
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice pesan = new Buy_Paid(3, item, "21/03/2019", 1, item.getPrice());
        if (pesan instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        pesan.printData();
        item.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice pesan = new Sell_Paid(4, item, "21/03/2019", 1, item.getPrice());
        pesan.printData();
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice pesan = new Sell_Unpaid(5, item, "21/03/2019", 1, item.getPrice(), "23/03/2019");
        pesan.printData();
        item.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        Invoice pesan = new Sell_Installment(6, item, "21/03/2019", 1, item.getPrice(), 13);
        pesan.printData();
        item.printData();
    }
}
