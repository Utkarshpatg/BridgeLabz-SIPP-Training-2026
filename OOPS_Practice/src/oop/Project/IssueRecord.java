package oop.Project;

import java.time.*;

// Record for Issue details
class IssueRecord {
    int bookId;
    LocalDate issueDate;
    LocalDate returnDate;
    long fine;

    IssueRecord(int bookId, LocalDate issueDate) {
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.returnDate = null;
        this.fine = 0;
    }

    void markReturned(LocalDate returnDate) {
        this.returnDate = returnDate;
        long days = Duration.between(issueDate.atStartOfDay(), returnDate.atStartOfDay()).toDays();
        if (days > 14) {
            fine = days - 14;
        }
    }

    @Override
    public String toString() {
        if (returnDate == null) {
            return "Book ID: " + bookId + ", Issued: " + issueDate + " (Not Returned Yet)";
        } else {
            return "Book ID: " + bookId + ", Issued: " + issueDate + ", Returned: " + returnDate + ", Fine: " + fine;
        }
    }
}
