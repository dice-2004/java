public class Work33 {
  public static void main(String[] args) {
    String year = "2024";
    int y=Integer.parseInt(year);
    int age;
    int inp;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("あなたの年齢を入力してください");
    age = Integer.parseInt(sc.next());
    System.out.println("今年誕生日が来ている場合は0をまだ来ていない場合は1を入力してください");
    inp = Integer.parseInt(sc.next());
    System.out.println("あなたは" + (y - age - inp) + "年生まれですね");
    sc.close();
  }
}
