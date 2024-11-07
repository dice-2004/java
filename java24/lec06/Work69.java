import java.util.Scanner;

public class Work69 {
  // main メソッド中の Student65Base を Student65 に変更しなさい。
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = 2;
    int max = 4;
    System.out.println(min + "から" + max + "の整数を1個入力");
    int n = Integer.parseInt(sc.next());
    if (n < min || n > max) {
      System.out.println(min + "から" + max + "の整数を1個入力してください");
    } else {
      Student65[] students = new Student65[n];
      for (int i = 0; i < n; i++) {
        students[i] = new Student65();
        students[i].id = i + 1;
        System.out.println("学生" + students[i].id + "の氏名を入力");
        students[i].name = sc.next();
        System.out.println("1個の整数(学生" + students[i].id + "の単位数)を入力");
        students[i].credits = Integer.parseInt(sc.next());
      }
      System.out.println("---学生情報---");
      printStudents(students);

      sortStudents(students);
      System.out.println("---単位数降順---");
      printStudents(students);
    }
    sc.close();
  }

  // 仮引数 students に格納された学生の情報を次の形式で出力する。
  // "_"は半角スペースを表している。スペースの個数は表示する文字数によって変わる。
  // 書式指定は Student65 の print と同じ。
  // 1,____Alex,120単位,卒業まで__4単位必要
  // 2,Jeanette,_18単位,卒業まで106単位必要
  // ・・・
  // 仮引数の Student65Base を Student65 に変更しなさい。
  public static void printStudents(Student65[] students) {
    for (Student65 student : students) {
      student.print();
    }
  }

  // 仮引数 students に格納された学生を選択ソートによって取得単位の降順に並べ替える。
  // 仮引数の Student65Base を Student65 に変更しなさい。
  public static void sortStudents(Student65[] students) {
    for (int i = 0; i < students.length - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < students.length; j++) {
        if (students[j].credits > students[maxIndex].credits) {
          maxIndex = j;
        }
      }
      Student65 temp = students[i];
      students[i] = students[maxIndex];
      students[maxIndex] = temp;
    }
  }
}
