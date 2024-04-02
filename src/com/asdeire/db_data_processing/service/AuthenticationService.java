package com.asdeire.db_data_processing.service;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

    // List of user roles
    private Map<String, String> userRoles;

    public AuthenticationService() {
        // Initialization of the list of user roles
        userRoles = new HashMap<>();
        // Adding user roles. Here you can fetch roles from a database or another source
        userRoles.put("admin", "admin");
        userRoles.put("user", "user");
    }

    // Method to authenticate a user based on their username and password
    public boolean authenticateUser(String username, String password) {
        // Logic to authenticate the user
        // Returns true if the user is successfully authenticated, otherwise false
        // In this example, we simply check if the user exists in the database or list
        return userRoles.containsKey(username) && userRoles.get(username).equals(password);
    }

    // Method to retrieve the role of a user based on their username
    public String getUserRole(String username) {
        // Retrieving the user's role from the database or list
        return userRoles.get(username);
    }
}
