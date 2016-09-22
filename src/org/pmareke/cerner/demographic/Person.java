package org.pmareke.cerner.demographic;

import org.pmareke.cerner.patient.Address;

/**
 * Created by pmareke on 22/09/16.
 */
public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public String getFullAddress() {
        return address.getCountry() + ", " + address.getState() + " - " +
                address.getAddress() + " and the phone number is " + address.getNumber();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
