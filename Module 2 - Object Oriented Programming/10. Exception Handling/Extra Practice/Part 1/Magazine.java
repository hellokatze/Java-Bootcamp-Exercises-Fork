public class Magazine {
  private String title;
  private String publisher;
  private int issueNumber;
  private int publicationYear;

  // Constructor
  public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
    this.title = title;
    this.publisher = publisher;
    this.issueNumber = issueNumber;
    this.publicationYear = publicationYear;
  }

  // Copy constructor
  public Magazine(Magazine source) {
    this.title = source.title;
    this.publisher = source.publisher;
    this.issueNumber = source.issueNumber;
    this.publicationYear = source.publicationYear;
  }
}
