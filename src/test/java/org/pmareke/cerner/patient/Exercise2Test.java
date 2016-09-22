package org.pmareke.cerner.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise2Test {

  /**
   * Second exercise:
   *
   *  Design a system for entering and displaying the allergies patients have with given fields!
   *
   *  Via Getters and Setters
   */

  @Test()
  public void testExercise2(){

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

    int allergiesBefore = brad.getAllergies().size();

    allergies.add(
        new Allergy(
            "food",
            Severity.MEDIUM
        )
    );

    brad.setAllergies(allergies);

    Assert.assertTrue( allergiesBefore < brad.getAllergies().size());
  }

}