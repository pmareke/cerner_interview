package org.pmareke.cerner.test;

import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise7Test {

    /**
     * Seventh exercise:
     * <p>
     * Implementing a system that notifies nurse when a patient should receive medications.
     */

    @Test()
    public void testExercise7() {
        Assert.assertFalse(Utils.susan.hasMedicines());
        Assert.assertFalse(Utils.henry.hasMedicines());
        Assert.assertFalse(Utils.tom.hasMedicines());
        Assert.assertTrue(Utils.brad.hasMedicines());
    }
}