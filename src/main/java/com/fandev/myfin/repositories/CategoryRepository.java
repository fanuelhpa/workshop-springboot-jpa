package com.fandev.myfin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.myfin.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
