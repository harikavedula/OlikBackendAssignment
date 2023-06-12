package com.example.demo.Service;

import com.example.demo.Repo.RentalRepo;
import com.example.demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class RentalService {
    @Autowired
    private RentalRepo rentalRepo;
    public RentalService(RentalRepo rentalRepo) {
        this.rentalRepo = rentalRepo;
    }
    public List<Category> getAllProducts() {
        return rentalRepo.findAll();
    }
    public List<Category> getAllCategories() {
        return rentalRepo.findAll();
    }
}
