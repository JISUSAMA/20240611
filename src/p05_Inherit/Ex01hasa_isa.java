package p05_Inherit;

public class Ex01hasa_isa {
  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child.familyName);
    Parent parent = new Parent();
    System.out.println(parent.familyName);
    Car car = new Car();
    System.out.println(car.engine);
    Engine engine = new Engine();
    System.out.println(engine);
  }
}

//has-a 관계 : Car는 Engine을 가지고 있을 뿐이지, car와 engine은 공통된 속성과 기능을 가지지 않음(비공유)
class Car {
  Engine engine = new Engine();
}

class Engine {
int gitong;
}

//is-a 관계 :parent와 chile는 공통된 속성과 기능을 공유한다
class Parent {
  String familyName;

}

class Child extends Parent {

}
