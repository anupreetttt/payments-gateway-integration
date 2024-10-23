package com.anupreet.payment_gateway_online;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentGatewayOnlineApplication {

	private static final Logger log = LoggerFactory.getLogger(PaymentGatewayOnlineApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PaymentGatewayOnlineApplication.class, args);

		System.out.println("Application Running");

//		log.info();
	}

}
