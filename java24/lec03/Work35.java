import java.util.Arrays;

public class Work35 {
  public static void main(String[] args) {
    int[] weights = { 22, 10, 1, 5, 6 };
    Arrays.sort(weights); // 冒頭にimport文を追加し、この行が「Arrays.sort(weights);」で動くようにする
    for (int i = 0; i < weights.length; i++) {
      System.out.println(weights[i]);
    }
  }
}
