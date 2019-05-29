package jstore;
import javax.xml.crypto.Data;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JStore
{
    public JStore()
    {
        
    }

    public static void main(String[] args)
    {
        Location location1 = new Location("Banten","Serang", "Serang");
        Location location2 = new Location("Banten","Serang", "Serang");


        try {
            DatabaseSupplier.addSupplier(new Supplier("rama","rama@gmail.com", "0800000004", location2));
        } catch (SupplierAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("kharisma","kharisma@gmail.com", "0800000003", location1));
        } catch (SupplierAlreadyExistsException e) {
        }


        try {
            DatabaseItem.addItem(new Item("Router 1941", 4500000, ItemCategory.Electronics, ItemStatus.New,  DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Switch", 70000000, ItemCategory.Electronics, ItemStatus.New , DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Router 2900", 8000000, ItemCategory.Electronics, ItemStatus.Second, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Firewall", 2540000, ItemCategory.Electronics, ItemStatus.Refurbished, DatabaseSupplier.getSupplier(2)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Keylogger", 7850000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }


        SpringApplication.run(JStore.class, args);
    }
}