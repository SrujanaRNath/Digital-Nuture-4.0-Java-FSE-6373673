package setting_up_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @AfterEach
    void tearDown() {
        userService.resetUsers();
    }

    @Test
    void testUserRegistration() {
        // Arrange done in @BeforeEach

        // Act
        userService.registerUser("Alice");
        userService.registerUser("Bob");

        // Assert
        assertEquals(2, userService.getUserCount());
    }

    @Test
    void testNoUserRegistered() {
        // Act & Assert
        assertEquals(0, userService.getUserCount());
    }
}
