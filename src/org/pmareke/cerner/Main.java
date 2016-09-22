package org.pmareke.cerner;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.timezone.Baby;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

            System.out.println( String.format("%s has the next allergies: ", brad.getName()));

            for (int i = 0; i < brad.getAllergies().size(); i++) {
                System.out.println(
                        String.format("%s with a %s severity",
                                brad.getAllergies().get(i).getName(),
                                brad.getAllergies().get(i).getSeverity()
                        )
                );
            }

        /**
         * Second exercise:
         *
         *  Design a system for entering and displaying the allergies patients have with given fields!
         */

        /**
         * Third exercise:
         *
         *  Given a list of streamed patients (consisting of names, birth, date last seen),
         *  return the 3 most recently seen patients from that list.
         *  Assume the list of incoming patients is not ordered in any particular order.
         */

        /**
         * Fourth exercise:
         *
         *  Person Demographic Problem to store information about every person.
         */

        Person Jhon = new Person(
                "Jhon",
                32,
                new Address("Spain",
                "Cataluña",
                "Barcelona",
                1234567890)
        );

        System.out.println(Jhon.getName() + " lives in " + Jhon.getFullAddress());

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

        System.out.println( String.format("%s was born in %s at %s, %s",
                                            carl.getName(), carl.getBirth(), carl.getCity(), carl.getContinent())
        );

        System.out.println( String.format("But the date of birth of %s was %s in New York, America",
                                            carl.getName(), carl.getBirthInOtherTimeZone("America", "New York"))
        );

        /**
         * Sixth exercise:
         *
         *  Implementing a system that notifies nurse when a patient should receive medications.
         */

        /**
         * Seventh exercise:
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

        System.out.println( String.format("%s has the next medicines: ", brad.getName()));

        for (int i = 0; i < brad.getMedications().size(); i++) {
             final String medicine;
                if (brad.getMedications().get(i).getEnd() != null) {
                    medicine = String.format("%s from %s to %s",
                            brad.getMedications().get(i).getName(),
                            brad.getMedications().get(i).getStart(),
                            brad.getMedications().get(i).getEnd()
                    );
                } else {
                    medicine = String.format("%s since %s",
                        brad.getMedications().get(i).getName(),
                        brad.getMedications().get(i).getStart()
                    );
                }
            System.out.println(medicine);
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

        System.out.println( String.format( ( brad.hasFever() ) ? "%s has fever" :"%s is fine", brad.getName() ) );

        /**
         * Ninth exercise:
         *
         *  Temperature :
         *   0. Default  temperatures: 0.0º or 32.0F
       	 *   1. Convert Celsius to Fahrenheit.
       	 *   2. Convert Fahrenheit to Celsius.
       	 *   3. Update default temperature.
         */

    }
}
