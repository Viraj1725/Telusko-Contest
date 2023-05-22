package com.enterops.ebiz.draft.product.TenDayChallenge;

import java.util.List;
import java.util.ArrayList;
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
    List<Product> products = new ArrayList<>();
    
    public List<Product> getAllProducts(){
        return db.findAll();
    }
    
    public List<Product> searchProductsByPlace(String place){
    	String str = place.toLowerCase();
        List<Product> prods = new ArrayList<>();
        List<Product> products = db.findAll();
           
        for(Product p: products){
        	String searchplace = p.getPlace().toLowerCase();
        	if(searchplace.contains(str)){
                prods.add(p);
            }
        }
        return prods;
    }
    
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
