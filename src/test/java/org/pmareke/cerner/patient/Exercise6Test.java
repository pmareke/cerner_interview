package org.pmareke.cerner.patient;

import org.pmareke.cerner.medication.Medication;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise6Test {

  /**
   * Sixth exercise:
   *
   *  Design a class where a nurse had to assign medication to a patient
   *  along with the start and the end dates ( there may or may not be end date).
   */

  @Test()
  public void testExercise6(){

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

    Assert.assertTrue( brad.getMedications().size() > 0);


  }
}