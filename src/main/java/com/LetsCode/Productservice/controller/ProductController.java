package com.LetsCode.Productservice.controller;

import com.LetsCode.Productservice.Dto.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class ProductController {

    @GetMapping(path = "/products")
        public ResponseEntity<List<ProductDto>> getAllProductLIst(@PathVariable String Name){

        return null;
    }

    @DeleteMapping(path = "/products/products_id")
    public ResponseEntity<List<ProductDto>> deleteProductLIst(@PathVariable String productName){

        return null;
    }

    @PutMapping(path = "/products/products_id")
    public ResponseEntity<List<ProductDto>> putProductLIst(@PathVariable String productName){

        return null;
    }

    @PostMapping(path = "/products" )
    public ResponseEntity<List<ProductDto>> postProductLIst(@PathVariable String productName){

        return null;
    }
}
