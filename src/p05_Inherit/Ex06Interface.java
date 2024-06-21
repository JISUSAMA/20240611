package p05_Inherit;
public class Ex06Interface {
  public static void main(String[] args) {
    Athlete athlete = new Athlete();
    System.out.println();
  }
}
// java에서는 다중상속이 안된다. 그래서, interface를 사용한다
// 앞에 i 를 붙이거나 끝에able을 붙이면서 interface를 사용하겠다는 의미이다  -> 약속
class Athlete implements ISwim, IBicycle {
  @Override
  public void swim() {
    //interface의 중복된 상수는 static 이 붙어 있기 때문에 클래스와 함께 지정
    System.out.println(ISwim.Level);
  }
  public void ride() {
    Trianthlon.start(); //interface 의 static 메서드 호출
  }
}
interface Trianthlon extends  ISwim,IBicycle,IMarathone{
  public default  void complete(){
    swim(); ride(); run();
  }
  public static  void start(){
    System.out.println("출발!");
  }
}
//interface는 추상자료형. 반드시 class에서 implements 후에 사용
//목적: 클래스들이 구현해야하는 동작을 보안하기 위해 사용
//장점: 표준화가 가능
interface ISwim {
  //추상메서드와 상수만 정의(static, default 메서드 추가)
  public abstract void swim();
  public static final int Level =10;
}
interface IBicycle {
  void ride();
  int Level =30;
}
interface IMarathone{
  void run();
}