public class CipherC8 {
  private String key;

  public CipherC8(String key) {
    this.key = key;
  }

  public String decrypt(String cipherText) throws Exception {
    StringBuilder plainText = new StringBuilder();
    for (int i = 0; i < cipherText.length(); i++) {
      char c = cipherText.charAt(i);
      char k = key.charAt(i % key.length());
      // 「ヴィジュネル暗号」のルールにしたがって解読する
      int cValue = c - 'A';
      if (cValue == 32 - 'A') {
        plainText.append(' ');
        continue;
      } else if (cValue > 25) {
        throw new Exception("???");
      }
      // System.out.println(cValue);
      int kValue = k - 'a';
      // System.out.println(kValue);
      // System.out.println();
      int pValue = cValue - kValue;
      if (pValue < 0) {
        pValue += 26;
      }
      char p = (char) ('A' + pValue);
      plainText.append(p);

    }

    // 解読した文章を文字列にして返す
    return plainText.toString();
  }
}
