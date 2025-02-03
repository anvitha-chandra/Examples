package classhierarchy;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter Book Title: ");
        String bookTitle = s.nextLine();
        System.out.print("Enter Book Author: ");
        String bookAuthor = s.nextLine();
        System.out.print("Enter Publication Year: ");
        int bookYear = s.nextInt();
        s.nextLine();  
        System.out.print("Enter Genre: ");
        String bookGenre = s.nextLine();

       
        Book book = new Book(bookTitle, bookAuthor, bookYear, bookGenre);

        
        System.out.print("Enter Magazine Title: ");
        String magazineTitle = s.nextLine();
        System.out.print("Enter Magazine Author: ");
        String magazineAuthor = s.nextLine();
        System.out.print("Enter Publication Year: ");
        int magazineYear = s.nextInt();
        System.out.print("Enter Issue Number: ");
        int magazineIssueNumber = s.nextInt();

        
        Magazine magazine = new Magazine(magazineTitle, magazineAuthor, magazineYear, magazineIssueNumber);

     
        System.out.println("\nBook Details:");
        book.displayDetails();

        System.out.println("\nMagazine Details:");
        magazine.displayDetails();

        
    }
}