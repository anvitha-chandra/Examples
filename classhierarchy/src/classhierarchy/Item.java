package classhierarchy;


class Item {
 public String title;
 public  String author;
 public int publicationYear;


 public Item(String title, String author, int publicationYear) {
     this.title = title;
     this.author = author;
     this.publicationYear = publicationYear;
 }

 
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Publication Year: " + publicationYear);
 }
}


class Book extends Item {
 private String genre;

 public Book(String title, String author, int publicationYear, String genre) {
     super(title, author, publicationYear);
     this.genre = genre;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Genre: " + genre);
 }
}


class Magazine extends Item {
 private int issueNumber;

 public Magazine(String title, String author, int publicationYear, int issueNumber) {
     super(title, author, publicationYear);
     this.issueNumber = issueNumber;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Issue Number: " + issueNumber);
 }
}
