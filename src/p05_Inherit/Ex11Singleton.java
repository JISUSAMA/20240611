package p05_Inherit;

public class Ex11Singleton {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
//    Singleton s1 = new Singleton();
//    Singleton s2 = new Singleton();
    System.out.println(s1);
    System.out.println(s2);
  }
}
//인스턴스를 하나만 사용 할수 있게 만들고 싶음
class Singleton{
  private static Singleton singleton;
  private Singleton() {
  }
  static public Singleton getInstance(){
    if(singleton == null){
      singleton = new Singleton();
    }
    return singleton;
  }
}