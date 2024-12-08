import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);

    // ArrayListのインスタンスを作成
    ArrayList<String> studentList = new ArrayList<>();

    // 入力を促すメッセージ
    System.out.println("学生名を入力してください");
    System.out.println("endと入力すると終了します");

    // 入力された学生名をArrayListに追加（endが入力されるまで）
    while (true) {
      String studentName = scanner.nextLine();
      if (studentName.equals("end")) {
        break;
      }
      studentList.add(studentName);
    }

    // ArrayListの要素の調査
    System.out.println("学生名一覧");
    for (String studentName : studentList) {
      System.out.println(studentName);
    }
    // 入力を促すメッセージ
    System.out.println("削除する学生名を入力してください");

    // 入力された学生名（文字列）を取得
    String deleteStudentName = scanner.nextLine();

    // ArrayListから指定された学生名を削除
    if (studentList.contains(deleteStudentName)) {
      studentList.remove(studentList.indexOf(deleteStudentName));
      System.out.println(deleteStudentName + "を削除しました");
    } else {
      System.out.println("指定された学生名はArrayListに存在しません");
    }

    // ArrayListの要素の調査
    System.out.println("学生名一覧「削除後」");
    for (String studentName : studentList) {
      System.out.println(studentName);
    }
    // Scannerクラスのインスタンスをクローズ
    scanner.close();
  }
}
