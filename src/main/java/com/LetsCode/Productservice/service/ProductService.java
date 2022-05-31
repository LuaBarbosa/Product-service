package com.LetsCode.Productservice.service;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.domain.model.Product;
import com.LetsCode.Productservice.exception.CategoryNotFoundException;
import com.LetsCode.Productservice.exception.ProducNotFoundException;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProductByCategory(String categoryname) throws CategoryNotFoundException;

    void deleteProductLIst(long productId) throws ProducNotFoundException;

    void updateProductList(ProductDto productDto);

    void newProduct(ProductDto productDto) throws CategoryNotFoundException;

   }
