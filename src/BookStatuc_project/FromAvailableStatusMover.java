package BookStatuc_project;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.AVAILABLE)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case BORROWED:
                    book.setStatus(Status.BORROWED);
                    break;
                case AVAILABLE:
                    System.out.println("уже в этом статусе");
                    break;
                default:
                    System.out.println("Перевод книги из статуса AVAILABLE в статус OVERDUED невозможен");
            }
        } else {
            System.out.println("Error , not my status");
        }
        System.out.println("Status book - " + book.getStatus());
    }
}