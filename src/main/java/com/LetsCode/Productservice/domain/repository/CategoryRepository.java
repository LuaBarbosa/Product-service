package com.LetsCode.Productservice.domain.repository;

import com.LetsCode.Productservice.domain.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {

    Optional<CategoryEntity> findByCategoryname(String categoryname);

}
