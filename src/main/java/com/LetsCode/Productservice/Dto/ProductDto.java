package com.LetsCode.Productservice.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private Long id;
    private String Name;
    private String Description;
    private int Price;


}
