package com;

import java.util.*;


@FunctionalInterface
interface StringProcessor {
 String process(String str);
}

public class Lambda {
 public static void main(String[] args) {
    
	 List<String> l = Arrays.asList("carrot", "tomato", "potato", "cucumber", "spinach");
     
     
     l.sort((s1, s2) -> s2.compareTo(s1));
     
     System.out.println("Sorted in reverse alphabetical order:");
     System.out.println(l);
     
     
     StringProcessor toUpperCaseProcessor = String::toUpperCase;
     
     System.out.println("\nStrings in uppercase:");
     for (String word : l) {
         System.out.println(toUpperCaseProcessor.process(word));
     }
 }
}

