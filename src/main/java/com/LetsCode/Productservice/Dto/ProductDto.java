package com.LetsCode.Productservice.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDto {

    private Long id;

    private String name;

    private String categoryname;

    private int price;

    private String description;



}
