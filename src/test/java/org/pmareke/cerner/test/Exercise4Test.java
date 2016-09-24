package org.pmareke.cerner.test;

import org.pmareke.cerner.demographic.Person;
import org.pmareke.cerner.patient.Address;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise4Test {

  /**
   * Fourth exercise:
   *
   *  Person Demographic Problem to store information about every person.
   */


  @Test()
  public void testExercise4(){

    Assert.assertEquals("John", Utils.John.getName());
  }

}