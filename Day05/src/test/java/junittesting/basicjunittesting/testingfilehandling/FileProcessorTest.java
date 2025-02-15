package junittesting.basiicjunittesting.testingfilehandling;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.basicjunitproblems.testingfilehandling.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileProcessorTest {
    private final FileProcessor fileProcessor = new FileProcessor();
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Ensure the file does not exist before each test
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Clean up after each test
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match the written content.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample content");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing.");
    }

    @Test
    void testReadFromFileThrowsIOExceptionForMissingFile() {
        Exception exception = assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
        assertTrue(exception.getMessage().contains("nonexistent.txt"), "IOException should mention the missing file.");
    }
}

