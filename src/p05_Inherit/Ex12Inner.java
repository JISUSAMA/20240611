package p05_Inherit;

public class Ex12Inner {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner oi = new Outer().new Inner();
    System.out.println(oi.iv);
    //static
    Outer.InnerStatic ois = new Outer.InnerStatic();
    System.out.println(ois.isv);
    Outer.InnerInterface oii = new Outer.InnerInterface(){
      @Override
      public void innerMethod() {

      }
    };
    System.out.println(oii);
  }
}

class Outer {
  class Inner {
    int iv = 100;
  }
  void outerMethod() {
    class LocalInner {
      int localInnerVar = 300;

    }
  }

  static class InnerStatic {
    int isv = 200;
  }
  interface InnerInterface {
    void innerMethod();
  }
}

