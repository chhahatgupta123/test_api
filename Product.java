package com.Springtest.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //// For generating getter and setter.
@AllArgsConstructor  //// For parameterize constructor
@NoArgsConstructor   ///// For zero parameterize constructor.
public class Product {

    private Integer Id;

    private String ProductName;

    private Float Price;
}
