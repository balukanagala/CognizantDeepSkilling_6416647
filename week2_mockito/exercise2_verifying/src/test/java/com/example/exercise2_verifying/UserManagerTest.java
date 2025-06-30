package com.example.exercise2_verifying;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserManagerTest {

    @Test
    public void testCreateUserSendsNotificationWithExpectedArguments() {
        // step-1
        NotificationService mockService = mock(NotificationService.class);

        // step-2
        UserManager userManager = new UserManager(mockService);

        // Test values
        String username = "balu";
        String email = "balu@dps.com";
        String expectedMessage = "Welcome, balu! Your account has been created.";

        userManager.createUser(username, email);

        // Verify sendNotification was called with:
        // - The exact email using eq(...)
        // - The exact welcome msg as well
        verify(mockService).sendNotification(eq(email), eq(expectedMessage));
    }
}