package com.hadsonpar.conexionpostgresql;

import com.hadsonpar.conexionpostgresql.business.IProductBusiness;
import com.hadsonpar.conexionpostgresql.entity.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConexionPostgresqlApplicationTests {


	//1. Aplicamos Autowired y referenciamos a nuestro IProductRepository
	@Autowired(required=true)
	private IProductBusiness productBusiness;
	@Test
	void contextLoads() {
	}

	//2. Creamos un metodo de tipo @Test y de nombre contextInsert
	@Test
	void testInsert() {
		//3. Invocar nuestro constructor
		Product product = new Product();

		//4. Asignamos valores...
		product.setDescription("Laptop HP");
		product.setPrice(3100);
		product.setStock(3);

		//5. Finalidad invocamos al método insertproduct
		productBusiness.insertproduct(product);
	}
}
