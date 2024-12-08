import java.util.ArrayList;

public class TaskListB8 {
  private ArrayList<TaskB8> tasks = new ArrayList<>();

  // タスクを追加する。既に同じ名前または優先度のタスクが存在する場合は追加しない
  public void addTask(String taskName, double priorityLevel) {
    // 既存のタスク名または優先度を確認する
    for (TaskB8 task : tasks) {
      if (task.getTaskName().equals(taskName)) {
        System.out.println("タスクは既に存在します");
        return;
      } else if (task.getPriorityLevel() == priorityLevel) {
        System.out.println("優先度は既に存在します");
        return;
      }
    }
    // 新しいタスクを追加する
    TaskB8 newTask = new TaskB8(taskName, priorityLevel);
    tasks.add(newTask);

  }

  // 優先度順にソートしてすべてのタスクを表示する
  public void printAllTasks() {
    // 優先度順にソートする
    tasks.sort((task1, task2) -> Double.compare(task1.getPriorityLevel(), task2.getPriorityLevel()));
    // タスクを表示する
    int count = 1;
    for (TaskB8 task : tasks) {
      System.out.print(" " + count);
      System.out.println(task);
      count++;
    }
  }
}
