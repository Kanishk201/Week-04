package annotationsproblems.practiceproblems.intermediateproblems.loggingmethodexecutiontime;

class TaskImpl implements Task {

    @LogExecutionTime
    public void fastTask() {
        System.out.println("Executing fast task...");
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing slow task...");
        try {
            Thread.sleep(500); // Simulating a slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

