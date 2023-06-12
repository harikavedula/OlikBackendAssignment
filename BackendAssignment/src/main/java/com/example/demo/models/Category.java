package com.example.demo.models;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
@Data
@Entity
@Table(name="categories")
public class Category {
    @Id
    @Column(name="id")
    private int id;
    @Column(name = "category")
    private String category;
    public void setCategory(String category) {
        this.category = category;
    }
    public void setId(int id) {
        this.id = id;
    }
}
