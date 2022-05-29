package com.LetsCode.Productservice.service.Impl;

import com.LetsCode.Productservice.Dto.CategoryDto;
import com.LetsCode.Productservice.domain.repository.CategoryRepository;
import com.LetsCode.Productservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl  implements CategoryService {

    final CategoryRepository repository;

    @Override
    public List<CategoryDto> getAllCategoryList() {
        return null;
    }

    @Override
    public void deleteCategoryLIst(long categoryId) {
    }

    @Override
    public void updateCategoryLIst(CategoryDto categoryDto) {
    }

    @Override
    public void newCategory(CategoryDto categoryDto) {
    }
}
