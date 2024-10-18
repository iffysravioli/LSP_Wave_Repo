package org.howard.edu.lsp.midterm.question1;

public class Book {
    private String title, author, ISBN; private int yearPublished;
    public Book(String t, String a, String i, int y) { title = t; author = a; ISBN = i; yearPublished = y; }
    public boolean equals(Object obj) { Book b = (Book) obj; return ISBN.equals(b.ISBN) && author.equals(b.author); }
    public String toString() { return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished; }
}

class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
        System.out.println(book1.equals(book2)); 
        System.out.println(book1.equals(book3)); 
        System.out.println(book1); // Outputs Book details
    }
}
