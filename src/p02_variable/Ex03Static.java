package p02_variable;

public class Ex03Static {
  static int vs; int vi;
  private void Foo() {
    System.out.println(vi + vs);
  }
  // {} 초기화 구간
  {
    System.out.println("인스턴스 실행됨");
  }
  static {
    System.out.println("한번만 실행됨");
  }

  //static 은 main() 가 실행되기 전 method area에 로드됨

  //static은 공통의 값을 가지고 instance 값은 각각의 값을 가짐
  public static void main(String[] args) {
    Ex03Static ex1 = new Ex03Static();
    Ex03Static ex2 = new Ex03Static();
    ex1.vi =10;
    System.out.println(ex1.vi);
    ex2.vi =20;
    System.out.println(ex1.vi);
    ex1.vs =100;
    System.out.println(ex1.vs);
    ex2.vs =200;
    System.out.println(ex1.vs);
  }
}
