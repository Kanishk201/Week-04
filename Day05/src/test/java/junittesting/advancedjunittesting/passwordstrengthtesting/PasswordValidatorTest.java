package junittesting.advancedjunittesting.passwordstrengthtesting;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.advancedjunitproblems.testingpasswordstrength.PasswordValidator;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP@ss1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValid("Short1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValid("nouppercase1"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitHere"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""));
    }
}

