package org.pmareke.cerner.test;

import static org.pmareke.cerner.utils.Utils.createDate;

import java.util.Collections;
import org.pmareke.cerner.sort.LastSeenComparator;
import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise3Test {

    @BeforeTest
    public void before_test() {
        Utils.data();
    }

    /**
     * Third exercise:
     * <p>
     * Given a list of streamed patients (consisting of names, birth, date last seen), return the 3 most recently seen
     * patients from that list. Assume the list of incoming patients is not ordered in any particular order.
     */

    @Test()
    public void testExercise3() {
        Utils.brad.setLastSeen(createDate("12/01/2000"));
        Collections.sort(Utils.patients, new LastSeenComparator());
        Assert.assertEquals(Utils.tom, Utils.patients.get(0));
        Utils.brad.setLastSeen(createDate("10/12/2017"));
        Collections.sort(Utils.patients, new LastSeenComparator());
        Assert.assertEquals(Utils.brad, Utils.patients.get(0));
    }
}