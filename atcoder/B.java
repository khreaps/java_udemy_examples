import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long[] K = new long[4];
    for(int i = 0; i < K.length; i++)
    {
        K[i] = sc.nextLong();
    }

    if (K[1] < K[2] || K[3] < K[0]){
      System.out.print("No");
      return;
    }

    System.out.print("Yes");
  }
}
