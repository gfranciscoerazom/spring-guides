package com.example.accessingdatarest;

public interface ProductDao {
    Product findById(Long id);
    Product save(Product product);
}