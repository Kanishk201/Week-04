package queueinterface.hospitaltriage;

public class Main {
    public static void main(String[] args) {
        HospitalTriage triage = new HospitalTriage();
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        System.out.println("Patients will be treated in this order:");
        Patient patient;
        while ((patient = triage.treatPatient()) != null) {
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }
}
