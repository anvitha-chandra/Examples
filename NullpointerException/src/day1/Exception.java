package day1;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            System.out.println("Length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Null value detected.");
        }
        
        try {
            int[] arr = new int[5];
            System.out.print("Enter index : ");
            System.out.println("Value: " + arr[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
        
        scanner.close();
    }
}

