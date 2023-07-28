public class Magazine {
  private String title;
  private String publisher;
  private int issueNumber;
  private int publicationYear;

  // Constructor
  public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
    setTitle(title);
    setPublisher(publisher);
    setIssueNumber(issueNumber);
    setPublicationYear(publicationYear);
  }

  // Copy constructor
  public Magazine(Magazine source) {
    this.title = source.title;
    this.publisher = source.publisher;
    this.issueNumber = source.issueNumber;
    this.publicationYear = source.publicationYear;
  }

  // Getters
  public String getTitle() {
    return this.title;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public int getIssueNumber() {
    return this.issueNumber;
  }

  public int getPublicationYear() {
    return this.publicationYear;
  }

  // Setters
  public void setTitle(String newTitle) {
    if (newTitle == null || newTitle.isBlank()) {
      throw new IllegalArgumentException("Title can't be null or blank.");
    }
    this.title = newTitle;
  }

  public void setPublisher(String newPublisher) {
    if (newPublisher == null || newPublisher.isBlank()) {
      throw new IllegalArgumentException("Publisher can't be null or blank.");
    }
    this.publisher = newPublisher;
  }

  public void setIssueNumber(int newIssueNumber) {
    if (newIssueNumber <= 0) {
      throw new IllegalArgumentException("Issue number must be greater than 1.");
    }
    this.issueNumber = newIssueNumber;
  }

  public void setPublicationYear(int newPublicationYear) {
    if (newPublicationYear <= 0) {
      throw new IllegalArgumentException("Publication year must be greater than 0");
    }
    this.publicationYear = newPublicationYear;
  }
}
