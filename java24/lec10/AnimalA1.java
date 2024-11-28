public abstract class AnimalA1 {
  String name;

  public abstract void makeSound();

  public void run() {
    System.out.print(this.name + "は");
    makeSound();
    System.out.println("と鳴きながら走ります");
  }
}
