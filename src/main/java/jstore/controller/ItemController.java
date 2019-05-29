package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class ItemController {

    @RequestMapping("/items")
    public ArrayList<Item> itemList()
    {
        ArrayList<Item> items = DatabaseItem.getItemDatabase();
        return items;
    }

    @RequestMapping("/items/{id_item}")
    public Item getItem(@PathVariable int id_item) {
        Item item = DatabaseItem.getItemFromID(id_item);
        return item;
    }
}
