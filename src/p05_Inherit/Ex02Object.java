package p05_Inherit;

public class Ex02Object {
  public static void main(String[] args) {
    Member m1 = new Member("LGH", "010-3446-5555");
    System.out.println(m1);
    System.out.println(m1 instanceof Object);
    System.out.println(m1 instanceof Member);
  }
}
//모든 클래스는 Object를 상속 받는다
//상속 할 경우에는 Memeber 변수와 method 만 상속
class Member extends Object {
  String name, mobile;

  public String toString() {
    return String.format("Name : %s , Mobile : %s", name, mobile);
  }

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }
}

class Phone {
  int key;
}

class Computer {
  int key;
}

//자바에서는 다중상속을 허용하지 않음(명확하지 않을 수 있기 때문에)
//class SmartPhone extends Phone, Computer {  }