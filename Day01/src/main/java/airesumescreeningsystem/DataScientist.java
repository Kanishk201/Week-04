package airesumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    void evaluateResume() {
        System.out.println("Evaluating Data Scientist resume for " + candidateName);
    }
}
