package airesumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    void evaluateResume() {
        System.out.println("Evaluating Software Engineer resume for " + candidateName);
    }
}
