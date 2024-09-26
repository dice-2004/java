public class Work2b {
  public static void main(String[] args) {
    System.out.println("  |  1  2  3  4  5  6  7  8  9");
    System.out.println("--+---------------------------");
    for (int x = 1; x <= 9; x++) {
      System.out.print(x + " |");
      for (int y = 1; y <= 9; y++) {
        System.out.printf("%3d",x*y);
      }
      System.out.println("");
    }
    System.out.println("");
  }
}
