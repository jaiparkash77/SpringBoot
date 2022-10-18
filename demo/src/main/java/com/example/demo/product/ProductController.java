package com.example.demo.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    List<Product> productList = new ArrayList<>();

    @PostMapping("/products")
    Product createProduct(@RequestBody Product prod) {
        productList.add(prod);
        return prod;
    }

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return productList;
    }
}
