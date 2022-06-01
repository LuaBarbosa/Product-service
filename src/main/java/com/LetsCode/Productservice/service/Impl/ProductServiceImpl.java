package com.LetsCode.Productservice.service.Impl;

import com.LetsCode.Productservice.Dto.ProductDto;
import com.LetsCode.Productservice.domain.model.CategoryEntity;
import com.LetsCode.Productservice.domain.model.Product;
import com.LetsCode.Productservice.domain.repository.ProductRepository;
import com.LetsCode.Productservice.exception.CategoryNotFoundException;
import com.LetsCode.Productservice.exception.ProducNotFoundException;
import com.LetsCode.Productservice.service.CategoryService;
import com.LetsCode.Productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
@Log4j2
public class ProductServiceImpl  implements ProductService {


    private final ProductRepository repository;
    private final CategoryService categoryService;

     @Override
    public List<ProductDto> getProductByCategory(String categoryname) throws CategoryNotFoundException {
           final CategoryEntity categoryEntity = categoryService.findByCategoryname(categoryname);
           return repository
               .findByCategoryname(categoryEntity)
               .stream()
               .map(product -> new ProductDto(product.getId(), product.getName(), categoryEntity.getCategoryname(),
                       product.getPrice(), product.getDescription()))
               .collect(Collectors.toList());
      }

    @Override
    public void deleteProductLIst(long productId) throws ProducNotFoundException {
            try {
             Product product = findProductById(productId);
             repository.delete(product);
         }
         catch (ProducNotFoundException e){
             log.error("Produto não encontrado: " + productId);
             log.error(e.getMessage());
             throw e;
         }
    }

    private Product findProductById(long id) throws ProducNotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new ProducNotFoundException("Produto não encontrado"));
     }


    @Override
    public void updateProductList(ProductDto productDto) {
        final CategoryEntity categoryEntity = categoryService.findByCategoryname(productDto.getCategoryname());
        final Product product = Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .categoryname(categoryEntity)
                .price(productDto.getPrice())
                .description(productDto.getDescription())
                .build();
        repository.save(product);
    }


    @Override
    public void newProduct(final ProductDto productDto) throws CategoryNotFoundException {
        final CategoryEntity categoryEntity = categoryService.findByCategoryname(productDto.getCategoryname());
       final Product product = Product.builder()
               .name(productDto.getName())
               .categoryname(categoryEntity)
                .price(productDto.getPrice())
                .description(productDto.getDescription())
                .build();
        repository.save(product);
    }

}
