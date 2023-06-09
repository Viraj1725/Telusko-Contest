package com.enterops.ebiz.draft.product;
//Day 2 (21/5/2023)
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
          
//        System.out.println("==============================================");
//
//        List<Product> prods = service.getProductWithText("black");
//        for(Product product : prods){
//            System.out.println(product);
//        }
        
        System.out.println("=================Search Product by Place==============");
        System.out.println("\n");
        List<Product> place = service.searchProductByPlace("Shelf");
        for(Product product : place){
            System.out.println(product);
        }
        System.out.println("\n");
        
        System.out.println("==================Search Product by Out Of Warrenty=================");
        System.out.println("\n");
        List<Product> warrenty = service.searchProductByOutOfWarrenty(2022);
        for(Product product : warrenty){
            System.out.println(product);
        }
        System.out.println("\n");
        
    }
}
