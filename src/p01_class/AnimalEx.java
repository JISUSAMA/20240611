package p01_class;

//클래스는 오직 설계만 가능
public class AnimalEx {
    Animal animal2 = new Animal();
//  Quiz) Animal을 신스턴스로 만들어 사용해보시오
  public void done() {
    Animal animal = new Animal();
    animal.Run();
  }

  //JVM 이 사용함 ,클래스는 메인 메서드에서 불러졌을 때 사용이 된다
  public static void main(String[] args) {
    //실행 방법 1
    Animal animal = new Animal();
    animal.Run();
    //실행 방법 2
    AnimalEx ex = new AnimalEx();
    ex.done();
    ex.animal2.Run();
  }
}
