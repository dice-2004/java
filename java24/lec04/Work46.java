public class Work46 {
  public static void main(String[] args) {
    // 割られる方の値（分子）の候補
    int[] numers = { 2, 0, 3, 1 };
    // 割る方の値（分母）の候補
    int[] denoms = { 5, 0, 2 };

    System.out.print("numers: ");
    for (int i = 0; i < numers.length; i++) {
      System.out.print(numers[i] + " ");
    }
    System.out.print("\ndenoms: ");
    for (int i = 0; i < denoms.length; i++) {
      System.out.print(denoms[i] + " ");
    }
    System.out.println();

    for (int denom : denoms) {
      if (denom == 0) {
        // ゼロ割のときの表示と処理のコードを書いてください。
        System.out.println("ゼロ割になるのでスキップします");
        continue;
      }
      for (int numer : numers) {
        // ゼロ割でないときの処理コードを書いてください。
        System.out.println(numer + "÷" + denom + "=" + (double) numer / denom);
      }
    }
  }
}
