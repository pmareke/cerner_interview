package org.pmareke.cerner.patient;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise7Test {

  /**
   * Seventh exercise:
   *
   *  Implementing a system that notifies nurse when a patient should receive medications.
   */

  @Test()
  public void testExercise7(){

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


    Medication aspirine = new Medication(
        "Aspirine",
        new Date("01/01/2016")
    );

    List<Medication> medications = new ArrayList<Medication>();
    medications.add(aspirine);

    brad.setMedications(medications);


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

    Assert.assertFalse(susan.hasMedicines());
    Assert.assertFalse(henry.hasMedicines());
    Assert.assertFalse(tom.hasMedicines());
    Assert.assertTrue(brad.hasMedicines());




  }
}