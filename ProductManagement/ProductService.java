package com.enterops.ebiz.draft.product;
//Day 2 (21/5/2023)
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductService {

    List<Product> products = new ArrayList<>(); //Interface-List , Class-ArrayList

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

	public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;
    }
    
    public List<Product> searchProductByPlace(String place){
    	String str = place.toLowerCase();
        List<Product> prods = new ArrayList<>();
           
        for(Product p: products){
        	String searchplace = p.getPlace().toLowerCase();
        	if(searchplace.contains(str)){
                prods.add(p);
            }
        }
        return prods;
    }
    
    int year;   
    public List<Product> searchProductByOutOfWarrenty(int year){
        List<Product> prods = new ArrayList<>();
           
        for(Product p: products){
        	Integer searchwarranty = p.getWarranty();
        	this.year = year;
        	if(searchwarranty < year){
                prods.add(p);
            }   
        }
        return prods;
    }
    
    public Stream<Product> searchProductByOutOfWarrentyStream(){
        return products.stream().filter(product -> product.getWarranty() < year);
    }
    
    public Stream<Product> searchProductByPlaceStream(String place){
        return products.stream().filter(product -> product.getPlace().contains(place));
    }
            
}
