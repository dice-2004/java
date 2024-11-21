import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    // System.out.println(args.length);
    if (args.length != 3 && args.length != 4) {
      System.out.println("旅行の行先と片道の運賃と片道の移動距離を指定してください");
      return;
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("割引率を入力");
    double discount = Double.parseDouble(sc.nextLine());
    if (args.length == 3) {
      // ベースプラン
      BasePlanT02 basePlan = new BasePlanT02(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), discount);
      System.out.printf("%10s/%8.1f/%8d円\n", basePlan.destination, basePlan.discount, basePlan.getPrice());
    } else {
      // オプションプラン
      OptionT02[] options = new OptionT02[Integer.parseInt(args[3])];
      for (int i = 0; i < Integer.parseInt(args[3]); i++) {
        System.out.println("オプション名と価格を入力");
        options[i] = new OptionT02(sc.next(), Integer.parseInt(sc.next()));
        sc.nextLine();
      }
      SetPlanT02 setPlan = new SetPlanT02(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), discount,
          options);
      System.out.printf("%10s/%8.1f/%8d円\n", setPlan.destination, setPlan.discount, setPlan.getPrice());
      for (OptionT02 option : setPlan.options) {
        option.printOption();
      }
    }
    sc.close();
  }

}
