package com.jfreitas.challange_restaurant_marketplace.repositories;

import com.jfreitas.challange_restaurant_marketplace.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
