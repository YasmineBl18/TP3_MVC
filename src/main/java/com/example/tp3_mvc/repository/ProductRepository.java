package com.example.tp3_mvc.repository;

import com.example.tp3_mvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product ,Long > {
}


