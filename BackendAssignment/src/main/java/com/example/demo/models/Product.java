package com.example.demo.models;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Table(name="product")
public class Product {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="category_id")
    private int category_id;
    @Column(name="price")
    private int price;
    @Column(name="product")
    private String product;
    public void setProduct(String product) {
        this.product = product;
    }
    public void setPrice(int setPrice) {
        this.price = price;
    }
    public void setCategoryId(int categoryId) {
        this.category_id = categoryId ;
    }
    public void setId(int id) {
        this.id = id;
    }
}

