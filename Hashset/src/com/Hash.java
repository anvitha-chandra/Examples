package com;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
      
        HashSet<String> h = new HashSet<>();

       
        h.add("Manglore");
        h.add("Mysore");
        h.add("Udupi");
        h.add("Bangalore");
        h.add("Udupi"); 
        
        System.out.println("Cities in the HashSet: " + "\n"+h);

       
        String cityToCheck = "Madikeri";
        if (h.contains(cityToCheck)) {
        	
            System.out.println(cityToCheck + " exists in the HashSet.");
        } else {
            System.out.println(cityToCheck + " is not in the HashSet.");
        }

       
        h.remove("Udupi");
        
        System.out.println("Updated HashSet after removing : " +"\n"+  h);
    }
}

