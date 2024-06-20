package p05_Inherit;

public class Ex03extentds {
  public static void main(String[] args) {
    Marin m1 = new Marin();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

//abstract 추상적인 클래스
abstract class Unit {
  public Unit(String tribe, int hp){
    super();
    this.tribe = tribe;
    this.hp = hp;
  }
  int hp;
  String tribe;


  @Override
  public String toString() {
    return String.format("Unit{hp=%d , tribe = %s}", hp,tribe) ;
  }

  public void mov(int x, int y) {
  }

  public void stop() {
  }
}

abstract class Terran extends Unit {
  //상속 할 경우에는 Memeber 변수와 method 만 상속
  public Terran(int hp) {
    //첫줄에 " super() = 부모를 가리킴 "가 숨어있음
    super("Terran",hp); //Unit을 가리키고 있음
  }

}

class Marin extends Terran {
  public Marin() {
    super(60);
  }
}
class Medic extends Terran {
  public Medic() {
    super(45);
  }
}

