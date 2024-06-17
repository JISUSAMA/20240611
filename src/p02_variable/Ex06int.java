package p02_variable;
import common.Utils;

public class Ex06int {
  public static void main(String[] args) {
    byte b1 = 100;
    //자신이 표현할수 있는 범위를 넘어서면 에러 발생
    //byte b2 = 200;
    byte b3 = 100;
    Utils.typeOf(b1 + b3);
    //byte b4 = b1+b3;
    byte b4 = (byte)(b1 +b3);
    System.out.println(b1 +b3);
    Utils.typeOf(b4);
    System.out.println(b4);

    //boolean을 제외한 4byte 이하 자료형은 int로 변환후 연산
    short s1 = 1000;
    short s2 = 1000;
    //  short s3 = s1+s2;
    //명시적 형변환 short = int
    //큰범위가 작은 범위로 들어오기 때문에 반드시 형을 명시 해주어야한다
    short s3 = (short)(s1+s2);
    Utils.typeOf(s1+s2);
    System.out.println(s3);

    int i1 = s1 +s2;
    Utils.typeOf(s1+s2);

    // long l1 =(long)200; long이 앞에 생략됨 - 묵시적 형변환
    //표현범위가 작은것이 큰것으로 올때는 묵시적 형변환 으로 생략이 가능하다
    long l1 = 200;  // long = int 타입
    long l2 = 200L; // long = long 타입

    //int i2 = l2;
    int i2 = (int)l2; //int < long , 명시적으로 작성해야함
    long  result = i2 +l1;
    Utils.typeOf(result); //long 자료형과 연산을 할 경우, Long 타입으로 형변환

    int i3 = b1; //int = byte :: 묵시적 형변환(int 표현범위가 큼)
    byte b5 = (byte)i3; //byte = int :: 명시적 형변환
  }
}
