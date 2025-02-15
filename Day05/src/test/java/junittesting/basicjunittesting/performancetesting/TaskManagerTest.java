package junittesting.basiicjunittesting.performancetesting;

import junitproblems.basicjunitproblems.performancetesting.TaskManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {
    private final TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        taskManager.longRunningTask();
    }
}

