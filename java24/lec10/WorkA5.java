public class WorkA5 {
  public static void main(String[] args) {
    int energy = Integer.parseInt(args[0]);
    int num = Integer.parseInt(args[1]);
    HareA5 hare = new HareA5(energy);
    TortoiseA5 tortoise = new TortoiseA5();

    for (int i = 1; i <= num; i++) {
      System.out.println("ターン" + i);
      turn("うさぎ", hare);
      turn("かめ", tortoise);
    }
  }

  public static void turn(String name, AnimalA5 animal) {
    System.out.print(name + "は");
    animal.move();
  }
}
