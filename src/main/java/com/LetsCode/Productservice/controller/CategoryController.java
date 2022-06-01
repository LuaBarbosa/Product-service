package com.LetsCode.Productservice.controller;


import com.LetsCode.Productservice.Dto.CategoryDto;
import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.service.CategoryService;
import com.LetsCode.Productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Log4j2

public class CategoryController {
    private final CategoryService service;

    @GetMapping(path = "/category")
    public ResponseEntity<List<CategoryDto>> getAllCategoryList(){

        List<CategoryDto> categoryList = service.getAllCategoryList();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);

    }


    @DeleteMapping(path = "/category/{id}")
    public ResponseEntity<List<CategoryDto>> deleteCategoryLIst(@PathVariable(name = "id") long id){

        service.deleteCategory(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @PostMapping(path = "/category" )
    public ResponseEntity<List<CategoryDto>> postCategory(@RequestBody CategoryDto categoryDto){

        service.newCategory(categoryDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
