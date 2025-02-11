package airesumescreeningsystem;

public class Resume<T extends JobRole> {
    public T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        jobRole.evaluateResume();
    }

    public T JobRole() {
        return jobRole;
    }
}