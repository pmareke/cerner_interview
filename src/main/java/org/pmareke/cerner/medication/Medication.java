package org.pmareke.cerner.medication;

import java.util.Calendar;

/**
 * Created by pmareke on 22/09/16.
 */
public class Medication {

    private String name;
    private Calendar start;
    private Calendar end;

    public Medication(String name, Calendar start, Calendar end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public Medication(String name, Calendar start) {
        this.name = name;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }
}
