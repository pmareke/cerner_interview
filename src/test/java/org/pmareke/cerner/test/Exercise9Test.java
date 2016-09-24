package org.pmareke.cerner.test;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.patient.Address;
import org.pmareke.cerner.patient.Allergy;
import org.pmareke.cerner.patient.Disease;
import org.pmareke.cerner.patient.Patient;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise9Test {

  /**
   * Ninth exercise:
   *
   *  Temperature :
   *   0. Default  temperatures: 0ºC => Via constructor in Temperature
   *   1. Convert Celsius to Fahrenheit.
   *   3. Update default temperature. => Via Setter in Temperature
   */


  @Test()
  public void testExercise9(){


    Assert.assertEquals(Utils.brad.getTemperature().getTemperatureInFahrenheit(), 104.0);

    Utils.brad.setTemperature(new Temperature(35, Location.Ear));

    Assert.assertEquals(Utils.brad.getTemperature().getTemperatureInFahrenheit(), 95.0);
  }

}