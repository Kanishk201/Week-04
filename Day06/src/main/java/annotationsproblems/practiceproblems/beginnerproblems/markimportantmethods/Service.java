package annotationsproblems.practiceproblems.beginnerproblems.markimportantmethods;

public class Service {

        @ImportantMethod(level = "HIGH")
        public void processCriticalData() {
            System.out.println("Processing critical data...");
        }

        @ImportantMethod(level = "MEDIUM")
        public void processRegularData() {
            System.out.println("Processing regular data...");
        }

        public void helperMethod() {
            System.out.println("This method is not marked as important.");
        }

}
