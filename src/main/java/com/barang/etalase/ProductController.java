package com.barang.etalase;

import com.barang.etalase.Product;
import com.barang.etalase.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/byPrice")
    public List<Product> getProductsByPriceGreaterThan(@RequestParam double minPrice) {
        return productService.getProductsByPriceGreaterThan(minPrice);
    }
}