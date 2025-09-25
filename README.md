# Task 3: Library Management System (Using OOP)

This project is part of my **Elevate Labs Java Developer Internship**.  
The objective is to build a **Library Management System** using core **Object-Oriented Programming (OOP) principles** in Java.

## What I Did
In this task, I:
- Designed three classes: **Book, User, and Library**.
- Implemented **Book** class with fields `id`, `title`, `author`, and `isIssued`.
- Implemented **User** class with fields `id` and `name`.
- Implemented **Library** class to manage:
  - Adding books and users  
  - Viewing available books  
  - Issuing a book to a user  
  - Returning a book  
- Applied **OOP concepts**: encapsulation, abstraction, method overriding (toString), and relationships (`Library HAS books`, `Library HAS users`).
- Created a **menu-driven CLI system** using `Scanner` and loops for user interaction.

## Features
- Add new books  
- View all available books  
- Add library users  
- Issue a book to a user  
- Return a book  
- Exit system

---

## Class Structure
com.elevatelabs.tasks.task3
```
├── Book.java      # Represents a book class (id, title, author, issued status)
├── User.java # Represents a user class (id, name)
└── Library.java # Main class with menu and library operations.
```
## Sample Output
Library Management System
1. Add Book
2. View Books
3. Add User
4. Issue Book
5. Return Book
6. Exit
Enter your choice: 1
Enter Book ID: 2001
Enter Book Title: Java Programming
Enter Book Author: Dennis Charlie 
✅ Book added successfully
