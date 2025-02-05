package com;

import java.util.Optional;

interface UserService {
   
    default String getWelcomeMessage(String name) {
        return Optional.ofNullable(name) .map(user -> "Welcome, " + user + "!").orElse("Welcome, Guest!");
    }
    Optional<String> getUser(String name);
}
class UserServiceImpl implements UserService {

    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
}

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

       
        System.out.println(userService.getWelcomeMessage("Anvitha"));
        
        
        System.out.println(userService.getWelcomeMessage(null));
    }
}
