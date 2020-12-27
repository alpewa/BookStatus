package BookStatuc_project;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("JAVA для чайников", Status.AVAILABLE);
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchievedStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromAvailableStatusMover();
        BookMover fromOverduedStatusMover = new FromAvailableStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromArchievedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromBorrowedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());
    }
}