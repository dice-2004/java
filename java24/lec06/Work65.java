import java.util.Scanner;

public class Work65 {
  // main メソッド中の Student65Base を Student65 に変更しなさい。それ以外の箇所を修正してはいけません。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student65 s1 = new Student65();
    s1.id = 1;
    System.out.println("学生" + s1.id + "の氏名を入力");
    s1.name = sc.next();
    System.out.println("1個の整数(学生" + s1.id + "の単位数)を入力");
    s1.credits = Integer.parseInt(sc.next());

    Student65 s2 = new Student65();
    s2.id = 2;
    System.out.println("学生" + s2.id + "の氏名を入力");
    s2.name = sc.next();
    System.out.println("1個の整数(学生" + s2.id + "の単位数)を入力");
    s2.credits = Integer.parseInt(sc.next());

    System.out.println("---学生情報---");
    s1.print();
    s2.print();

    Student65 winner;
    if (s1.credits > s2.credits) {
      winner = s1;
    } else {
      winner = s2;
    }
    System.out.println("---単位数が多いのは---");
    System.out.println(winner.name);
    System.out.println(winner.getGradState());
    sc.close();
  }
}
