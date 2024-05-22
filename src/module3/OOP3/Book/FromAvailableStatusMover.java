package module3.OOP3.Book;

public class FromAvailableStatusMover extends BookMover{
    @Override
    void moveToStatus(Book book, Status requestedStatus) {
       switch (requestedStatus){
           case ARCHIVED -> book.setStatus(Status.ARCHIVED);
       }
    }
}
