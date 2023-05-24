package com.enterops.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);
	
	//List<Product> getAll(String name, String type, String place);
	
	List<Product> findByPlace(String place);
	
	List<Product> findByProductOutOfwarranty(String place);
}
