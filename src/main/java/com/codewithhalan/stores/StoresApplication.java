package com.codewithhalan.stores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoresApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StoresApplication.class, args);
		var orderService= new  OrderService(new StripePaymentService());
		 orderService.placeOrder();
	}

}
