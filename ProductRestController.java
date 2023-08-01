package com.Springtest.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@RestController

public class ProductRestController {

    @PostMapping("/Product")

    public String saveProduct(@RequestBody Product p){
        System.out.println(p);
        return "Product Saved";
    }

    @GetMapping("/Product/{pid}")
        public Product getProduct(@PathVariable Integer pid) {
        Product p = null;
        if (pid == 101) {
            p = new Product(101, "Mouse", 500.0F);
        } else if (pid == 100) {
            p = new Product(100, "HARD DISK", 3500.0F);
        }
        return p;

    }
    @GetMapping("/Product")
    public List<Product> getproduct(){
        Product p1 = new Product(101, "Mouse", 500.0F);
        Product p2 = new Product(100, "HARD DISK", 3500.0F);

        List <Product> products= new ArrayList<>();

        products.add(p1);
        products.add(p2);


        return products;

    }
    }


