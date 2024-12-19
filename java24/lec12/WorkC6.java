import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WorkC6 {
  private static String fname = null;

  public static void main(String[] args) {
    try {
      parseCommandLineArguments(args);
      Path inputFilePath = Paths.get(fname);
      List<String> lines = Files.readAllLines(inputFilePath);
      int i = 1;
      for (String line : lines) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (String cell : line.split(",")) {
          data.add(Integer.parseInt(cell));
        }
        System.out.printf("%d: %.1f\n", i, calcAverage(data));
        i++;
      }
    } catch (NumberFormatException e) {
      System.out.println("整数値以外のデータが含まれています");
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました");
    }
    catch (IllegalArgumentException e) {
      System.out.println("CSVファイルのファイル名を指定してください");
    }
  }

  // データ（整数値のリスト）を受け取って平均を計算するメソッド
  public static double calcAverage(ArrayList<Integer> data) {
    double ave = 0.0;
    for (int i = 0; i < data.size(); i++) {
      ave += data.get(i);
    }
    ave /= data.size();
    return ave;
  }

  // コマンドライン引数の1つ目の文字列を取得して返すメソッド
  // このメソッドはそのまま使用する（変更してはいけない）
  public static void parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("コマンドライン引数が指定されていません");
    }
    fname = args[0];
  }
}
