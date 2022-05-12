package com.LetsCode.Productservice.controller;

import com.LetsCode.Productservice.Dto.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProductLIst(@PathVariable(name = "products") String productName){

    }

    public ResponseEntity<List<ProductDto>> deleteProductLIst(@PathVariable String productName){

    }

    public ResponseEntity<List<ProductDto>> putProductLIst(@PathVariable String productName){

    }

    public ResponseEntity<List<ProductDto>> postProductLIst(@PathVariable String productName){

    }
}
