package queueinterface.hospitaltriagetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queueinterface.hospitaltriage.HospitalTriage;

class HospitalTriageTest {

    @Test
    void testTriageOrder() {
        HospitalTriage triage = new HospitalTriage();
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        assertEquals("Alice", triage.treatPatient().name);
        assertEquals("John", triage.treatPatient().name);
        assertEquals("Bob", triage.treatPatient().name);
    }

    @Test
    void testEmptyQueue() {
        HospitalTriage triage = new HospitalTriage();
        assertNull(triage.treatPatient());
    }
}
