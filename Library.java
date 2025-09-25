package com.elevatelabs.tasks.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Book
    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    // View Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            System.out.println("Available Books");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Add User
    public void addUser() {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        users.add(new User(id, name));
        System.out.println("User added successfully");
    }

    // Issue Book
    public void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int bookId = sc.nextInt();
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();

        Book foundBook = null;
        for (Book b : books) {
            if (b.getId() == bookId) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }

        if (foundBook.isIssued()) {
            System.out.println("Book already issued");
        } else {
            foundBook.setIssued(true);
            System.out.println("Book issued to User ID " + userId);
        }
    }

    // Return Book
    public void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();

        Book foundBook = null;
        for (Book b : books) {
            if (b.getId() == bookId) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found.");
        } else if (!foundBook.isIssued()) {
            System.out.println("Book was not issued.");
        } else {
            foundBook.setIssued(false);
            System.out.println("Book returned successfully!");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add User");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewBooks(); break;
                case 3: addUser(); break;
                case 4: issueBook(); break;
                case 5: returnBook(); break;
                case 6: 
                    System.out.println("Exiting from Library System");
                    return;
                default: 
                    System.out.println("Invalid choice");
            }
        }
    }

   
    public static void main(String[] args) {
        new Library().menu();
    }
}

