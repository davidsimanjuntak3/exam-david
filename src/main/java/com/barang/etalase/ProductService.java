package com.barang.etalase;

import com.barang.etalase.Product;
import com.barang.etalase.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByPriceGreaterThan(double minPrice) {
        return productRepository.findByPriceGreaterThan(minPrice);
    }
}
