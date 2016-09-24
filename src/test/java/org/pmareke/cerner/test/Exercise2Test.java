package org.pmareke.cerner.test;

import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.utils.Utils;

import static org.pmareke.cerner.utils.Utils.allergies;

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


    int allergiesBefore = Utils.brad.getAllergies().size();

    Utils.allergies.add(
        new Allergy(
            "food",
            Severity.MEDIUM
        )
    );

    Utils.brad.setAllergies(allergies);

    Assert.assertTrue( allergiesBefore < Utils.brad.getAllergies().size());
  }

}