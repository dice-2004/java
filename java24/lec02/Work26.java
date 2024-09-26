public class Work26 {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("中間試験と期末試験の点数をそれぞれ入力してください。");
    int score1 = sc.nextInt();
    int score2 = sc.nextInt();

    if ((score1 >= 60) && (score2 >= 60)) {
      System.out.println("合格");
    } else if (score1 + score2 >= 130) {
      System.out.println("合格");
    } else if ((score1 + score2 >= 120) && ((score1 >= 90) || (score2 >= 90))) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }

    sc.close();
  }
}
