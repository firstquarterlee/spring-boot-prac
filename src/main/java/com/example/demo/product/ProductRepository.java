package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, String> db = new HashMap<>();
    private int id = 1;

    public String findProduct(int idx) {
        return db.get(idx);
    }

    public void save(String productName) {
        db.put(id++, productName);
    }
}
