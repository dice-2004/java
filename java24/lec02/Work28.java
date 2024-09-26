public class Work28 {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("点数を入力してください。");
    int score = sc.nextInt();
    char grade = 'F';
    switch (score / 10) {
      case 10 -> {
        grade = 'S';
      }
      case 9 -> {
        grade = 'A';
      }
      case 8 -> {
        grade = 'B';
      }
      case 7 -> {
        grade = 'C';
      }
      case 6 -> {
        grade = 'D';
      }
    }
    System.out.println(score + "点は" + grade + "です。");
    sc.close();
  }
}
