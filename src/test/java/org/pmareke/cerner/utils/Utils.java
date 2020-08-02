package org.pmareke.cerner.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.Address;
import org.pmareke.cerner.patient.Allergy;
import org.pmareke.cerner.patient.Disease;
import org.pmareke.cerner.patient.Patient;
import org.pmareke.cerner.patient.Severity;
import org.pmareke.cerner.timezone.Baby;

public class Utils {

    /**
     * ALLERGIES
     */
    public static Allergy dust;
    public static Allergy cat;
    public static List<Allergy> allergies;

    /**
     * DISEASES
     */
    public static List<Disease> diseases;
    public static Disease cancer;

    /**
     * PATIENTS
     */
    public static Patient brad;
    public static Patient tom;
    public static Patient henry;
    public static Patient susan;
    public static List<Patient> patients;

    /**
     * BABIES
     */
    public static Baby carl;

    /**
     * PEOPLE
     */
    public static Person john;

    public static void data() {

        dust = new Allergy("dust", Severity.HIGH);
        cat = new Allergy("cat", Severity.LOW);
        allergies = new ArrayList<Allergy>() {{
            add(dust);
            add(cat);
        }};

        cancer = new Disease("cancer");
        diseases = new ArrayList<Disease>() {{
            add(cancer);
        }};

        brad = new Patient("Brad", 41,
            new Address("UK", "London", "Paddigton", 1234567890),
            allergies,
            diseases
        );
        
        tom = new Patient("Tom", 41,
            new Address("UK", "London", "Paddigton", 1234567890),
            allergies,
            diseases,
            new ArrayList<Medication>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2016")
        );

        henry = new Patient("Henry", 41,
            new Address("UK", "London", "Paddigton", 1234567890),
            allergies,
            diseases,
            new ArrayList<>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2011")
        );

        susan = new Patient("Susan", 40,
            new Address("UK", "London", "Yorkside", 1234567890),
            allergies,
            diseases,
            new ArrayList<>(),
            new Temperature(20, Location.Ampit),
            new Date("10/12/2007")
        );

        patients = new ArrayList<Patient>() {{
            add(brad);
            add(tom);
            add(henry);
            add(susan);
        }};

        john = new Person(
            "John", 32,
            new Address("Spain", "Cataluña", "Barcelona", 1234567890)
        );

        carl = new Baby("Carl", new Date("09/23/1983"), "Europe", "Madrid");
    }
}
