package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class SupplierController
{
    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public ArrayList<Supplier> supplierList()
    {
        return DatabaseSupplier.getSupplierDatabase();
    }

    @RequestMapping(value = "/suppliers/{id}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id)
    {
        return DatabaseSupplier.getSupplier(id);
    }
}