package com.LetsCode.Productservice.service;

import com.LetsCode.Productservice.Dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    default List<CategoryDto> getAllCategoryList() {
        return null;
    }

    void deleteCategoryLIst(long categoryId);

   void updateCategoryLIst(CategoryDto categoryDto);

   void newCategory(CategoryDto categoryDto);
}
