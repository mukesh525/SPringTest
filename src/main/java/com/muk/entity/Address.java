package com.muk.entity;

import javax.validation.constraints.NotNull;

public class Address {

    @NotNull(message = "State must not be null")
    private String state;
    @NotNull(message = "City must not be null")
    private String city;
    @NotNull(message = "Street must not be null")
    private String street;
    @NotNull(message = "pincodee must not be null")
    private int pincode;

    public String getState() {
        return state;
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
