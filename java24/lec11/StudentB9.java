class StudentB9 {
  private String name;
  private int grade;

  public StudentB9(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public int setGrade(int grade) {
    return this.grade = grade;
  }

  public String toString() {
    return "名前「" + name + "」成績「" + grade + "」";
  }
}
