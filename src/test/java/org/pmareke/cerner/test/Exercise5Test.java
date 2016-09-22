package org.pmareke.cerner.test;

import org.pmareke.cerner.timezone.Baby;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise5Test {

  /**
   * Fifth exercise:
   *
   *  To record a new born's birth date and time reflecting the time zone.
   */

  @Test()
  public void testExercise5(){



    Baby carl = new Baby(
        "Carl",
        new Date("09/23/1983"),
        "Europe",
        "Madrid"
    );


    Assert.assertEquals(
        carl.getBirth(),
        "23 Sep 1983 00:00:00 CEST");

    Assert.assertEquals(
        carl.getBirthInOtherTimeZone("America", "New York"),
        "22 Sep 1983 22:00:00 GMT");

  }
}