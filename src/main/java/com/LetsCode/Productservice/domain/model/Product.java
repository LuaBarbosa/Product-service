package com.LetsCode.Productservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //representa entidade de banco de dados
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id //chave da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity categoryname;

    private int price;

    private String description;


  }
