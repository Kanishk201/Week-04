package junittesting.advancedjunittesting.testingdateformatter;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.advancedjunitproblems.dateformattertesting.DateFormatter;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertEquals("Invalid date format", DateFormatter.formatDate("25-12-2023"));
        assertEquals("Invalid date format", DateFormatter.formatDate("12/25/2023"));
    }
}

