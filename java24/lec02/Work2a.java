public class Work2a {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int preN = 0;
    int N = 1;
    int NexN = preN + N;

    while (NexN <= 5000) {
      if (preN == 0) {
        System.out.print(preN + "," + N + ",");
      }
      System.out.print(NexN + ",");
      preN = N;
      N = NexN;
      NexN = preN + N;
    }
    System.out.println("");
    sc.close();
  }
}
