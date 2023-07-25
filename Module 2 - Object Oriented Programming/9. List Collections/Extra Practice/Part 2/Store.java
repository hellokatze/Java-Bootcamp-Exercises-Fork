import java.util.ArrayList;
import java.util.List;

public class Store {

  private ArrayList<Book> books;

  public Store() {
    this.books = new ArrayList<>();
  }

  public Book getBook(int index) {
    return new Book(books.get(index));
  }

  public void setBook(Book book, int index) {
    this.books.set(index, new Book(book));
  }

}
