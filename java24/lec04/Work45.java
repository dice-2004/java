import java.util.Scanner;

public class Work45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("自己紹介する人数を入力してください");
    int number = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < number; i++) {
      System.out.println("【" + (i + 1) + "番目】");
      // 自己紹介内容を入力・表示するメソッドの呼び出し
      introduceOneself(sc);
    }
    sc.close();
  }

  // 以下が自己紹介を入力・表示するメソッドです。
  public static void introduceOneself(Scanner sc) {
    // 自己紹介を入力させるコードを書いてください。
    System.out.println("名前と年齢を入力してください");
    String name = sc.next();
    String age = sc.next();
    sc.nextLine();
    System.out.println("好きな科目名を入力してください");
    String subject = sc.nextLine();
    // 自己紹介内容を表示するメソッドの呼び出しです。実引数を入れてください。
    showIntroduceOneself(age, name, subject);
  }

  // 以下が自己紹介を表示するメソッドです。仮引数を入れてください。
  public static void showIntroduceOneself(String age, String name, String subject) {
    // 自己紹介内容を表示するコードを書いてください。
    System.out.println("----");
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("好きな科目名は" + subject + "です");
    System.out.println("----");
  }

}
