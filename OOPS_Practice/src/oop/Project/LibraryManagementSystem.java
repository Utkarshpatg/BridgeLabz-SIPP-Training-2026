package oop.Project;

import java.util.*;

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Preload some books
        library.addBook(new Book(1, "Java Programming", "James Gosling", 2),false);
        library.addBook(new Book(2, "C++ Programming", "Bjarne Stroustrup", 1),false);
        library.addBook(new Book(3, "Python Basics", "Guido van Rossum", 3),false);


        // Users
        Admin admin = new Admin("Librarian", 1001);
        Student student1 = new Student("Utkarsh", 2001);
        Student student2 = new Student("Rahul", 2002);
        library.addStudent(student1);
        library.addStudent(student2);

        int choice;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    if (admin.login(sc)) {
                        admin.menu(library, sc);
                    }
                }
                case 2 -> {
                    System.out.println("Available Students:");
                    int i = 1;
                    for (Student s : library.getStudents()) {
                        System.out.println(i + ". " + s.name + " (ID: " + s.userId + ")");
                        i++;
                    }
                    System.out.print("Select Student: ");
                    int idx = sc.nextInt();
                    if (idx >= 1 && idx <= library.getStudents().size()) {
                        library.getStudents().get(idx - 1).menu(library, sc);
                    } else {
                        System.out.println("Invalid student selection.");
                    }
                }
                case 3 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}