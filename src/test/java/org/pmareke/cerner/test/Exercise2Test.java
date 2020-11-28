package org.pmareke.cerner.test;

import static org.pmareke.cerner.utils.Utils.allergies;

import org.pmareke.cerner.patient.Allergy;
import org.pmareke.cerner.patient.Severity;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise2Test {

    @BeforeTest
    public void before_test() {
        Utils.data();
    }

    /**
     * Second exercise:
     * <p>
     * Design a system for entering and displaying the allergies patients have with given fields!
     * <p>
     * Via Getters and Setters
     */

    @Test()
    public void testExercise2() {
        int allergiesBefore = Utils.brad.getAllergies().size();
        Utils.allergies.add(new Allergy("food", Severity.MEDIUM));
        Utils.brad.setAllergies(allergies);
        Assert.assertTrue(allergiesBefore < Utils.brad.getAllergies().size());
    }

}