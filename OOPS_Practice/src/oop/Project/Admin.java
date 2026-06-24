package oop.Project;

import java.util.*;

// Admin class
class Admin extends User {
    private String password = "admin123";
    private final String securityCode = "GLA2025";

    public Admin(String name, int userId) {
        super(name, userId);
    }

    public boolean login(Scanner sc) {
        System.out.print("Enter Admin Password: ");
        String input = sc.next();
        if (input.equals(password)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Wrong password!");
            System.out.print("Forgot password? (Y/N): ");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                resetPassword(sc);
            }
            return false;
        }
    }

    private void resetPassword(Scanner sc) {
        System.out.print("Enter Security Code: ");
        String code = sc.next();
        if (code.equals(securityCode)) {
            System.out.print("Enter new password: ");
            password = sc.next();
            System.out.println("Password reset successfully!");
        } else {
            System.out.println("Wrong security code!");
        }
    }

    @Override
    public void menu(Library library, Scanner sc) {
        int choice;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View All Books");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. View Student History");
            System.out.println("5. Add New Student");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
//                case 1 -> library.viewBooks();
                case 1 -> {
                    int subChoice;
                    do {
                        System.out.println("\n--- View Books ---");
                        library.viewBooks();
                        System.out.println("0. Exit to Admin Menu");
                        System.out.print("Enter choice: ");
                        subChoice = sc.nextInt();
                    } while (subChoice != 0);
                }

//                case 2 -> {
//                    System.out.print("Enter Book ID: ");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//
//                    Book existing = library.getBookById(id);
//
//                    if (existing != null) {
//                        System.out.println("This ID already exists for: " + existing.getTitle() + " by " + existing.getAuthor());
//                        System.out.print("Do you want to add more copies of this same book? (Y/N): ");
//                        char confirmatioChoice = sc.next().charAt(0);
//
//                        if (confirmatioChoice == 'Y' || confirmatioChoice == 'y') {
//                            System.out.print("Enter number of copies to add: ");
//                            int count = sc.nextInt();
//                            existing.increaseCount(count);
//                            System.out.println("Copies updated successfully!");
//                        } else {
//                            System.out.println("Error: Cannot assign this ID to a different book. Use a new ID.");
//                        }
//                    } else {
//                        // Only if ID is new, ask for full details
//                        System.out.print("Enter Title: ");
//                        String title = sc.nextLine();
//                        System.out.print("Enter Author: ");
//                        String author = sc.nextLine();
//                        System.out.print("Enter count: ");
//                        int count = sc.nextInt();
//
//                        library.addBook(new Book(id, title, author, count),true);
//                    }
//                }


                case 2 -> {
                    int subChoice;
                    do {
                        System.out.println("\n--- Add Book ---");
                        System.out.println("1. Add or Update a book");
                        System.out.println("0. Exit to Admin Menu");
                        System.out.print("Enter choice: ");
                        subChoice = sc.nextInt();
                        sc.nextLine();

                        if (subChoice == 1) {
                            System.out.print("Enter Book ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            Book existing = library.getBookById(id);

                            if (existing != null) {
                                System.out.println("This ID already exists for: " + existing.getTitle() + " by " + existing.getAuthor());
                                System.out.print("Do you want to add more copies of this same book? (Y/N): ");
                                char confirmChoice = sc.next().charAt(0);

                                if (confirmChoice == 'Y' || confirmChoice == 'y') {
                                    System.out.print("Enter number of copies to add: ");
                                    int count = sc.nextInt();
                                    existing.increaseCount(count);
                                    System.out.println("Copies updated successfully!");
                                } else {
                                    System.out.println("Error: Cannot assign this ID to a different book. Use a new ID.");
                                }
                            } else {
                                // Only if ID is new, ask for full details
                                System.out.print("Enter Title: ");
                                String title = sc.nextLine();
                                System.out.print("Enter Author: ");
                                String author = sc.nextLine();
                                System.out.print("Enter count: ");
                                int count = sc.nextInt();

                                library.addBook(new Book(id, title, author, count), true);
                            }
                        }
                    } while (subChoice != 0);
                }




                case 3 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int bookId = sc.nextInt();
                    library.removeBook(bookId);
                }
                case 4 -> library.viewAllStudentHistory();
                case 5 -> {
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    library.addStudent(new Student(name, id));
                }
                case 6 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}