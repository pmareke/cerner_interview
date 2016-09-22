package org.pmareke.cerner.patient;

import org.pmareke.cerner.demographic.Person;
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

    Person John = new Person(
        "John",
        32,
        new Address("Spain",
            "Cataluña",
            "Barcelona",
            1234567890)
    );

    Assert.assertEquals("John", John.getName());
  }

}