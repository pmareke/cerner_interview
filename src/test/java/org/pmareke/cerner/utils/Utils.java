package org.pmareke.cerner.utils;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.timezone.Baby;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
  public static Person John;

  public static void data() {

    dust = new Allergy(
        "dust",
        Severity.HIGH
    );

    cat = new Allergy(
        "cat",
        Severity.LOW
    );

    allergies = new ArrayList<Allergy>();
      allergies.add(dust);
      allergies.add(cat);

    cancer = new Disease("cancer");

    diseases = new ArrayList<Disease>();

    diseases.add(cancer);

      brad = new Patient(
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
    tom = new Patient(
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

    henry = new Patient(
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

    susan = new Patient(
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


    patients = new ArrayList<Patient>();
      patients.add(brad);
      patients.add(tom);
      patients.add(henry);
      patients.add(susan);

    John = new Person(
        "John",
        32,
        new Address("Spain",
            "Cataluña",
            "Barcelona",
            1234567890)
    );

    carl = new Baby(
        "Carl",
        new Date("09/23/1983"),
        "Europe",
        "Madrid"
    );
  }
}
