package com.hadsonpar.conexionpostgresql.business;

import com.hadsonpar.conexionpostgresql.entity.Product;
import com.hadsonpar.conexionpostgresql.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductBusiness implements IProductBusiness {
    @Autowired
    //Referenciamos a nuestro IProductRepository
    IProductRepository iProductRepository;
    @Override
    public Product insertproduct(Product product) {
        //Save se encarga de registra los datos.
        return iProductRepository.save(product);
    }
}
