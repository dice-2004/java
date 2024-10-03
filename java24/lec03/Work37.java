import java.util.Scanner;

public class Work37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int m;
    System.out.println("整数の値を入力してください");
    a = Integer.parseInt(sc.nextLine());
    System.out.println("整数の値を入力してください");
    b = Integer.parseInt(sc.nextLine());
    m = Math.min(a, b);
    System.out.println(a + "と" + b + "と比較して小さい方は" + m);
    sc.close();
  }
}
