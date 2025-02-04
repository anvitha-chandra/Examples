package com;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> h = new HashMap<>();

       
        System.out.println("Enter 5 student records (Roll Number and Name):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            h.put(rollNumber, name);
        }

       
        System.out.print("\nEnter a Roll number of a student: ");
        int searchRollNumber = scanner.nextInt();
        if (h.containsKey(searchRollNumber)) {
            System.out.println("Student Name: " + h.get(searchRollNumber));
        } else {
            System.out.println("Roll Number not found!");
        }

       
        System.out.print("\nEnter a Roll Number to remove the student : ");
        int removeRollNumber = scanner.nextInt();
        if (h.remove(removeRollNumber) != null) {
            System.out.println("Student record removed successfully.");
        } else {
            System.out.println("Roll Number not found!");
        }

      
        System.out.println("\nAll Student Records:");
        for (HashMap.Entry<Integer, String> entry : h.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

     
    }
}

