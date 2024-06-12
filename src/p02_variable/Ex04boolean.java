package p02_variable;

//byte , short, int ,long
//java에서는 연산때 4바이트 사용
class TV {
  boolean power;
  int chanel;
  int volume;
}
public class Ex04boolean {
  public static void main(String[] args) {
    TV tv1 = new TV();
    tv1.power = true;
  }
}
