package org.pmareke.cerner;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.patient.*;
import java.util.ArrayList;
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
                    "Bard",
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

            System.out.println(brad.getName() + " has the next allergies: ");

            for (int i = 0; i < brad.getAllergies().size(); i++) {
                System.out.println(brad.getAllergies().get(i).getName() + " with a " + brad.getAllergies().get(i).getSeverity() + " severity");
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

        /**
         * Eight exercise:
         *
         *  Temperature class to know whether patient has fever or not
         *  and in what location is the reading taken such as mouth, armpit, ear.
         */

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
