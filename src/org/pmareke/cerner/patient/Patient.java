package org.pmareke.cerner.patient;

import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Patient {
    private String name;
    private int age;
    private Address address;
    private List<Allergy> allergies;
    private List<Disease> diseases;

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.allergies = allergies;
        this.diseases = diseases;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}
