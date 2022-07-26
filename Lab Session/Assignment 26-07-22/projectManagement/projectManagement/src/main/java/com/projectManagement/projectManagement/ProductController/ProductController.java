package com.projectManagement.projectManagement.ProductController;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.projectManagement.projectManagement.ProductService.ProductService;
import com.projectManagement.projectManagement.model.Product;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
 // RESTful API methods for Retrieval operations
    @GetMapping("/products")
public List<Product> list() {
    return service.listAll();
}
}
