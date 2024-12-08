import java.util.Scanner;

public class WorkB8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TaskListB8 taskList = new TaskListB8();
    while (true) {
      while (true) {
        System.out.println("タスク名を入力してください「終了するには空のまま Enter キーを押してください」");
        String taskName = scanner.nextLine();
        if (taskName.equals("")) {
          taskList.printAllTasks();
          break;
        }
        System.out.println("優先度を入力してください");
        double priorityLevel = Double.parseDouble(scanner.nextLine());
        taskList.addTask(taskName, priorityLevel);
      }
      System.out.println("タスクを追加しますか[y/n]");
      String answer = scanner.nextLine();
      if (answer.equals("n")) {
        break;
      }
    }

    scanner.close();
  }
}
