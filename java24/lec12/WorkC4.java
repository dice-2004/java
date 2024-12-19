import java.util.Random;
import java.util.Scanner;

public class WorkC4 {
  public static void main(String[] args) {
    try {
      int num = parseCommandLineArguments(args);
      Random random = new Random(num);
      playGame(random);
    } catch (NumberFormatException e) {
      System.out.println("「乱数の種に整数値以外が指定されました」");
    } catch (IllegalArgumentException e) {
      System.out.println("「乱数の種が指定されていません」");
    } catch (Exception e) {
      System.out.println("「エラーが発生しました」");
    }
  }

  public static void playGame(Random random) {
    int answer = random.nextInt(99) + 1;
    System.out.println("「Scannerをオープンします」");
    Scanner sc = new Scanner(System.in);
    System.out.println("「1～99の数を入力してください」");
    try {
      int expect = Integer.parseInt(sc.nextLine());
      judge(answer, expect);
    } catch (NumberFormatException e) {
      System.out.println("「整数値以外が入力されました」");
    } finally {
      System.out.println("「Scannerをクローズします」");
      sc.close();
    }
  }

  // コマンドライン引数の1つ目を数値に変換して返すメソッド
  // このメソッドはそのまま使用する（変更してはいけない）
  public static int parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("1つのコマンドライン引数が必要です");
    }
    int num = Integer.parseInt(args[0]);
    return num;
  }

  // 結果を判定するメソッド
  // このメソッドはそのまま使用する（変更してはいけない）
  public static void judge(int answer, int expect) {
    if (expect == answer) {
      System.out.println("「正解です」");
    } else if (expect > answer) {
      int r = answer * 10 / expect;
      System.out.println("「正解は予想の約" + r + "割です」");
    } else {
      int r = answer / expect;
      System.out.println("「正解は予想の約" + r + "倍です」");
    }
  }
}
