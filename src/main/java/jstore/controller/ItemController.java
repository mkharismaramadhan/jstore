package jstore.controller;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jstore.*;
import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class ItemController {

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<Item> itemList() {
        return DatabaseItem.getItemDatabase();
    }

    @RequestMapping(value = "/items/{id}", method= RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id) {
        Item item = DatabaseItem.getItemFromID(id);
        return item;
    }
}
