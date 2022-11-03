package com.example.jpapractice.practice1.service;

import com.example.jpapractice.practice1.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProduct();

    public Product getProductById(int productId);

    public boolean deleteProductById(int productId);
}
