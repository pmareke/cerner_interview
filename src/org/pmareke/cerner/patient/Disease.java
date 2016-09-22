package org.pmareke.cerner.patient;

/**
 * Created by pmareke on 22/09/16.
 */
public class Disease {
    private String name;

    public Disease(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
