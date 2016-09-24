package org.pmareke.cerner.test;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
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
public class Exercise7Test {

  /**
   * Seventh exercise:
   *
   *  Implementing a system that notifies nurse when a patient should receive medications.
   */

  @Test()
  public void testExercise7(){

    Assert.assertFalse(Utils.susan.hasMedicines());
    Assert.assertFalse(Utils.henry.hasMedicines());
    Assert.assertFalse(Utils.tom.hasMedicines());
    Assert.assertTrue(Utils.brad.hasMedicines());

  }
}