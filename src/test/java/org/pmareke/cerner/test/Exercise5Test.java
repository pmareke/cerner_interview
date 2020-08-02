package org.pmareke.cerner.test;

import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise5Test {

    /**
     * Fifth exercise:
     * <p>
     * To record a new born's birth date and time reflecting the time zone.
     */

    @Test()
    public void testExercise5() {
        Assert.assertEquals(Utils.carl.getBirth(), "23 Sep 1983 00:00:00 CEST");

        Assert.assertEquals(
            Utils.carl.getBirthInOtherTimeZone("America", "New York"), "22 Sep 1983 22:00:00 GMT"
        );
    }
}