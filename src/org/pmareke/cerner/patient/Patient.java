package org.pmareke.cerner.patient;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;

import java.util.Date;
import java.util.List;

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

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases, List<Medication> medications) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.lastSeen = new Date();
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases, List<Medication> medications, Temperature temperature) {
        super(name, age, address);
        this.allergies = allergies;
        this.diseases = diseases;
        this.medications = medications;
        this.temperature = temperature;
        this.lastSeen = new Date();
    }

    public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases, List<Medication> medications, Temperature temperature, Date lastSeen) {
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

    public boolean hasFever(){
        return (temperature.getTemperature() > 39) ? true : false;
    }

    public String getFullAllergies(){
        String fullAllergies = String.format("%s has the next allergies: \n", this.getName());

        for (int i = 0; i < this.getAllergies().size(); i++) {
                    fullAllergies += String.format("%s with a %s severity.",
                            this.getAllergies().get(i).getName(),
                            this.getAllergies().get(i).getSeverity()
                    );
                    fullAllergies += "\n";
        }

        return fullAllergies;
    }

    public String getFullDiseases(){
        String fullDiseases = String.format("%s has the next diseases: \n", this.getName());

        for (int i = 0; i < this.getDiseases().size(); i++) {
            fullDiseases += String.format("%s disease.",
                this.getDiseases().get(i).getName()
            );
            fullDiseases += "\n";
        }

        return fullDiseases;
    }

    public String getFullMedicines(){
        String medicines = String.format("%s has the next medicines: ", this.getName());

        for (int i = 0; i < this.getMedications().size(); i++) {
            final String medicine;
            if (this.getMedications().get(i).getEnd() != null) {
                medicine = String.format("%s from %s to %s.",
                        this.getMedications().get(i).getName(),
                        this.getMedications().get(i).getStart(),
                        this.getMedications().get(i).getEnd()
                );
            } else {
                medicine = String.format("%s since %s.",
                        this.getMedications().get(i).getName(),
                        this.getMedications().get(i).getStart()
                );
            }
            medicines += medicine + "\n";
        }

        return medicines;
    }

    public boolean hasMedicines(){
        return ( this.getMedications().size() > 0 ) ? true : false ;
    }
}
