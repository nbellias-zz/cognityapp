/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nmpellias
 */
@Document(collection = "products")
public class Product {
    @Id
    private String _id;
    private String description;
    private String SKU;
    private String details;
    private Float price;

    public Product() {
    }

    public Product(String _id, String description, String SKU, String details, Float price) {
        this._id = _id;
        this.description = description;
        this.SKU = SKU;
        this.details = details;
        this.price = price;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "_id=" + _id + ", description=" + description + ", SKU=" + SKU + ", details=" + details + ", price=" + price + '}';
    }
    
    
}


