public class Work25 {
  public static void main(String[] args) {
    String input1;
    String input2;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    input1 = scanner.next();
    input2 = scanner.next();
    if (input1.equals(input2)) {
      System.out.println("1番目と2番目の文字列は等しいです。");
    } else {
      System.out.println("1番目と2番目の文字列は違います。");
    }
    scanner.close();

  }
}
