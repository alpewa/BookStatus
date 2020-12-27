package BookStatuc_project;

public class Book {
    private String title;
    private Status status = Status.ARCHIVED;

    public Book(String title, Status status) {
        this.title = title;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }
}