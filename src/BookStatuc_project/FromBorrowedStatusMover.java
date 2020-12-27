package BookStatuc_project;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED) {
            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(Status.AVAILABLE);
                    break;
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    break;
                case OVERDUED:
                    book.setStatus(Status.OVERDUED);
                    break;
                case BORROWED:
                    System.out.println("уже в этом статусе");
                    break;
                default:
                    System.out.println("Перевод книги достпуен во все статусы");
            }
        } else {
            System.out.println("Error , not my status");
        }
        System.out.println("Status book - " + book.getStatus());
    }
}