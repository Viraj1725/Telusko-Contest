package com.enterops.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//For Product request
	@GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
	
	@GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name){
		return service.getProduct("BlackBeast");
    }
	
	@GetMapping("/products/{place}")
	public List<Product> searchProductsByPlace(@PathVariable String place){
		return service.searchProductsByPlace("Shelf");
    }
	
	@GetMapping("/products/{warranty}")
	public List<Product> searchProductsOutOfWarranty(@PathVariable String warranty){
		return service.searchProductsOutOfWarranty(2022);
    }
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
	}

}
