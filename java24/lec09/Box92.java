public class Box92 {
  public int height; // 直方体の高さ
  public int width; // 直方体の幅
  public int depth; // 直方体の奥行き

  // 高さ、幅、奥行きから体積を求めて返却する。
  public int calcVolume() {
    return height * width * depth;
  }

  // 高さ、幅、奥行き、体積を実行例のように表示する。表示には`System.out.printf`を用い、書式指定は次の通り。
  // 高さ、幅、奥行き・・・修飾なし、整数4桁。
  // 体積・・・修飾なし、整数5桁。
  public void printData() {
    System.out.printf("H%4d/W%4d/D%4d/V%5d\n", height, width, depth, calcVolume());
  }
}
