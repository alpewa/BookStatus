package BookStatuc_project;

public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.OVERDUED)) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case OVERDUED:
                    System.out.println("уже в этом статусе");
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус BORROWED невозможен");
            }
        } else {
            System.out.println("Error , not my status");
        }
        System.out.println("Status book - " + book.getStatus());
    }
}