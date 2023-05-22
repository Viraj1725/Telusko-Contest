package com.enterops.ebiz.draft.product.TenDayChallenge;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class TenDayChallengeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TenDayChallengeApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
		//service.show();
		
	      List<Product> prods = service.getAllProducts();
	      for(Product p : prods){
	          System.out.println(p);
	      }
		
	}

}
