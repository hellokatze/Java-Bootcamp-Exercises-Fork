public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.

      for (int i = 99; i >= 1; i--) {
        sing(i);
      }
    }

    public static void sing(int numberBeers) {
      System.out.println(numberBeers + " bottles of beer on the wall, " + numberBeers + " bottles of beer!" + "\ntake one down, pass it around, " + (numberBeers - 1) + " bottles of beer on the wall!");
    }

}
