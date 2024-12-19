
// 必要に応じてimport文を追加する
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WorkC8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      CipherC8 cipher = parseCommandLineArguments(args);
      System.out.println("解読するファイル名を入力してください");
      String fname = sc.nextLine();
      Path inputFilePath = Paths.get(fname);
      // inputFilePathからすべての行を読み込む

      List<String> lines = Files.readAllLines(inputFilePath);
      // 1行ずつ取り出し、デコードして出力する
      for (String line : lines) {
        try {
          System.out.println(cipher.decrypt(line));
        } catch (Exception e) {
          System.out.println(e.getMessage());
          return;
        }

      }
    } catch (IllegalArgumentException e) {
      System.out.println("引数に鍵を指定してください");
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました");
    }

    sc.close();

  }

  public static CipherC8 parseCommandLineArguments(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("1つのコマンドライン引数が必要です");
    }
    return new CipherC8(args[0]);
  }

}
