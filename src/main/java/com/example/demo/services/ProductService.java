package com.example.demo.services;

import com.example.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    private Long id = 0l;

    {
        products.add(new Product(++id,"iphone 16", "Телефон новый",100000, "Moscov", "Tom"));
        products.add(new Product(++id,"iphone 14", "Телефон почти новый",80000, "Moscov", "Luk"));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void saveProducts(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void delProducts(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public Product getProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id) ).findFirst().orElse(null);
    }
}
