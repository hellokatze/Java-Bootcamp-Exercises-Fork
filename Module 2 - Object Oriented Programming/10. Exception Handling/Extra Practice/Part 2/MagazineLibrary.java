import java.util.ArrayList;

public class MagazineLibrary {

  private ArrayList<Magazine> magazines;

  public MagazineLibrary() {
    this.magazines = new ArrayList<>();
  }

  public Magazine getMagazine(int index) {
    return new Magazine(this.magazines.get(index));
  }
}
