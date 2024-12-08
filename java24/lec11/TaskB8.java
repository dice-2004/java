import java.lang.reflect.Array;

public class TaskB8 {
  private String taskName;
  private double priorityLevel;

  public TaskB8(String taskName, double priorityLevel) {
    this.taskName = taskName;
    this.priorityLevel = priorityLevel;
  }

  public String getTaskName() {
    return taskName;
  }

  public double getPriorityLevel() {
    return priorityLevel;
  }

  public String toString() {
    return String.format("%s[優先度]%.1f", taskName, priorityLevel);
  }

}
