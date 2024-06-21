package p05_Inherit;

public class Ex04Casting {
  public static void main(String[] args) {
    Father f1= new Father();
    Son s1= new Son();
    s1.hard();
    //상속관계의 형변환
    Father f2 = new Son();//자식 -> 부모 형변환이 일어나서 가능함
    //Son s2 = new Father(); //부모 -> 자식 Error :: s2 >= f2
    //Son s2 = (Son)new Father(); //실행 시 ,Error :: s2 >= f2
    Son s3  = (Son)f2; //자식 -> 부모 -> 자식

/*    상속관계의 형변환에서 중복이 일어나는 경우,
        속성값은 타입의 값을 가진다
    메서드는 무조건 자식의 메서드를 따른다*/
    f2.hard();
    System.out.println(f2.age);
    s3.hard();
    System.out.println(s3.age);
  }
}

class Father {
  String familyName;
  int age=50;
  void hard() {
    System.out.println("아버지의 열심");
  }
}

class Son extends Father {
  int age=20;
  void hard() {
    System.out.println("아들의 열심");
  }
}
