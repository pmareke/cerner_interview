package org.pmareke.cerner.test;

import org.pmareke.cerner.fever.Location;
import org.pmareke.cerner.fever.Temperature;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.patient.*;
import org.pmareke.cerner.sort.LastSeenComparator;
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

    Allergy dust = new Allergy(
        "dust",
        Severity.HIGH
    );

    Allergy cat = new Allergy(
        "cat",
        Severity.LOW
    );

    List<Allergy> allergies = new ArrayList<Allergy>();
    allergies.add(dust);
    allergies.add(cat);

    Disease cancer = new Disease("cancer");

    List<Disease> diseases = new ArrayList<Disease>();

    diseases.add(cancer);

    Patient brad = new Patient(
        "Brad",
        41,
        new Address(
            "UK",
            "London",
            "Paddigton",
            1234567890
        ),
        allergies,
        diseases
    );

    Patient tom = new Patient(
        "Tom",
        41,
        new Address(
            "UK",
            "London",
            "Paddigton",
            1234567890
        ),
        allergies,
        diseases,
        new ArrayList<Medication>(),
        new Temperature(20, Location.Ampit),
        new Date("10/12/2016")
    );

    Patient henry = new Patient(
        "Henry",
        41,
        new Address(
            "UK",
            "London",
            "Paddigton",
            1234567890
        ),
        allergies,
        diseases,
        new ArrayList<Medication>(),
        new Temperature(20, Location.Ampit),
        new Date("10/12/2011")
    );

    Patient susan = new Patient(
        "Susan",
        40,
        new Address(
            "UK",
            "London",
            "Yorkside",
            1234567890
        ),
        allergies,
        diseases,
        new ArrayList<Medication>(),
        new Temperature(20, Location.Ampit),
        new Date("10/12/2007")
    );


    List<Patient> patients = new ArrayList<Patient>();
    brad.setLastSeen(new Date("12/01/2000"));
    patients.add(brad);
    patients.add(tom);
    patients.add(henry);
    patients.add(susan);

    Collections.sort(patients, new LastSeenComparator());

    Assert.assertEquals( tom, patients.get(0));

    brad.setLastSeen( new Date("10/12/2017") );

    Collections.sort(patients, new LastSeenComparator());

    Assert.assertEquals( brad, patients.get(0));

  }

}