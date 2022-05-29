package com.LetsCode.Productservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

        //um produto esta em uma unica categoria e na categoria podem ter vários produtos
      //  @ManyToOne(fetch = FetchType.LAZY) //quando buscar categoria vai listar todos os produtos da categoria
       // private CategoryEntity category;

}
