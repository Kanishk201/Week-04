package resumescreeningtest;

import airesumescreeningsystem.Resume;
import airesumescreeningsystem.SoftwareEngineer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ResumeScreeningTest {
    @Test
    public void testResumeProcessing() {
        SoftwareEngineer se = new SoftwareEngineer("Alice", 5);
        Resume<SoftwareEngineer> seResume = new Resume<>(se);
        assertEquals("Alice", seResume.JobRole().candidateName);
        assertEquals(5, seResume.JobRole().experience);
    }
}