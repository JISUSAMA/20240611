package p03_method;

public class Ex10while {
  public static void main(String[] args) {
    //조건, 명령
    int i = 0;
    int sum = 0;
    while (i < 10) {
      // sum +=i;
      // i++;
      sum += i++;
    }
    i = 2;
    int j = 1;
    while (j < 10) {
      i = 2;
      while (i < 10) {
        System.out.printf("%d * %d = %2d \t", i, j, i++ * j);
      }
      j++;
      System.out.println();
    }
  }
}
