public class Work15 {

  public static void main(String[] args) {
    System.out.println("好きな科目を一行で入力してください「半角スペースを含んでも良い」");
    // 標準入力
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String name = sc.nextLine();// 改行までを1つの入力として受け付ける

    System.out.println("私は" + name + "が好きです");
    sc.close();// Scannerオブジェクトを生成したままだとメモリリークが起きるため、close()する
  }
}
