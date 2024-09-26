public class Work29 {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("数字の個数を入力してください。");
    int n = sc.nextInt();
    System.out.println(n + "個の数字を入力してください。");
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (double) sc.nextInt();
    }
    System.out.println("平均は" + (sum / n) + "です。");
    sc.close();
  }
}
