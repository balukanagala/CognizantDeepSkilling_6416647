package com.example.exercise2_verifying;

public class UserManager {
	  private NotificationService notificationService;

	    public UserManager(NotificationService notificationService) {
	        this.notificationService = notificationService;
	    }

	    public void createUser(String username, String email) {
	        System.out.println("Creating user: " + username + " with email: " + email);

	        String welcomeMessage = "Welcome, " + username + "! Your account has been created.";
	        notificationService.sendNotification(email, welcomeMessage);
	    }
}
