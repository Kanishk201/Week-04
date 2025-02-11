package airesumescreeningsystem;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemMain {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", 5));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", 3));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", 7));

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        // Process multiple resumes
        List<JobRole> resumes = Arrays.asList(
                new SoftwareEngineer("David", 6),
                new DataScientist("Eve", 4),
                new ProductManager("Frank", 8)
        );
        ResumeProcessor.processResumes(resumes);
    }
}

