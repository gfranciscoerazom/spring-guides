package com.example.accessingdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AccessingDataRestApplication {

	public static void main(String[] args) {
		System.out.println(" === He, init sample proxy pattern ===");
		ProductDao productDao = new ProductDaoImpl();

		System.out.println(" 1) Without proxy sample ");
		Product p1 = productDao.findById(10L);
		productDao.save(p1);

		System.out.println(" 2) With proxy sample ");
		ProductDaoProxy productDaoProxy = new ProductDaoProxy(productDao);
		Product p2 = productDaoProxy.findById(10L);
		productDaoProxy.save(p2);
		SpringApplication.run(AccessingDataRestApplication.class, args);
	}

}
