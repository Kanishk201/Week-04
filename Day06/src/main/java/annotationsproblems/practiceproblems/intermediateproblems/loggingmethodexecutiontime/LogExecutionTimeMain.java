package annotationsproblems.practiceproblems.intermediateproblems.loggingmethodexecutiontime;


import java.lang.reflect.Proxy;

public class LogExecutionTimeMain {
    public static void main(String[] args) {
        Task task = (Task) Proxy.newProxyInstance(
                Task.class.getClassLoader(),
                new Class[]{Task.class},
                new ExecutionTimeProxy(new TaskImpl())
        );

        task.fastTask();
        task.slowTask();
    }
}
