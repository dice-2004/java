public class Work16 {

  public static void main(String[] args) {
    System.out.println("半角スペース区切りで好きな科目を2つ入力してください");
    // 標準入力
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String sub1st = sc.next();// 半角スペースまでを1つの入力として受け付ける
    String sub2nd = sc.next();// 半角スペースまでを1つの入力として受け付ける

    System.out.println("1番好きな科目は" + sub1st + "です");
    System.out.println("2番目に好きな科目は" + sub2nd + "です");
    sc.close();// Scannerオブジェクトを生成したままだとメモリリークが起きるため、close()する
  }
}
