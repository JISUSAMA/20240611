package p02_variable;

public class Ex01Location {
  //변수의 선언 위치 :: 전역, 지역
  int sum =2; //멤버변수는 전역(global variable)
  //int sum =1; // 중복 선언되어서 에러 발생, 같은 레벨에서는 동일한 이름 사용할 수 없음
  public void sum(){
    System.out.println("Global_sum :" + sum);
    int sum =1; //지역(local variable)
    System.out.println("Local_sum :" + sum);
  }

  public static void main(String[] args) {
    Ex01Location ex1 = new Ex01Location();
    System.out.println("Vsum :" + ex1.sum); //변수 출력
    ex1.sum(); //함수 실행
  }
}
