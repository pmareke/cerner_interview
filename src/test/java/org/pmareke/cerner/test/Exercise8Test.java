package org.pmareke.cerner.test;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.patient.Address;
import org.pmareke.cerner.patient.Allergy;
import org.pmareke.cerner.patient.Disease;
import org.pmareke.cerner.patient.Patient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise8Test {

  /**
   * Eighth exercise:
   *
   *  Temperature class to know whether patient has fever or not
   *  and in what location is the reading taken such as mouth, armpit, ear.
   */

  @Test()
  public void testExercise8(){

    Patient brad = new Patient(
        "Brad",
        41,
        new Address(
            "UK",
            "London",
            "Paddigton",
            1234567890
        ),
        new ArrayList<Allergy>(),
        new ArrayList<Disease>()
    );

    brad.setTemperature(
        new Temperature(
            40,
            Location.Ear
        )
    );

    Assert.assertTrue(brad.hasFever());

    brad.setTemperature(new Temperature(15, Location.Ampit));

    Assert.assertFalse(brad.hasFever());
  }
}