import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  public void addBook(Book book) {
    this.books.add(new Book(book));
  }

  public boolean contains(Book book) {
    return this.books.contains(book);
  }

  public void sellBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        this.books.remove(book);
      }
    }
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Store)) {
            return false;
        }
        Store store = (Store) o;
        return Objects.equals(books, store.books);
  }

  @Override
  public int hashCode() {
    return Objects.hash(books);
  }

}
