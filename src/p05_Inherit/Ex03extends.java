package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marin m1 = new Marin();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
    //
    Prove p1 = new Prove();
    System.out.println(p1);
    Zealot z1= new Zealot();
    System.out.println(z1);
    //
    Drone  d1 = new Drone();
    System.out.println(d1);
    Larva lav1 = new Larva();
    System.out.println(lav1);

  }
}

//abstract 추상적인 클래스

abstract class Unit {
  public Unit(){
    //this(), super()는 항상위(맨첫줄)에 있어야 하기 떄문에 두개를 동시에 사용이 불가능하다
    super();
    //this("","",15);
    System.out.println("야생 동물 생성");
  }
  public Unit(String tribe,String uName, int hp){
    super();
    this.tribe = tribe;
    this.hp = hp;
    this.unitName = uName ;
  }
  int hp;
  String tribe;
  String unitName;

  @Override
  public String toString() {
    return String.format("%s{hp=%d , tribe = %s}",unitName,hp,tribe) ;
  }

  public void mov(int x, int y)
  {

  }

  public void stop()
  {

  }
}
//abstract 를 사용하면 new/인스턴스 를 사용하지 못함
abstract class Terran extends Unit {
  //상속 할 경우에는 Memeber 변수와 method 만 상속
  public Terran(String uName, int hp) {
    //첫줄에 " super() = 부모를 가리킴 "가 숨어있음
    super("Terran",uName,hp); //Unit을 가리키고 있음
  }
  public void Shild(){

  }
}
abstract class Shild{

}
class Marin extends Terran {
  public Marin() {
    super("Marin",60);

  }
}
class Medic extends Terran {
  public Medic() {
    super("Medic",45);

  }
}

abstract class Protoss extends Unit{
  //String tribe,String uName, int hp
  public Protoss(String uName,int hp){
    super("Protoss",uName,hp);
  }
}
class Prove extends Protoss{
  public Prove(){
    super("Prove",20);
  }
}
class Zealot extends Protoss{
  public Zealot() {
    super("Zealot", 100);
  }
}
abstract class Zerg extends Unit{
  public Zerg(String uName, int hp) {
    super("Zerg", uName, hp);
  }
}
class Drone extends Zerg{
  public Drone() {
    super("Drone",40);
  }
}
class Larva extends Zerg{
  public Larva() {
    super("Larva",25);
  }
}