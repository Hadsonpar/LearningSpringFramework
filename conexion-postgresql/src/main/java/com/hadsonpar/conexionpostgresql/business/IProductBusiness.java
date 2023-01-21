package com.hadsonpar.conexionpostgresql.business;

import com.hadsonpar.conexionpostgresql.entity.Product;

public interface IProductBusiness {
    public Product insertproduct(Product product);
}