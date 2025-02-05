package com;

import java.util.Optional;

interface UserService {
    
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
    
    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

   
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    public String getPersonalizedWelcomeMessage(String name) {
        return getUser(name).map(user -> "Welcome, " + user + "!").orElseGet(this::getWelcomeMessage);
    }
}

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        
       
        System.out.println(((UserServiceImpl) userService).getPersonalizedWelcomeMessage("Anvitha"));
        
    
        System.out.println(((UserServiceImpl) userService).getPersonalizedWelcomeMessage(null));
    }
}

