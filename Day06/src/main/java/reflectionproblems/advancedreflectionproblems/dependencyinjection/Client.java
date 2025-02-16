package reflectionproblems.advancedreflectionproblems.dependencyinjection;

class Client {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}
