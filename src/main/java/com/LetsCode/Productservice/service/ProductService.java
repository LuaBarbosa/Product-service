package com.LetsCode.Productservice.service;

import com.LetsCode.Productservice.Dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProductList();


    List<ProductDto> getProductByCategory(String categoryname);

    void deleteProductLIst(long productId);

    void updateProductList(ProductDto productDto);

        void newProduct(ProductDto productDto);
}
