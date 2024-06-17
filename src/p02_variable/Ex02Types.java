package p02_variable;

import org.w3c.dom.ls.LSOutput;
import p01_class.Animal;

import java.util.Locale;

public class Ex02Types {
  boolean power;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal animal;


  /*
변수의 할당 = 선언 +초기화
멤버변수는 선언만 new연산자(생성자)를 통해 기본값으로 초기화
멤버변수가 할당이 된 것은 new 에서 제외
*/
  //static 이 붙은건 프로그래밍의 시작점으로 파일을 실행하기 전에 불러옴
  static int sum;
  int total;


  public static void main(String[] args) {

    //변수의 종류: Primitive - 일반(기본) 변수, Reference - 참조 변수
    //Primitive type ( 일반 변수는 실제 값을 가짐 )
    boolean power = true; //논리형 true, false 1byte(8bit)
    char c1 = 'A';  // 문자형, 2byte, 0 ~ 65535 ->Char는 오로지 한글자만 입력가능
    byte b1 = 10; // 정수형 , 1byte, -128~127
    short s1 = 10; //정수형,2byte,-32768~32767
    int i1 = 10; //정수형,4byte,-2147483648~2147483647
    long l1 = 10L; //정수형,8byte,-61경~
    float f1 = 0.1f; //실수형,4byte,소수점 7째 자리까지,표현 범위 : 10^-45~10^38
    double d1 = 0.1d; //실수형,8byte,소수점 13째 자리까지, 표현 범위 : 10^-324~10^308

    //Reference type(참조형 변수, 주소값을 가짐)
    String str = "Hello";
    System.out.println(str);
    Animal animal = new Animal();
    System.out.println(animal);

    /*----------------------------------------------------------------------------*/
    //생성자 - 인스턴스를 기본값으로 초기화해주는것
    Ex02Types ex2 = new Ex02Types();
    System.out.println(ex2.power);
    System.out.println(ex2.c1);
    System.out.println(ex2.b1);
    System.out.println(ex2.s1);
    System.out.println(ex2.i1);
    System.out.println(ex2.l1);
    System.out.println(ex2.f1);
    System.out.println(ex2.d1);
    System.out.println(ex2.str);
    System.out.println(ex2.animal);


    //지역변수를 사용하기 위해서는 반드시 할당을 해야함
    //전역변수를 사용하기 위해서는 인스턴스를 만들어야 한다
    int plus = 10;
    System.out.println(plus);

    //main 메소드는 static 메소드로
    //static 변수의 전역변수만 사용이 가능하다
    System.out.println(sum);
    //System.out.println(total);

    Ex02Types ex3 = new Ex02Types();
    System.out.println(ex3.total);

  }
}
