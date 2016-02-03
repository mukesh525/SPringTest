package com.muk.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
@Embeddable
@Table(name = "Address")
public class Address {


    @NotEmpty(message = "State must not be empty")
    private String state;
    @NotEmpty(message = "City must not be empty")
    private String city;
    @NotEmpty(message = "Street must not be empty")
    private String street;

    private int pincode;

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" + "state=" + state + ", city=" + city + ", street=" + street + ", pincode=" + pincode + '}';
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}
