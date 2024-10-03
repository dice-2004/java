public class Work34 {
  public static void main(String[] args) {
    String name;
    int age;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("あなたの名前を入力してください");
    name = sc.next();
    System.out.println("あなたの年齢を入力してください");
    age = Integer.parseInt(sc.next());
    if (age >= 18) {
      System.out.println(name + "さんは選挙権がありますね");
    } else {
      System.out.println(name + "さんは選挙権がありません");
    }
    sc.close();
  }
}
