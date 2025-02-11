package airesumescreeningsystem;

  public abstract class JobRole {
        public String candidateName;
        public int experience;

        public JobRole(String candidateName, int experience) {
            this.candidateName = candidateName;
            this.experience = experience;
        }

        abstract void evaluateResume();
    }

