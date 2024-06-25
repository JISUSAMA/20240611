package p05_Inherit;

public class Ex15MyException {
  public static void main(String[] args) {
    try {
      throw new MyException("내가 발생 시킨 에외");
    } catch (MyException e) {
      //throw new RuntimeException(e);
      System.out.println(e.getMessage());
    }
  }
}
class MyException extends Exception{
  public MyException(String message) {
    super(message);
  }
}
