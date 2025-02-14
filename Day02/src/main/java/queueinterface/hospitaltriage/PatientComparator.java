package queueinterface.hospitaltriage;

import java.util.Comparator;

class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.severity, p1.severity); // Higher severity first
    }
}
