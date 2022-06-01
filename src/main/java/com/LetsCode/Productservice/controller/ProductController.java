package com.LetsCode.Productservice.controller;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.exception.CategoryNotFoundException;
import com.LetsCode.Productservice.exception.ProducNotFoundException;
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

    @GetMapping(path = "/products/{categoryname}")
    public ResponseEntity<List<ProductDto>> getProductByCategory(@PathVariable(name = "categoryname") final String categoryname)
                throws CategoryNotFoundException {

            List<ProductDto> productListByCategory = service.getProductByCategory(categoryname);
            return ResponseEntity.ok(productListByCategory);
    }

    @DeleteMapping(path = "/products/{id}")
    public ResponseEntity<List<ProductDto>> deleteProductLIst(@PathVariable(name = "id") long id)
            throws ProducNotFoundException {

        service.deleteProductLIst(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(path = "/products")
    public ResponseEntity<List<ProductDto>> updateProductLIst(@RequestBody ProductDto productDto){

        service.updateProductList(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(path = "/products" )
    public ResponseEntity<Void> newProduct(@RequestBody final ProductDto productDto) throws CategoryNotFoundException{

       service.newProduct(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
