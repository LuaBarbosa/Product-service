package com.LetsCode.Productservice.service.Impl;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl  implements ProductService {

    @Override
    public List<ProductDto> getAllProductList() {
        return null;
    }
    @Override
    public void deleteProductLIst(long productId) {

    }
    @Override
    public void updateProductList(ProductDto productDto) {

    }

    @Override
    public void newProduct(ProductDto productDto) {

    }

}
