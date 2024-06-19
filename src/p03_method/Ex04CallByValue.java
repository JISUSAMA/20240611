package p03_method;

public class Ex04CallByValue {
  public static void main(String[] args) {
    String st; //선언만 할 경우,인스턴스가 참조형 변수의 구조만 설정됨
//    System.out.println(st); //초기화가 이루이지지 않아서 에러(Error)
    String str = "Hello";
    System.out.println(str);

    // 초기화가 이루어지지 않아서 주소값이 나옴 p03_method.Data@3b07d329
    Data d = new Data();
    d.value =100;
    change(500); //18번 라인 호출
    change(d); //data 라는 참조형 변수를 넘겨줌 /22번 라인 호출
    change(d.value); //data 변수 값을 넘겨줌 /18번 라인 호출
    change((int)1.12f); //기본형 타입의 명시적 형변환
    System.out.println(d.value);
  }
  //값을 받는것
  static void change(int value){
    value = 1000;
  }
  //참조형 변수를 받는 것
  static void change(Data data){
    data.value = 1000;
    System.out.println("change: "+data); //주소값 출력 change: p03_method.Data@682a0b20
    System.out.println("change value: "+data.value); //값 출력
  }
}
//class 가 참조형 변수라서 인스턴스를 가져왔을때 주소값을 가져옴
class Data{
  int value;
}
