import java.util.Scanner;

public class WorkA6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("名前を入力してください");
    String name = sc.nextLine();
    System.out.println("ランクを入力してください");
    int rank = Integer.parseInt(sc.nextLine());
    sc.close();

    UserA6 user = new UserA6();

    // setterを用いて、userの名前をnameに、ランクをrankに設定する
    user.setName(name);
    user.setRank(rank);
    printUserInfo(user);
  }

  public static void printUserInfo(UserA6 user) {
    // getterを用いて、userの名前とランクを出力する
    System.out.println(user.getName() + "のランクは" + user.getRank() + "です");
  }
}
