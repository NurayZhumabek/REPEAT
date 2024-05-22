package module3.OOP3.Book;

public class Book {
    String title;
    Status status;

    public Book(String title ) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", status=" + status +
                '}';
    }
}
