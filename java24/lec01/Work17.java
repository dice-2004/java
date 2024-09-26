import java.util.Scanner;

public class Work17 {

  public static void main(String[] args) {
    System.out.println("0以上1000以下の整数値を入力してください");
    Scanner sc = new Scanner(System.in);
    int inputValue;
    inputValue = Integer.parseInt(sc.next());

    if (inputValue >= 1000) {
      System.out.println("入力は4桁");
    } else if (inputValue >= 100) {
      System.out.println("入力は3桁");
    } else if (inputValue >= 10) {
      System.out.println("入力は2桁");
    } else {
      System.out.println("入力は1桁");
    }
    sc.close();// Scannerオブジェクトを生成したままだとメモリリークが起きるため，必ずclose()する
  }
}
