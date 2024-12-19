import java.util.Random;

public class WorkC2 {
  private static int seed = 0;

  public static void main(String[] args) {
    // try-catchを利用して例外処理を実装する
    try {
      parseCommandLineArguments(args);
      Random random = new Random(seed);
      int answer = random.nextInt(99) + 1;
      System.out.println(answer);
    }catch (NumberFormatException e) {
      System.out.println("乱数の種に整数値以外が指定されました");
    }catch (IllegalArgumentException e) {
      System.out.println("乱数の種を指定してください");
    }
  }

  // コマンドライン引数の1つ目を数値に変換してseedに代入するメソッド
  // このメソッドはそのまま使用する（変更してはいけない）
  public static void parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("コマンドライン引数が指定されていません");
    }
    seed = Integer.parseInt(args[0]);
  }
}
