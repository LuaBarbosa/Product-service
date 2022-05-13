package com.LetsCode.Productservice.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private Long productId;
    private String name;
    private String description;
    private int price;


}
