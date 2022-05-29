package com.LetsCode.Productservice.controller;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping(path = "/products")
        public ResponseEntity<List<ProductDto>> getAllProductLIst(){

        List<ProductDto> productList = service.getAllProductList();
        return new ResponseEntity<>(productList, HttpStatus.OK);

    }

    @GetMapping(path = "/products/{categoryname}")
    public List<ProductDto> getProductFromCategory(@PathVariable(name = "categoryname") String categoryname){

        return null;
    }

    @DeleteMapping(path = "/products/{products_id}")
    public ResponseEntity<List<ProductDto>> deleteProductLIst(@PathVariable(name = "productId") long productId){

        service.deleteProductLIst(productId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/products")
    public ResponseEntity<List<ProductDto>> updateProductLIst(@RequestBody ProductDto productDto){

        service.updateProductList(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(path = "/newproducts" )
    public ResponseEntity<Void> newProduct(@RequestBody ProductDto productDto){

        service.newProduct(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
