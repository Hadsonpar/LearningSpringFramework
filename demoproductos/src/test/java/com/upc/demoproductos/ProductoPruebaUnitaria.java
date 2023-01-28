package com.upc.demoproductos;

import com.upc.demoproductos.entidades.Producto;
import com.upc.demoproductos.negocio.IProductoNegocio;
import com.upc.demoproductos.repositorio.IProductoRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductoPruebaUnitaria {
    @Autowired
    private IProductoNegocio productoNegocio;
    @MockBean
    private IProductoRepositorio productoRepositorio;

    @Test
    void testcalcularPrecioVenta(){
        Producto producto = new Producto(1L, "Pepsi", 3, 50);
        when(productoRepositorio.findById(1L)).thenReturn(Optional.of(producto));
        try {
            Assertions.assertEquals(3.24, productoNegocio.calcularPrecioVenta(1L), 0.01);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
