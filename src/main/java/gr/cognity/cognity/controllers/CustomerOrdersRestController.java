/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.controllers;

import gr.cognity.cognity.eventhub.KafkaConsumer;
import gr.cognity.cognity.eventhub.KafkaProducer;
import gr.cognity.cognity.models.Customer;
import gr.cognity.cognity.repositories.CustomerRepository;
import gr.cognity.cognity.repositories.OrderRepository;
import gr.cognity.cognity.repositories.ProductRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author nmpellias
 */
@RestController
@RequestMapping("/")
public class CustomerOrdersRestController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private KafkaConsumer kafkaConsumer;
    
    @GetMapping("/customers")
    public List<Customer> list() {
        kafkaProducer.sendMessage("User sees customers");
        
        return customerRepository.findAll();
    }
    
    @GetMapping("/customers/{id}")
    public Optional<Customer> get(@PathVariable String id) {
        return customerRepository.findById(id);
    }
    
    @PutMapping("/customers/{id}")
    public Customer put(@PathVariable String id, @RequestBody Customer customer) {
        Optional<Customer> cust = customerRepository.findById(id);
        if(cust.isPresent())
            return customerRepository.save(customer);
        else
            return null;
    }
    
    @PostMapping("/customers")
    public Customer post(@RequestBody Customer customer) {
        return customerRepository.insert(customer);
    }
    
    @DeleteMapping("/customers/{id}")
    public Customer delete(@PathVariable String id) {
        Optional<Customer> cust = customerRepository.findById(id);
        if(cust.isPresent()){
            customerRepository.deleteById(id);
            return cust.get();
        }
        else
            return null;
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
    }
    
}




