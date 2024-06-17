package p03_method;

import common.Utils;

public class Ex01declare {
  //return type : void, primitive,reference (10가지)
  //void ; return 이 없음, primitive,reference : return 을 반드시 해주어야함
  boolean b1;

  void print1() {
    return; //보통은 return을 쓰지 않음
  }

  char print2() {
    return 'C';
  }

  boolean print3() {
    return new Ex01declare().b1;
  }

  int print4() {
    return 10;
  }

  int print6() {
    return (int) 0.0;
  }

  double print5() {
    System.out.println("double");
    return 10; //return 이후의 문장은 효용 없음.
//    System.out.println("double");

  }

  boolean print() {
    boolean result = false;
    return result;
  }

  boolean print(boolean result) {
    return result;
  }

  int print(int result) {
    return result;
  }

  double print(double result) {
    return result;
  }

  char print(char c) {
    return c;
  }


  public static void main(String[] args) {
    Ex01declare e1 = new Ex01declare();
    e1.print1();
    System.out.println(e1.print2());
    System.out.println(e1.print5());
    System.out.println(e1.print()); //void
    System.out.println(e1.print(true)); //boolean
    System.out.println(e1.print('Z'));  //char
    System.out.println(e1.print(10)); //int
    System.out.println(e1.print(0.0)); //double

    MyMath m = new MyMath();
    System.out.println("SUM :" + m.sum(1, 5));
    System.out.println("SUB :" + m.sub(1, 5));
    System.out.println("MUL :" + m.mul(1, 5));
    System.out.println("DIV :" + m.div(10, 7));
    System.out.println("MOD :" + m.mod(10, 7));
    Utils.typeOf(10 / 3);
    System.out.println(10 / 7);
    System.out.println(Math.max(1, 3)); //Math 라이브러리
    //////////////////////////////////////////////////////
    System.out.println("Share :" + MyMath.share(10, 3));
    System.out.println("Remain :" + MyMath.remain(10, 3));
    MyMath.shareRemain(10, 3);
  }
}

class MyMath {
  int sum(int a, int b) {
    return a + b;
  }

  int sub(int a, int b) {
    return a - b;
  }

  int mul(int a, int b) {
    return a * b;
  }

  double div(int a, int b) {
    //double result = (double)(a/b);
    double result = a / (double) b;
    return result;
  }

  double mod(int a, int b) {
    return a % b;
  }

  public static int share(int a, int b) {
    int result = a / b;
    return result;
  }

  public static int remain(int a, int b) {
    int result = a % b;
    return result;
  }

  public static void shareRemain(int a, int b) {
    System.out.println("ShareRemain(Share) : " + share(a, b));
    System.out.println("ShareRemain(Remain) :" + remain(a, b));
  }
}