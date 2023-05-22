package com.enterops.ebiz.draft.product.TenDayChallenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
    @Autowired
    ProductDB db;	

    //ProductDB db = new ProductDB();

//    public void addProduct(Product p){
//       // products.add(p);
//    	db.save(p);
//    }
//    public List<Product> getAllProducts(){
//        return db.getAll();
//    }
//    public Product getProduct(String name){
//        for(Product p : products){
//            if(p.getName().equals(name))
//                return p;
//        }
//        return null;
//    }
    public List<Product> getAllProducts(){
        return db.findAll();
    }
    
    public List<Product> getProducts(String string){
        return db.findByName(string);
    }
           
}
