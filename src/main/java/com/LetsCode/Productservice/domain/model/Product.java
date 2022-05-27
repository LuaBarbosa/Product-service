package com.LetsCode.Productservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //representa entidade de banco de dados
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id //chave da tabela
    @GeneratedValue //preenche automatico
    private Long id;

    private String name;

    private float price;

    private String description;


}
