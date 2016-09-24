package org.pmareke.cerner.test;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.sort.LastSeenComparator;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise3Test {

  /**
   * Third exercise:
   *
   *  Given a list of streamed patients (consisting of names, birth, date last seen),
   *  return the 3 most recently seen patients from that list.
   *  Assume the list of incoming patients is not ordered in any particular order.
   */

  @Test()
  public void testExercise3(){


    Utils.brad.setLastSeen(new Date("12/01/2000"));

    Collections.sort(Utils.patients, new LastSeenComparator());

    Assert.assertEquals( Utils.tom, Utils.patients.get(0));

    Utils.brad.setLastSeen( new Date("10/12/2017") );

    Collections.sort(Utils.patients, new LastSeenComparator());

    Assert.assertEquals( Utils.brad, Utils.patients.get(0));

  }

}