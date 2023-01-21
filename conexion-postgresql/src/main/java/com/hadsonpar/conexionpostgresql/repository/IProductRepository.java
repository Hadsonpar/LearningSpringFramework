package com.hadsonpar.conexionpostgresql.repository;
import com.hadsonpar.conexionpostgresql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*Long: Representa el tipo de dato con relación al id de la entidad Product
ES DECIR ES EL SIGUIENTE CODIGO CON RELACION AL Id DE LA CLASE Product:
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long code;
*/
public interface IProductRepository extends JpaRepository<Product, Long> {

}