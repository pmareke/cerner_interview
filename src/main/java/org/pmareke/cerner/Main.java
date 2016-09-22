package org.pmareke.cerner;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.sort.LastSeenComparator;
import org.pmareke.cerner.timezone.Baby;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /**
         * First exercise:
         *
         *  Develop an Allergy class which can hold different severities (LOW, MEDIUM or HIGH)
         *  and be tied to a Patient to retrieve the allergies associated
         *  with that person and their respective severities.
         */

        Allergy dust = new Allergy(
            "dust",
            Severity.HIGH
        );

        Allergy cat = new Allergy(
            "cat",
            Severity.LOW
        );

        List<Allergy> allergies = new ArrayList<Allergy>();
            allergies.add(dust);
            allergies.add(cat);

        Disease cancer = new Disease("cancer");

        List<Disease> diseases = new ArrayList<Disease>();

            diseases.add(cancer);

        Patient brad = new Patient(
            "Brad",
            41,
            new Address(
                "UK",
                "London",
                "Paddigton",
                1234567890
            ),
            allergies,
            diseases
        );

        System.out.println("********************");
        System.out.println("**** Exercise 1 ****");
        System.out.println("********************");
        System.out.println(brad.getFullAllergies());
        System.out.println(brad.getFullDiseases());

        /**
         * Second exercise:
         *
         *  Design a system for entering and displaying the allergies patients have with given fields!
         *
         *  Via Getters and Setters
         */

        allergies.add(
            new Allergy(
                "food",
                Severity.MEDIUM
            )
        );

        brad.setAllergies(allergies);

        System.out.println("********************");
        System.out.println("**** Exercise 2 ****");
        System.out.println("********************");
        System.out.println(brad.getFullAllergies());

        /**
         * Third exercise:
         *
         *  Given a list of streamed patients (consisting of names, birth, date last seen),
         *  return the 3 most recently seen patients from that list.
         *  Assume the list of incoming patients is not ordered in any particular order.
         */

        Patient tom = new Patient(
            "Tom",
            41,
            new Address(
                "UK",
                "London",
                "Paddigton",
                1234567890
            ),
            allergies,
            diseases,
            new ArrayList<Medication>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2016")
        );

        Patient henry = new Patient(
            "Henry",
            41,
            new Address(
                "UK",
                "London",
                "Paddigton",
                1234567890
            ),
            allergies,
            diseases,
            new ArrayList<Medication>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2011")
        );

        Patient susan = new Patient(
            "Susan",
            40,
            new Address(
                "UK",
                "London",
                "Yorkside",
                1234567890
            ),
            allergies,
            diseases,
            new ArrayList<Medication>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2007")
        );


        List<Patient> patients = new ArrayList<Patient>();
            brad.setLastSeen(new Date("12/01/2000"));
            patients.add(brad);
            patients.add(tom);
            patients.add(henry);
            patients.add(susan);

        System.out.println("********************");
        System.out.println("**** Exercise 3 ****");
        System.out.println("********************");

        Collections.sort(patients, new LastSeenComparator());

        System.out.println("Last seen patients:");
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("%s last visit: %s", patients.get(i).getName(),
                patients.get(i).getLastSeen()));
        }

        /**
         * Fourth exercise:
         *
         *  Person Demographic Problem to store information about every person.
         */

        Person John = new Person(
            "John",
            32,
            new Address("Spain",
                "Cataluña",
                "Barcelona",
                1234567890)
        );

        System.out.println("********************");
        System.out.println("**** Exercise 4 ****");
        System.out.println("********************");
        System.out.println(John.getName() + " lives in " + John.getFullAddress() + ".\n");

        /**
         * Fifth exercise:
         *
         *  To record a new born's birth date and time reflecting the time zone.
         */

        Baby carl = new Baby(
            "Carl",
            new Date("09/23/1983"),
            "Europe",
            "Madrid"
        );

        System.out.println("********************");
        System.out.println("**** Exercise 5 ****");
        System.out.println("********************");
        System.out.println( String.format("%s was born in %s at %s, %s.",
            carl.getName(), carl.getBirth(), carl.getCity(), carl.getContinent())
        );

        System.out.println( String.format("But the date of birth of %s was %s in New York, America.\n",
            carl.getName(), carl.getBirthInOtherTimeZone("America", "New York"))
        );


        /**
         * Sixth exercise:
         *
         *  Design a class where a nurse had to assign medication to a patient
         *  along with the start and the end dates ( there may or may not be end date).
         */

        Medication aspirine = new Medication(
            "Aspirine",
            new Date("01/01/2016")
        );

        List<Medication> medications = new ArrayList<Medication>();
            medications.add(aspirine);

        brad.setMedications(medications);

        System.out.println("********************");
        System.out.println("**** Exercise 6 ****");
        System.out.println("********************");
        System.out.println(brad.getFullMedicines() );

        /**
         * Seventh exercise:
         *
         *  Implementing a system that notifies nurse when a patient should receive medications.
         */

        System.out.println("********************");
        System.out.println("**** Exercise 7 ****");
        System.out.println("********************");
        for (Patient patient : patients) {
            if (patient.hasMedicines()){
                System.out.println(patient.getFullMedicines());
            } else{
                System.out.println(String.format("%s has not medicines.\n",  patient.getName()));
            }
        }

        /**
         * Eighth exercise:
         *
         *  Temperature class to know whether patient has fever or not
         *  and in what location is the reading taken such as mouth, armpit, ear.
         */
        brad.setTemperature(
            new Temperature(
                40,
                Location.Ear
            )
        );

        System.out.println("********************");
        System.out.println("**** Exercise 8 ****");
        System.out.println("********************");
        System.out.println(
            String.format( ( brad.hasFever() ) ? "%s has fever and it was took in the %s.\n" :"%s is fine.\n",
                brad.getName(), brad.getTemperature().getLocation() ) );

        /**
         * Ninth exercise:
         *
         *  Temperature :
         *   0. Default  temperatures: 0ºC => Via constructor in Temperature
       	 *   1. Convert Celsius to Fahrenheit.
       	 *   2. Convert Fahrenheit to Celsius.
       	 *   3. Update default temperature. => Via Setter in Temperature
         */

        System.out.println("********************");
        System.out.println("**** Exercise 9 ****");
        System.out.println("********************");
        System.out.println(String.format("%s has %sº in Fahrenheit scale and %sº in Celsius scale.\n",
            brad.getName(),
            brad.getTemperature().getTemperatureInFahrenheit(),
            brad.getTemperature().getTemperature()));
    }
}
