package com.example.productservice.service;

import com.example.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService(){
        //Mockando os dados
        products.add(new Product(1L, "Produto A", 10.0));
        products.add(new Product(2L, "Produto B", 20.0));
        products.add(new Product(3L, "Produto C", 30.0));
    }

    public Product getProduct(Long id){
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Product> getAllProducts(){
        return products;
    }
}
