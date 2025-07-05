package com.jfreitas.challange_restaurant_marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ChallangeRestaurantMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallangeRestaurantMarketplaceApplication.class, args);
	}

}
