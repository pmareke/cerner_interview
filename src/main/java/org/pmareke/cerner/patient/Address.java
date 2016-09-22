package org.pmareke.cerner.patient;

/**
 * Created by pmareke on 22/09/16.
 */
public class Address {
    private String country;
    private String state;
    private String address;
    private int number;

    public Address(String country, String state, String address, int number) {
        this.country = country;
        this.state = state;
        this.address = address;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
