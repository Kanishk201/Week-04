package annotationsproblems.exerciseproblems.repeatableannotation;

class Software {

    @BugReport(description = "Null pointer exception on edge case", reportedBy = "Alice")
    @BugReport(description = "UI glitch on dark mode", reportedBy = "Bob")
    public void buggyMethod() {
        System.out.println("This method has known bugs...");
    }
}
