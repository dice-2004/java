import java.util.Scanner;

public class WorkA7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("名前を入力してください");
    String name = sc.nextLine();
    sc.close();

    UserA7 user = new UserA7(name);
    user.printInfo();

    for (int i = 0; i < name.length(); i++) {
      user.rankUp();
    }

    user.printInfo();
  }
}
