package queueinterface.hospitaltriage;

import java.util.PriorityQueue;

public class HospitalTriage {
    private PriorityQueue<Patient> queue;

    public HospitalTriage() {
        this.queue = new PriorityQueue<>(new PatientComparator());
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public Patient treatPatient() {
        return queue.poll();
    }
}