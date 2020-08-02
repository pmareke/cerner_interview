package org.pmareke.cerner.patient;

import static java.util.stream.Collectors.joining;

import java.util.Date;
import java.util.List;
import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;

/**
 * Created by pmareke on 22/09/16.
 */
public class Patient extends Person {

    private List<Allergy> allergies;
    private List<Disease> diseases;
    private List<Medication> medications;
    private Temperature temperature;
    private Date lastSeen;

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.lastSeen = new Date();
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases,
        List<Medication> medications) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.lastSeen = new Date();
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases,
        List<Medication> medications, Temperature temperature) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.temperature = temperature;
        this.lastSeen = new Date();
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases,
        List<Medication> medications, Temperature temperature, Date lastSeen) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.temperature = temperature;
        this.lastSeen = lastSeen;
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

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public boolean hasFever() {
        return temperature.getTemperature() > 39;
    }

    public String getFullAllergies() {
        return this.getAllergies()
            .stream()
            .map(allergy -> String.format("%s with a %s severity.", allergy.getName(), allergy.getSeverity()))
            .collect(joining("\n"));
    }

    public String getFullDiseases() {
        return this.getDiseases()
            .stream()
            .map(disease -> String.format("%s disease.", disease.getName()))
            .collect(joining("\n"));
    }

    public String getFullMedicines() {
        return this.getMedications()
            .stream()
            .map(medication -> medication.getEnd() != null
                ? String.format("%s from %s to %s.", medication.getName(), medication.getStart(), medication.getEnd())
                : String.format("%s since %s.", medication.getName(), medication.getStart()))
            .collect(joining("\n"));
    }

    public boolean hasMedicines() {
        return !this.getMedications().isEmpty();
    }
}
