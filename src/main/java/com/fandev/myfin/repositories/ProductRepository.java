package com.fandev.myfin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.myfin.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
