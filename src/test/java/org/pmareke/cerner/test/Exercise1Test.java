package org.pmareke.cerner.test;

import org.pmareke.cerner.patient.*;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise1Test {

  @Test()
  public void testExercise1(){

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
    Assert.assertTrue( brad.getFullAllergies().length() > 0 );
    Assert.assertTrue( brad.getFullDiseases().length() > 0 );

  }

}