package com.LetsCode.Productservice.service.Impl;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.domain.model.Product;
import com.LetsCode.Productservice.domain.repository.ProductRepository;
import com.LetsCode.Productservice.service.CategoryService;
import com.LetsCode.Productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl  implements ProductService {


    final ProductRepository repository;
    private final CategoryService categoryService;

    @Override
    public List<ProductDto> getAllProductList() {
       return repository.findAll()
                .stream()
                .map(product -> new ProductDto(product.getId(), product.getName(),product.getPrice(), product.getDescription()))
                .collect(Collectors.toList());
    }


    @Override
    public List<ProductDto> getProductByCategory(String categoryname){
        categoryService.findCategoryByName(categoryname); //crio um metodo em categoria para usar aqui.

        //localiza categoria - repositorio de categoria
        //retornar mensagem de erro se não localizar categoria
        //retornar produtos da categoria
        //converter dto

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
       Product productEntity;
       productEntity = new Product(productDto.getId(), productDto.getName(), productDto.getPrice(), productDto.getDescription());
       repository.save(productEntity);
    }

}
