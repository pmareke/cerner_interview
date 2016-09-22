package org.pmareke.cerner.patient;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
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


    Assert.assertEquals(brad.getTemperature().getTemperatureInFahrenheit(), 104.0);

    brad.setTemperature(new Temperature(35, Location.Ear));
    Assert.assertEquals(brad.getTemperature().getTemperatureInFahrenheit(), 95.0);
  }

}