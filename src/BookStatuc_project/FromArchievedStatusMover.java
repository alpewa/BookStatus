package BookStatuc_project;

public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.ARCHIVED)) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус BORROWED или OVERDUED невозможен");
            }
        } else {
            System.out.println("Error , not my status");
        }
        System.out.println("Status book - " + book.getStatus());
    }
}