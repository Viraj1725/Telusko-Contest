package com.enterops.ProductSpringWeb;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
    @Autowired
    ProductDB db;	
    //ProductDB db = new ProductDB();
    
    public void addProduct(Product p){
       // products.add(p);
    	db.save(p);
    }
    
    public Product getProduct(String name){
        return db.findByName(name);
    }
    
    List<Product> products = new ArrayList<>();
    
    public List<Product> getAllProducts(){
        return db.findAll();
    }
    
    public List<Product> searchProductsByPlace(String place){
        return db.findByPlace(place);
    }
    
//    public List<Product> getProductsByText(String text)
//    {
//        return db.getAll(text,text,text);
//    }
     
//    public List<Product> searchProductsByPlace(String place){
//    	String str = place.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//        List<Product> products = db.findAll();
//           
//        for(Product p: products){
//        	String searchplace = p.getPlace().toLowerCase();
//        	if(searchplace.contains(str)){
//                prods.add(p);
//            }
//        }
//        return prods;
//    }
    
    int year;
	public List<Product> searchProductsOutOfWarranty(int year){
		List<Product> prods = new ArrayList<>();
		List<Product> products = db.findAll();

		for(Product p:products) {
			Integer searchwarranty = p.getWarranty();
			this.year = year;
			if(searchwarranty < year) {
				prods.add(p);
			}
		}
		return prods;
	}
 }
