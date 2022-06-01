package com.LetsCode.Productservice.service;

import com.LetsCode.Productservice.Dto.CategoryDto;
import com.LetsCode.Productservice.domain.model.CategoryEntity;
import com.LetsCode.Productservice.exception.CategoryNotFoundException;

import java.util.List;

public interface CategoryService {

    default List<CategoryDto> getAllCategoryList() {
        return null;
    }

   void newCategory(CategoryDto categoryDto);

    CategoryEntity findByCategoryname(String categoryname) throws CategoryNotFoundException;

    void deleteCategory(long id);
}
