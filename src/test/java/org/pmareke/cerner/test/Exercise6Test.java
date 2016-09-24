package org.pmareke.cerner.test;

import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.utils.Utils;
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

    Medication aspirine = new Medication(
        "Aspirine",
        new Date("01/01/2016")
    );

    List<Medication> medications = new ArrayList<Medication>();
    medications.add(aspirine);

    Utils.brad.setMedications(medications);

    Assert.assertTrue( Utils.brad.getMedications().size() > 0);


  }
}