package oop.Project;

import java.util.*;

// Student class
class Student extends User {
    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void menu(Library library, Scanner sc) {
        int choice;
        do {
            System.out.println("\n--- Student Menu (" + name + ") ---");
            System.out.println("1. View All Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.viewBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    library.issueBook(bookId, this);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    int bookId = sc.nextInt();
                    library.returnBook(bookId, this);
                }
                case 4 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}