package com.LetsCode.Productservice.domain.repository;

import com.LetsCode.Productservice.domain.model.CategoryEntity;
import com.LetsCode.Productservice.domain.model.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryname(CategoryEntity categoryname);

}
