package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class SupplierController {


    @RequestMapping("/suppliers")
    public ArrayList<Supplier> supplierList()
    {
        ArrayList<Supplier> suppliers = DatabaseSupplier.getSupplierDatabase();
        return suppliers;
    }

    @RequestMapping("/suppliers/{id_supplier}")
    public Supplier getSupplier(@PathVariable int id_supplier) {
        Supplier supplier = DatabaseSupplier.getSupplier(id_supplier);
        return supplier;
    }
}
