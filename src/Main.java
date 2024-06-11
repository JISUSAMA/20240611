// input/output 이 반드시 존재함,
// 프로그래밍 언어의 프로세스 : 연산, 조건, 반복
//Pyton의 특징 : [간단] 해야함, JAVA의 특징: [명확] 해야함
//객체 : 실제를 개념화(Employee) => 특징(속성:이름,입사일,직업)/기능(출근했는가?,점심시간인가?) 의 모음
//Table (sql) -> class (java)
//객체의 속성 = Class에서의 멤버변수와 같음
//객체 기능 = class method(메서드)
//물리적세계 -> (개념화) -> 객체 : 속성, 기능 -> (코드화) -> 클래스 : 멤버변수, 메서드

//클래스는 멤버변수랑 메서드만 선언이 가능하다
public class Main {
  //(멤버)변수 선언
  int num1 = 10;
  int num2 = 20;
  int num3 = num1 + num2;

  void done() {
    //sout + Enter =  System.out.println() 자동완성
    System.out.println(num3);
    //메서드 안에서만 기능 선언이 가능하다
    if (num1 < num2) {
      num3 = num1;
    } else {
      num3 = num2;
    }
  }
  //실행 ctrl +shift +f10
  //메인 메서드 : jvm(자바 가상 머신) 위에서 돌아감,처음 시작점
  public static void main(String[] args) {
    Main main = new Main();
    main.done();
  }
}