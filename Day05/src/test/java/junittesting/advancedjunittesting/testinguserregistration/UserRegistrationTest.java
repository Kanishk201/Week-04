package junittesting.advancedjunittesting.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.advancedjunitproblems.userregistrationtesting.UserRegistration;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully", UserRegistration.registerUser("JohnDoe", "john@example.com", "Password1"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("", "john@example.com", "Password1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "Pass1"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testPasswordWithoutUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "password1"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testPasswordWithoutDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "Password"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit", exception.getMessage());
    }
}

