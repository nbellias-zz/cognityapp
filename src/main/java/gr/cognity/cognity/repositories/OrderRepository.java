/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.repositories;

import gr.cognity.cognity.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nmpellias
 */
public interface OrderRepository extends MongoRepository<Order, String> {
    
}



