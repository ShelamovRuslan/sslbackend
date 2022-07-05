package com.example.sslbackend.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/add")
    public ResponseEntity<Product> addEmployee (@RequestBody Product product){
        Product newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
