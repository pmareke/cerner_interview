package org.pmareke.cerner.patient;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;

import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Patient extends Person {

    private List<Allergy> allergies;
    private List<Disease> diseases;
    private List<Medication> medications;
    private Temperature temperature;

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases, List<Medication> medications) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases, List<Medication> medications, Temperature temperature) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.temperature = temperature;
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

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public boolean hasFever(){
        if (temperature.getTemperature() > 39) {
            return true;
        }else {
            return false;
        }
    }
}
