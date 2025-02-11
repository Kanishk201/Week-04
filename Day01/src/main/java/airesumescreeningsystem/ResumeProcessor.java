package airesumescreeningsystem;

import java.util.List;

class ResumeProcessor {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.evaluateResume();
        }
    }
}
