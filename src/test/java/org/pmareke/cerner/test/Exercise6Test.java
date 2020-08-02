package org.pmareke.cerner.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.pmareke.cerner.medication.Medication;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise6Test {

    /**
     * Sixth exercise:
     * <p>
     * Design a class where a nurse had to assign medication to a patient along with the start and the end dates ( there
     * may or may not be end date).
     */

    @Test()
    public void testExercise6() {
        Medication aspirine = new Medication("Aspirine", new Date("01/01/2016"));
        List<Medication> medications = new ArrayList<>();
        medications.add(aspirine);
        Utils.brad.setMedications(medications);
        Assert.assertFalse(Utils.brad.getMedications().isEmpty());
    }
}