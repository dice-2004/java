import java.util.ArrayList;
import java.util.Scanner;

public class StudentRankingB9 {
  private ArrayList<StudentB9> students = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);

  void registerStudents() {
    int flag = 0;
    while (true) {
      System.out.println("学生名を入力してください「何も入力せずに改行すると入力を終了します」");
      String name = sc.nextLine();
      if (name.isEmpty()) {
        break;
      }
      for (StudentB9 student : students) {
        if (student.getName().equalsIgnoreCase(name)) {
          System.out.println("既に登録されています");
          flag = 1;
          break;
        }
      }
      if (flag == 1) {
        flag = 0;
        continue;
      }
      StudentB9 student = new StudentB9(name);
      students.add(student);
    }
  }

  public void inputGrades() {
    for (StudentB9 student : students) {
      while (true) {
        System.out.println(student.getName() + "の成績を入力してください「0-100の範囲で入力してください」");
        int grade = sc.nextInt();
        sc.nextLine();
        if (grade >= 0 && grade <= 100) {
          student.setGrade(grade);
          break;
        } else {
          System.out.println("成績が範囲外です「0-100の範囲で入力してください」");
        }
      }
    }
  }

  void showStudents() {
    System.out.println("成績順に学生を表示します");
    students.sort((a, b) -> b.getGrade() - a.getGrade());
    for (StudentB9 student : students) {
      System.out.println(student);
    }
  }
}
