package oop.Project;


// Book class with availability count
class Book {
    private int id;
    private String title;
    private String author;
    private int availableCount;

    public Book(int id, String title, String author, int count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availableCount = count;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getAvailableCount() { return availableCount; }

    public void increaseCount(int n) { availableCount += n; }
    public boolean issueCopy() {
        if (availableCount > 0) {
            availableCount--;
            return true;
        }
        return false;
    }
    public void returnCopy() { availableCount++; }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + availableCount;
    }
}
