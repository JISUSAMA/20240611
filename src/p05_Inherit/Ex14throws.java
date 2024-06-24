package p05_Inherit;

public class Ex14throws {
  public static void main(String[] args) {
    method1();
    System.out.println("main");
  }

  private static void method1() {
    method2();
    System.out.println("method1");
  }

  private static void method2() {
    method3();
    System.out.println("method2");
  }

  private static void method3(){
    try {
      throw new Exception();
    } catch (Exception e) {
      //throw new RuntimeException(e);
      System.out.println("method3");
    }
  }
}
