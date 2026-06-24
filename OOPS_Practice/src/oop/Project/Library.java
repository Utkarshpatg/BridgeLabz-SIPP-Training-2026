package oop.Project;

import java.util.*;
import java.time.*;

// Library class
class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Student, IssueRecord> currentIssues = new HashMap<>();
    private Map<Student, List<IssueRecord>> history = new HashMap<>();
    private List<Student> students = new ArrayList<>();

    public void addBook(Book book, boolean showMessage) {
        if (books.containsKey(book.getId())) {
            Book existing = books.get(book.getId());
            if (existing.getTitle().equalsIgnoreCase(book.getTitle()) &&
                    existing.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                existing.increaseCount(book.getAvailableCount());
               if(showMessage) System.out.println("Book already exists. Increased count!");
            } else {
               if(showMessage) System.out.println("Error: Book ID already exists with a different title/author. Use a new ID!");
            }
        } else {
            books.put(book.getId(), book);
            if(showMessage) System.out.println("Book added successfully!");
        }
    }


    public void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not available in stock. Please enter valid ID.");
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books.values()) {
                System.out.println(b);
            }
        }
    }

    public void issueBook(int bookId, Student student) {
        if (currentIssues.containsKey(student)) {
            System.out.println("You already have one book issued. Return it first!");
            return;
        }
        Book b = books.get(bookId);
        if (b == null) {
            System.out.println("Book not found!");
        } else if (b.getAvailableCount() == 0) {
            System.out.println("Book is out of stock. Please wait.");
        } else {
            b.issueCopy();
            IssueRecord record = new IssueRecord(bookId, LocalDate.now());
            currentIssues.put(student, record);
            history.computeIfAbsent(student, k -> new ArrayList<>()).add(record);
            System.out.println("Book issued successfully to " + student.name);
        }
    }

    public void returnBook(int bookId, Student student) {
        IssueRecord record = currentIssues.get(student);
        if (record == null || record.bookId != bookId) {
            System.out.println("You don't have this book issued!");
            return;
        }
        Book b = books.get(bookId);
        if (b != null) {
            b.returnCopy();
            record.markReturned(LocalDate.now());
            currentIssues.remove(student);
            System.out.println("Book returned successfully by " + student.name);
            if (record.fine > 0) {
                System.out.println("Fine to pay: Rs. " + record.fine);
            }
        }
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void viewAllStudentHistory() {
        if (history.isEmpty()) {
            System.out.println("No history available.");
        } else {
            for (Student s : history.keySet()) {
                System.out.println("\nHistory of " + s.name + ":");
                for (IssueRecord r : history.get(s)) {
                    System.out.println(r);
                }
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }
    public Book getBookById(int id) {
        return books.get(id);
    }

}