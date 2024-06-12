package p02_variable;

import common.Utils;

public class Ex06int {
  public static void main(String[] args) {
    byte b1 = 100;
    //자신이 표현할수 있는 범위를 넘어서면 에러 발생
    //byte b2 = 200;
    byte b3 = 100;
    Utils.typeOf(b1 + b3);
    //byte b4 = b1+b3;
    byte b4 = (byte)(b1 +b3);
    System.out.println(b1 +b3);
    Utils.typeOf(b4);
    System.out.println(b4);
  }
}
