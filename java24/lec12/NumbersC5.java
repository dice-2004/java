import java.util.Random;
import java.util.Scanner;

public class NumbersC5 {
  private Random random;

  public NumbersC5(int seed) {
    random = new Random(seed);
  }

  public void playGame(Scanner sc) {
    int answer = random.nextInt(99) + 1;

    System.out.println("「数当てゲーム」");
    int count = 5;
    System.out.println("「1～99の数を" + count + "回以内に当ててください」");
    while (count > 0) {
      System.out.println("「あと" + count + "回入力できます」");

      // 予想に整数値以外が入力されても終了せずにゲームを続ける
      try{
        int expect = Integer.parseInt(sc.nextLine());
        if (judge(answer, expect)) {
          return;
        }
        count--;
      }catch(NumberFormatException e){
        System.out.println("「整数値以外が入力されました」");
      }
    if (count == 0) {
      System.out.println("「残念」");
    }
      }

  }

  private boolean judge(int answer, int expect) {
    if (expect == answer) {
      System.out.println("「正解」");
      return true;
    }
    if (expect > answer) {
      System.out.println("「もっと小さいです」");
    } else {
      System.out.println("「もっと大きいです」");
    }
    return false;
  }
}
