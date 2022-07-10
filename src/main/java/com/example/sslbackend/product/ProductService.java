package com.example.sslbackend.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Product> allProduct () {
       return productRepository.findAll();
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
