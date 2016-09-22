package org.pmareke.cerner.sort;

import org.pmareke.cerner.patient.Patient;

import java.util.Comparator;

/**
 * Created by pmareke on 22/09/16.
 */
public class LastSeenComparator implements Comparator<Patient>{

  @Override
  public int compare(Patient p1, Patient p2) {
    return p2.getLastSeen().compareTo(p1.getLastSeen());
  }
}
