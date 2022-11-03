package com.example.jpapractice.practice1.service;

import com.example.jpapractice.practice1.domain.Product;
import com.example.jpapractice.practice1.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    public boolean deleteProductById(int productId) {
        productRepository.deleteById(productId);
        return true;
    }
}
