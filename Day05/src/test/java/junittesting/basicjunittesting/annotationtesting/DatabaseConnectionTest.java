package junittesting.basiicjunittesting.annotationtesting;

import junitproblems.basicjunitproblems.testingannotations.DatabaseConnection;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Database should be connected after setup");
    }

    @Test
    public void testConnectionIsClosed() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected after tear down");
    }
}

