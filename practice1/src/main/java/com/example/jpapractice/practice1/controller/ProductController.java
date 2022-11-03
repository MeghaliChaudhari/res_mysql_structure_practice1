package com.example.jpapractice.practice1.controller;


import com.example.jpapractice.practice1.domain.Product;
import com.example.jpapractice.practice1.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/v1/")
public class ProductController {

    private ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @PostMapping("/products")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productServiceImpl.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/productdetails")
    public ResponseEntity<?> getProductDetails(){
        return new ResponseEntity<>(productServiceImpl.getProduct(),HttpStatus.OK);
    }

    @GetMapping("/productdetails/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable int productId){
        return new ResponseEntity<>(productServiceImpl.getProductById(productId),HttpStatus.FOUND);
    }

    @DeleteMapping("/productdetails/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable int productId){
        return new ResponseEntity<>(productServiceImpl.deleteProductById(productId),HttpStatus.OK);

    }
}
