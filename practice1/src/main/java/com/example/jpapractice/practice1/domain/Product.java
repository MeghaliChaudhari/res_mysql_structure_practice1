package com.example.jpapractice.practice1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producttbl")
public class Product {

    @Id
    private int productId;
    private String productName;
    private String productDescription;
    private String amountInStock;

    public Product() {
    }

    public Product(int productId, String productName, String productDescription, String amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountInStock = amountInStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(String amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", amountInStock='" + amountInStock + '\'' +
                '}';
    }
}
