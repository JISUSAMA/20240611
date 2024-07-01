package p10_Stream;

import java.util.function.Supplier;

public class Ex06FunctionPackage {
  //일반적으로 자주 쓰이는 메서드 형식 4가지를
  //@FunctionalInterface 형태로 만듬

  public static void main(String[] args) {
    Supplier<Integer> supplier = new Supplier<Integer>() {
      @Override
      public Integer get() {
        return (int)(Math.random()*100)+1;
      }
    };
    supplier =()->{ return (int)(Math.random()*100)+1; };
    supplier =()->(int)(Math.random()*100)+1;
  }
}
