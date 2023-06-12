package com.example.demo.controllers;
import com.example.demo.Repo.RentalRepo;
import com.example.demo.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import  com.example.demo.models.Product;
import  com.example.demo.models.Category;

import java.util.List;

@Controller
public class IndexController {
    private final RentalService rentalService;

    @Autowired
    public IndexController(RentalService rentalService) {
        super();
        this.rentalService = rentalService;
    }

    @GetMapping("/")
        public String index(@ModelAttribute Category category,Model model) {
        List<Category> categories = rentalService.getAllCategories();
            model.addAttribute("category",categories);
            System.out.println(category.getCategory());
            return "index.html";
        }

        @PostMapping("/submit")
        public String listProducts(@ModelAttribute Product product, Model model) {
            // validate
            List<Category> products = rentalService.getAllProducts();
            model.addAttribute("products",products);
            return "welcome.html";
        }
}
