import java.util.Scanner;

public class Work68 {
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
      System.out.println("---平均単位数---");
      System.out.printf("%.1f\n", calcAverageCredits(students));
      int noGood = students.length - countGoodStudents(students);
      if (noGood == 0) {
        System.out.println("卒業可能でない学生はいません");
      } else {
        Student65[] noGoodStudents = new Student65[noGood];
        getNoGoodStudents(students, noGoodStudents);
        System.out.println("---卒業可能でない学生情報---");
        printStudents(noGoodStudents);
        System.out.println("---平均単位数---");
        System.out.printf("%.1f\n", calcAverageCredits(noGoodStudents));
      }
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

  // 仮引数 students に格納された学生のうち、卒業可能な人数を返す。
  // 仮引数の Student65Base を Student65 に変更しなさい。
  public static int countGoodStudents(Student65[] students) {
    int count = 0;
    for (Student65 student : students) {
      if (student.checkGraduate()) {
        count += 1;
      }
    }
    return count;
  }

  // 仮引数 students に格納された学生のうち、卒業できない学生を 仮引数 noGood に格納する。
  // 仮引数の Student65Base を Student65 に変更しなさい。
  public static void getNoGoodStudents(Student65[] students, Student65[] noGood) {
    int index = 0;
    for (Student65 student : students) {
      if (!student.checkGraduate()) {
        noGood[index] = student;
        index += 1;
      }
    }
  }

  // 仮引数 students に格納された学生平均取得単位数を計算して返却する。
  // 仮引数の Student65Base を Student65 に変更しなさい。
  public static double calcAverageCredits(Student65[] students) {
    int sum = 0;
    for (Student65 student : students) {
      sum += student.credits;
    }
    return (double) sum / students.length;
  }
}
