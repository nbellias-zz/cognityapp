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
@Document(collection = "customers")
public class Customer {
    @Id
    private String _id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String passWord;
    private String address;
    private String zip;
    private String city;
    private String country;
    private String photo;
    private String dateOfRegistration;

    public Customer() {
    }

    public Customer(String _id, String firstName, String lastName, String email, String userName, String passWord, String address, String zip, String city, String country, String photo, String dateOfRegistration) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.photo = photo;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public String toString() {
        return "Customer{" + "_id=" + _id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userName=" + userName + ", passWord=" + passWord + ", address=" + address + ", zip=" + zip + ", city=" + city + ", country=" + country + ", photo=" + photo + ", dateOfRegistration=" + dateOfRegistration + '}';
    }

}




