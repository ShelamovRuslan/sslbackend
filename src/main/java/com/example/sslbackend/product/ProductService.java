package com.example.sslbackend.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

}
