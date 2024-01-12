package com.barang.etalase;

import com.barang.etalase.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product WHERE price > :minPrice", nativeQuery = true)
    List<Product> findByPriceGreaterThan(double minPrice);
}
