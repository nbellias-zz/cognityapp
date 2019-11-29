/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nmpellias
 */
@Document(collection = "orders")
public class Order {
    @Id
    private String _id;
    private String dateOfCreation;
    private Customer customer;
    private List<Product> productItems;

    public Order() {
    }

    public Order(String _id, String dateOfCreation, Customer customer, List<Product> productItems) {
        this._id = _id;
        this.dateOfCreation = dateOfCreation;
        this.customer = customer;
        this.productItems = productItems;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductItems() {
        return productItems;
    }

    public void setProductItems(List<Product> productItems) {
        this.productItems = productItems;
    }

    @Override
    public String toString() {
        return "Order{" + "_id=" + _id + ", dateOfCreation=" + dateOfCreation + ", customer=" + customer + ", productItems=" + productItems + '}';
    }
    
}




