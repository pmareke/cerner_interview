package org.pmareke.cerner.patient;

import org.pmareke.cerner.demographic.Person;

import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Patient extends Person {

    private List<Allergy> allergies;
    private List<Disease> diseases;

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
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
