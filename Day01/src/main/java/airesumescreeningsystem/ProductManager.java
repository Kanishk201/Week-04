package airesumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    void evaluateResume() {
        System.out.println("Evaluating Product Manager resume for " + candidateName);
    }
}
